import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewIssuePage {

    HeaderPage headerPage;

    By newSubtaskButtonLocator = By.id("stqc_show");
    By summaryLocator = By.id("summary");
    By submitButtonLocator = By.id("create-issue-submit");//create-issue-submit

    private final WebDriver driver;

    public NewIssuePage(WebDriver driver){
        this.driver = driver;
        headerPage = new HeaderPage(driver);
    }

    public NewIssuePage clickNewSubtaskButton () throws InterruptedException {
        headerPage.search("QAAUT-60");
        Thread.sleep(4000);//без sleep саб-таск открывается не в поп-апе, а как отдельная страница
        driver.findElement(newSubtaskButtonLocator).click();
        return this;
    }

    public NewIssuePage fillSummary (String summary) {
        System.out.println("Creating of new sub task...");
        waiting(summaryLocator);
        driver.findElement(summaryLocator).sendKeys(summary);
        return this;
    }

    public NewIssuePage clickSubmitButton () {
        driver.findElement(submitButtonLocator).click();
        System.out.println("Sub-task has been created successfully!");
        return this;
    }

    public NewIssuePage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}
