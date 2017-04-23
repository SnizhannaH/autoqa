import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\installs\\geckodriver\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        String link = "http://soft.it-hillel.com.ua:8080";
        String name = "gubernatorova.sn";
        String password = "55555555";

        driver.get(link);

        driver.findElement(By.id("login-form-username")).sendKeys(name);
        driver.findElement(By.id("login-form-password")).sendKeys(password);
        driver.findElement(By.id("login")).click();

        driver.findElement(By.cssSelector("div.aui-page-header-main>h1")); //по name "System Dashboard" не ищет
        System.out.println("Element [System Dashboard] has been found");
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("create-menu")));
        System.out.println("Element [Create] has been found");
        driver.findElement(By.id("quicksearch"));
        System.out.println("Element [Search] has been found");

        driver.get("http://soft.it-hillel.com.ua:8080/browse/QAAUT-60");
        driver.findElement(By.id("stqc_show")).click();
        System.out.println("Creating of new sub task...");
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("summary")));
        driver.findElement(By.id("summary")).sendKeys("testSnizhanna");
        driver.findElement(By.id("create-issue-submit")).click();
        System.out.println("Sub-task has been created successfully!");

        //driver.quit();
    }
}