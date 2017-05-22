import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage {

    By systemDashboardLocator = By.cssSelector("div.aui-page-header-main>h1");
    By createLocator = By.id("create-menu");
    By searchLocator = By.id("quickSearchInput");

    private WebDriver driver;

    public HeaderPage(){
        this.driver = RemoteDriverManager.getDriver();
    }

    public HeaderPage search (String searchWord){
       // waiting(searchLocator);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        WebElement element = driver.findElement(searchLocator);
        element.sendKeys(searchWord);
        element.submit();
        return this;
    }

    public HeaderPage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}