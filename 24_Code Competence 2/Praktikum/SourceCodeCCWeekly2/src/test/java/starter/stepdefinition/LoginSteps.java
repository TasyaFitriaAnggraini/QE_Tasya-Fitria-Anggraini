package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    //Scenario: [Positive] - LOGIN_As admin I have be able to login
    @Given("I set POST endpoints url")
    public void setGetEndpointsUrl(){
        login.setPostEndpoints();
    }
    @When("I send POST HTTP request url")
    public void postHTTPrequest(){
        login.postHTTPrequest();
    }
    @Then("I received status code 201 and token")
    public void response(){
        login.response();
    }

    //Scenario: [Negative] - LOGIN_As admin I can't login with missing data
    @Given("I set wrong POST endpoints")
    public void setGetEndpoints(){
        login.setWrongPostEndpoint();
    }
    @When("Username and password is empty")
    public void getHTTPrequest(){
        login.getInvalidHTTPRequest();
    }
    @Then("I receive invalid HTTP response code 400")
    public void invalidLoginResponse(){
        login.invalidResponse();
    }
}
