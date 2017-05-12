import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    By usernameLocator = By.id("login-form-username");
    By passwordLocator = By.id("login-form-password");
    By loginButtonLocator = By.id("login");

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage open (String url){
        driver.get(url);
        return this;
    }

    public LoginPage typeUsername (String username){
        waiting(usernameLocator);
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword (String password) {
        waiting(passwordLocator);
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginButton () {
        waiting(loginButtonLocator);
        driver.findElement(loginButtonLocator).click();
        return this;
    }

    public LoginPage waiting(By locator){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }

}
