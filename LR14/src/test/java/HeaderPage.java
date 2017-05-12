import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage {

    By systemDashboardLocator = By.cssSelector("div.aui-page-header-main>h1");
    By createLocator = By.id("create-menu");
    By searchLocator = By.id("quickSearchInput");

    private final WebDriver driver;

    public HeaderPage(WebDriver driver){
        this.driver = driver;
    }

    public HeaderPage findSystemDashboard (){
        driver.findElement(systemDashboardLocator);
        System.out.println("Element [System Dashboard] has been found");
        return this;
    }

    public HeaderPage findCreate (){
        waiting(createLocator);
        System.out.println("Element [Create] has been found");
        return this;
    }

    public HeaderPage findSearch (){
        driver.findElement(searchLocator);
        System.out.println("Element [Search] has been found");
        return this;
    }

    public HeaderPage search (String searchWord){
        waiting(searchLocator);
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
