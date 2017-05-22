import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    By usernameLocator = By.id("login-form-username");
    By passwordLocator = By.id("login-form-password");
    By loginButtonLocator = By.id("login-form-submit"); //login-form-submit

    private WebDriver driver;

    public LoginPage() {
        this.driver = RemoteDriverManager.getDriver();

    }

    public void open() {
        driver.get("http://soft.it-hillel.com.ua:8080/login.jsp");
    }

    public void enterUsername() {
        driver.findElement(usernameLocator).sendKeys("gubernatorova.sn");
    }

    public void enterPassword() {
        driver.findElement(passwordLocator).sendKeys("11111111");
    }

    public void clickLogin() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //waiting(By.id("login-form-submit"));
        driver.findElement(loginButtonLocator).submit();
    }

    public LoginPage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }
}