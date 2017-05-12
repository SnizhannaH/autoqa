import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", Constants.driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);

        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        NewIssuePage newIssuePage = new NewIssuePage(driver);
        BoardPage boardPage = new BoardPage(driver);
        // Login to JIRA
        loginPage
                .open(Constants.uri)
                .typeUsername("gubernatorova.sn")
                .typePassword("55555555")
                .clickOnLoginButton();

        // Create new sub-task
        newIssuePage
                .openNewSubtask()
                .fillSummary("Snizhanna test7")
                .clickSubmitButton();

//        // Open and delete sub-task
        newIssuePage
                .openSubtask()
                .clickMoreButton()
                .clickDeleteListItem()
                .deleteSubtask();

        //Drag and drop
        boardPage.open()
                 .dragAndDrop();

//        driver.quit(); .ghx-selected
    }
}

/*headerPage.findSystemDashboard();
headerPage.findCreate();
headerPage.findSearch();*/