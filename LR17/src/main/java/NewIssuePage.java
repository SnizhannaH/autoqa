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
    By subtaskLocator = By.linkText("Snizhanna test");
    By moreButtonLocator = By.id("opsbar-operations_more");
    By deleteListItemLocator = By.id("delete-issue");
    By deleteButtonLocator = By.id("delete-issue-submit");

    private final WebDriver driver;

    public NewIssuePage(){
        this.driver = RemoteDriverManager.getDriver();
        headerPage = new HeaderPage();
    }

    public NewIssuePage openNewSubtask() throws InterruptedException {
        headerPage.search("QAAUT-329");
        //Thread.sleep(5000);//без sleep саб-таск открывается не в поп-апе, а как отдельная страница
        waiting(newSubtaskButtonLocator);
        driver.findElement(newSubtaskButtonLocator).click();
        return this;
    }

    public NewIssuePage fillSummary (String summary) {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //waiting(summaryLocator);
        driver.findElement(summaryLocator).sendKeys(summary);
        return this;
    }

    public NewIssuePage clickSubmitButton () {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.findElement(submitButtonLocator).click();
        System.out.println("Sub-task has been created successfully!");
        return this;
    }

    public NewIssuePage openSubtask() throws InterruptedException {

        //Thread.sleep(5000);
        waiting(subtaskLocator);
        WebElement element = driver.findElement(subtaskLocator);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();
        element.click();
        return this;
    }

    public NewIssuePage clickMoreButton() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        waiting(moreButtonLocator);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");
        WebElement element= driver.findElement(moreButtonLocator);
        element.click();
        return this;
    }

    public NewIssuePage clickDeleteListItem() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.findElement(deleteListItemLocator).click();
        return this;
    }

    public NewIssuePage deleteSubtask() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        waiting(deleteButtonLocator);
        driver.findElement(deleteButtonLocator).click();
        return this;
    }

    public NewIssuePage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}

