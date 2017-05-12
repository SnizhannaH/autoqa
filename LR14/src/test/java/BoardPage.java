import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by guber on 11.05.2017.
 */
public class BoardPage {

    private final WebDriver driver;

    public BoardPage(WebDriver driver){
        this.driver = driver;
    }

    public BoardPage open (){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("http://soft.it-hillel.com.ua:8080/secure/RapidBoard.jspa?rapidView=13");
        return this;
    }

    public void dragAndDrop(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //WebElement source = driver.findElement(By.linkText("QAAUT-200"));
        WebElement source = driver.findElement(By.xpath("//*[contains(@title,'QAAUT-200')]/../.."));
        Actions actions = new Actions(driver);
        actions.moveToElement(source);
        actions.perform();
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(source, 100, 0).perform();

//        driver.findElement(By.id("login-form-submit")).click();
}
}
