import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

//    @Parameters({"myParam"})
//    @Test(groups = {"functest"})
//    public void testMethod1(String myParam) {
//        // System.out.println("I got a parameter: " + myParam);
//        Assert.assertTrue(false);
//    }

    @Test(groups = {"functest"})
    public void loginCreateDeleteTest() throws InterruptedException {
        //Login
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();

        //Create new sub-task
        NewIssuePage newIssuePage = new NewIssuePage();
        newIssuePage.openNewSubtask();
        newIssuePage.fillSummary("Snizhanna test10");
        newIssuePage.clickSubmitButton();

        //Delete new sub-task
        newIssuePage.openSubtask();
        newIssuePage.clickMoreButton();
        newIssuePage.clickDeleteListItem();
        newIssuePage.deleteSubtask();
    }
    }