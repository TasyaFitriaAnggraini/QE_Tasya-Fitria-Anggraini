package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import org.junit.Assert;

public class Login {
    protected static String url = "https://fakestoreapi.com/";

    //Scenario: [Positive] - LOGIN_As admin I have be able to login
    @Step("I set POST endpoints url")
    public String setPostEndpoints(){
        return url + "auth/login";
    }
    @Step("I send POST HTTP request url")
    public void postHTTPrequest(){
        JSONObject body = new JSONObject();
        body.put("username","mor_2314");
        body.put("password","83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostEndpoints());
    }
    @Step("I received status code 200 and token")
    public void response(){
        restAssuredThat(response -> response.statusCode(200));
        String token = SerenityRest.then().extract().path("token");
        Assert.assertNotNull(token, "Token is not found in response");
        // Add assertion for the expected token value based on the received JSON response
    }

    //Scenario: [Negative] - LOGIN_As admin I can't login with missing data
    @Step("I set wrong POST endpoints")
    public String setWrongPostEndpoint(){
        return url + "/auth/login";
    }
    @Step("Username and password is empty")
    public void getInvalidHTTPRequest(){
        JSONObject body = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setWrongPostEndpoint());
    }
    @Step("Receive invalid HTTP response code 400")
    public void invalidResponse(){
        restAssuredThat(response -> response.statusCode(404));
        // Add assertion for the expected error response based on the received JSON response
    }
}
