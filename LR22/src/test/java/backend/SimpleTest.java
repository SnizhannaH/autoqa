package backend;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ResponseBody;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class SimpleTest {

    String sessionId = "";

    @BeforeTest
    public void login() {
        RestAssured.baseURI = "http://soft.it-hillel.com.ua:8080";
        JiraJsonFixture jiraJsonFixture = new JiraJsonFixture();
        String loginJson = jiraJsonFixture.generateJSONForLogin();

//        String body = "{\n" +
//                "    \"username\": \"a.a.piluck\",\n" +
//                "    \"password\": \"111111\"\n" +
//                "} ";

        sessionId = given().
                header("Content-Type", "application/json").
                body(loginJson).
                when().
                post("/rest/auth/1/session").
                then().
                extract().
                path("session.value");

    }

    @Test(groups = {"functional", "backend"})
    public void subTaskCRUD() throws InterruptedException {
        String issueKey;
        RestAssured.baseURI = "http://soft.it-hillel.com.ua:8080";
        JiraJsonFixture jiraJsonFixture = new JiraJsonFixture();
        String issueJson = jiraJsonFixture.generateJSONForIssue();
        //header("JSESSIONID", sessionId).

        issueKey = given().
                header("Content-Type", "application/json").
                header("Cookie", "JSESSIONID="+ sessionId).
                body(issueJson).
                when().
                post("/rest/api/2/issue").
                then().
                extract().
                path("key");

        given().
                header("Content-Type", "application/json").
                header("Cookie", "JSESSIONID="+ sessionId).
                body(issueJson).
                when().
                delete("/rest/api/2/issue/" + issueKey).
                then();

    }

//    @Test(groups = {"functional", "backend"})
//    public void subTaskCommentCRUD() throws InterruptedException {
//
//
//    }
}