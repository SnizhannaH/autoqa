import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewIssuePage {

    HeaderPage headerPage;

    By newSubtaskButtonLocator = By.id("stqc_show");
    By summaryLocator = By.id("summary");
    By submitButtonLocator = By.id("create-issue-submit");
    By subtaskLocator = By.linkText("Snizhanna test7");
    By moreButtonLocator = By.id("opsbar-operations_more");
    By deleteListItemLocator = By.id("delete-issue");
    By deleteButtonLocator = By.id("delete-issue-submit");

    private final WebDriver driver;

    public NewIssuePage(WebDriver driver){
        this.driver = driver;
        headerPage = new HeaderPage(driver);
    }

    public NewIssuePage openNewSubtask() throws InterruptedException {
        headerPage.search("QAAUT-201");
        Thread.sleep(5000);//без sleep саб-таск открывается не в поп-апе, а как отдельная страница
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

    public NewIssuePage openSubtask() throws InterruptedException {
        waiting(subtaskLocator);
        // Thread.sleep(3000);
        WebElement element = driver.findElement(subtaskLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        element.click();
        return this;
    }

    public NewIssuePage clickMoreButton() {
        waiting(moreButtonLocator);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");
        WebElement element= driver.findElement(moreButtonLocator);
        element.click();
        return this;
    }

    public NewIssuePage clickDeleteListItem() {
        driver.findElement(deleteListItemLocator).click();
        return this;
    }

    public NewIssuePage deleteSubtask() {
        waiting(deleteButtonLocator);
        driver.findElement(deleteButtonLocator).click();
        return this;
    }

    public NewIssuePage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}
