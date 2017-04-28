import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\installs\\geckodriver\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        NewIssuePage newIssuePage = new NewIssuePage(driver);

        loginPage.open("http://soft.it-hillel.com.ua:8080");
        loginPage.typeUsername("gubernatorova.sn");
        loginPage.typePassword("55555555");
        loginPage.clickOnLoginButton();

        headerPage.findSystemDashboard();
        headerPage.findCreate();
        headerPage.findSearch();

        newIssuePage.clickNewSubtaskButton();
        newIssuePage.fillSummary("Snizhanna test");
        newIssuePage.clickSubmitButton();

        //driver.quit();
    }
}
