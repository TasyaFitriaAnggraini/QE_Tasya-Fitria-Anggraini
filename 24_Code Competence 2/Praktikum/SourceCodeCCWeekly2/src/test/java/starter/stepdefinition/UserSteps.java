package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.login.User;

public class UserSteps {
    @Steps
    User user;

    //Scenario: [Positive] - USER_ GET all detail data user with valid url
    @Given("I GET API all detail data user with valid url")
    public void getValidAPIAllDetailDataUser() {
        user.getValidAPIAllDetailDataUser();
    }
    @When("I GET HTTP request all detail data user with valid url")
    public void getHTTPValidRequestAllDetailDataUser() {
        user.getHTTPValidRequestAllDetailDataUser();
    }
    @Then("I receive valid GET all detail data user response code 200")
    public void receiveValidAllDetailDataUserResponseCode200() {
        user.receiveValidAllDetailDataUserResponseCode200();
    }

    //Scenario: [Negative] - USER_GET all detail data cart with invalid url
    @Given("I GET API all detail data user with invalid endpoints")
    public void getInvalidAPIAllDetailDataUser() {
        user.getInvalidAPIAllDetailDataUser();
    }
    @When("I GET HTTP request all detail data user with invalid url")
    public void getHTTPInvalidRequestAllDetailDataUser() {
        user.getHTTPInvalidRequestAllDetailDataUser();
    }
    @Then("I receive invalid GET all detail data user response code 404")
    public void receiveInvalidAllDetailDataUserResponseCode404() {
        user.receiveInvalidAllDetailDataUserResponseCode404();
    }

    //Scenario: [Positive] - USER_GET a single user with valid endpoints
    @Given("I GET API single user with valid endpoints")
    public void getSingleUserValidEndpoint() {
        user.getSingleUserValidEndpoint();
    }
    @When("I GET HTTP request single user with valid endpoints")
    public void getSingleUserValidRequest(){
        user.getSingleUserValidRequest();
    }
    @And("I receive valid data for single user")
    public void receiveValidDataForSingleUser(){
        user.receiveValidDataForSingleUser();
    }
    @Then("I receive valid GET single user response code 200")
    public void receiveValidSingleUserResponseCode200(){
        user.receiveValidSingleUserResponseCode200();
    }

    //Scenario: [Negative] - USER_GET a single user with invalid endpoints
    @Given("I GET API single user with invalid endpoints")
    public void getSingleUserInvalidEndpoint() {
        user.getSingleUserInvalidEndpoint();
    }
    @When("I GET HTTP request single user with invalid endpoints")
    public void getSingleUserInvalidRequest() {
        user.getSingleUserInvalidRequest();
    }
    @And("I receive invalid data for single user")
    public void receiveInvalidDataForSingleUser() {
        user.receiveInvalidDataForSingleUser();
    }
    @Then("I receive invalid GET single user response code 404")
    public void receiveInvalidSingleUserResponseCode404(){
        user.receiveInvalidSingleUserResponseCode404();
    }

    //Scenario: [Positive] - USER_GET limit result with valid param
    @Given("I GET user limit result")
    public void getLimitUserRequest() {
        user.getLimitUserRequest();
    }
    @When("I GET HTTP request with valid param")
    public void getHTTPRequestWithLimitUserParam() {
        user.getHTTPRequestWithLimitUserParam();
    }
    @And("I receive limit result with request param")
    public void receiveLimitResultWithRequestParam() {
        user.receiveLimitResultWithRequestParam();
    }
    @Then("I receive valid GET limit result response code 200")
    public void receiveValidLimitResponseCode200() {
        user.receiveValidLimitResponseCode200();
    }

    //Scenario: [Negative] - USER_GET limit result with invalid param
    @Given("I GET user limit result invalid param")
    public void getLimitUserRequestInvalid() {
        user.getLimitUserRequestInvalid();
    }
    @When("I GET HTTP request with invalid param")
    public void getHTTPInvalidRequestWithLimitParam() {
        user.getHTTPInvalidRequestWithLimitParam();
    }
    @And("I receive limit result with invalid request param")
    public void receiveLimitResultWithInvalidRequestParam() {
        user.receiveLimitResultWithInvalidRequestParam();
    }
    @Then("I receive invalid GET limit result response code 404")
    public void receiveInvalidLimitResponseCode404() {
        user.receiveInvalidLimitResponseCode404();
    }

    //Scenario: [Positive] - USER_GET sort result user in descending with valid endpoint
    @Given("I GET API user sort result with valid endpoint")
    public void getSortUserValidEndpoint() {
        user.getSortUserValidEndpoint();
    }
    @When("I GET HTTP request sort user with valid endpoint")
    public void getHTTPValidRequestSortUser() {
        user.getHTTPValidRequestSortUser();
    }
    @Then("I receive valid GET sort result user descending response code 200")
    public void receiveValidResponseSortUser200(){
        user.receiveValidResponseSortUser200();
    }

    //Scenario: [Negative] - USER_GET sort result user in descending with invalid endpoint
    @Given("I GET API user sort result with invalid endpoint")
    public void getSortUserInvalidEndpoint() {
        user.getSortUserInvalidEndpoint();
    }
    @When("I GET HTTP request sort user with invalid endpoint")
    public void getHTTPInvalidRequestSortUser() {
        user.getHTTPInvalidRequestSortUser();
    }
    @Then("I receive invalid GET sort result user descending response code 404")
    public void receiveInvalidResponseSortUser404() {
        user.receiveInvalidResponseSortUser404();
    }

    //Scenario: [Positive] - USER_POST new product with valid data
    @Given("I access POST API user endpoints")
    public void setPostUserEndpoint(){
        user.setPostUserEndpoint();
    }
    @When("I POST HTTP request with a valid data")
    public void postUserHTTPRequest(){
        user.postUserHTTPRequest();
    }
    @And("I receive valid data for new user")
    public void validResponsePostUser(){
        user.validResponsePostUser();
    }
    @Then("I receive an valid POST response code 200")
    public void receiveResponsePostUser200(){
        user.receiveResponsePostUser200();
    }

    //Scenario: [Negative] - USER_POST new product with invalid data
    @Given("I POST the API user endpoints invalid")
    public void postAPIUserEndpointsInvalid() {
        user.postAPIUserEndpointsInvalid();
    }
    @When("I POST HTTP request with an invalid data")
    public void postHTTPRequestInvalidData() {
        user.postUserInvalidHTTPRequest();
    }
    @And("I failed to receive data")
    public void failedReceiveData() {
        user.failedReceiveData();
    }
    @Then("I receive invalid POST response code 404")
    public void receiveInvalidPOSTResponseCode404() {
        user.receiveInvalidPOSTResponseCode404();
    }

    //Scenario: [Positive] - USER_PUT existing user with valid endpoints
    @Given("I PUT API user with valid endpoints")
    public void putUserValidEndpoint(){
        user.putUserValidEndpoint();
    }
    @When("I PUT an HTTP request with valid endpoints")
    public void putUserValidRequest(){
        user.putUserValidRequest();
    }
    @And("I receive valid data for updated user")
    public void receiveValidDataUpdatedUser(){
        user.receiveValidDataUpdatedUser();
    }
    @Then("I receive valid PUT response code 200")
    public void receivePUTValidResponseCode200() {
        user.receivePUTValidResponseCode200();
    }

    // Scenario: [Negative] - USER_PUT existing user with invalid endpoints
    @Given("I PUT API user with invalid endpoints")
    public void putUserInvalidEndpoint() {
        user.putUserInvalidEndpoint();
    }
    @When("I PUT an HTTP request with invalid endpoints")
    public void putUserInvalidRequest() {
        user.putUserInvalidRequest();
    }
    @And("I receive invalid data for updated user")
    public void receiveInvalidDataUpdatedUser() {
        user.receiveInvalidDataUpdatedUser();
    }
    @Then("I receive invalid PUT response code 404")
    public void receivePUTInvalidResponseCode404() {
        user.receivePUTInvalidResponseCode404();
    }

    //Scenario: [Positive] - USER_DELETE existing user with valid id
    @Given("I DELETE API user with valid id endpoints")
    public void setDeleteUserValidIDEndpoint(){
        user.setDeleteUserValidIDEndpoint();
    }
    @When("I DELETE user HTTP request with valid id")
    public void deleteUserValidRequest(){
        user.deleteUserValidRequest();
    }
    @Then("I receive valid DELETE user response code 200")
    public void receiveValidDELETEresponseCode200(){
        user.receiveValidDELETEresponseCode200();
    }

    //Scenario: [Negative] - USER_DELETE existing user with invalid id
    @Given("I DELETE API user with invalid id endpoints")
    public void setDeleteUserInvalidEndpoint() {
        user.setDeleteUserInvalidEndpoint();
    }
    @When("I DELETE user HTTP request with invalid id")
    public void deleteUserInvalidRequest() {
        user.deleteUserInvalidRequest();
    }
    @Then("I receive invalid DELETE user response code 404")
    public void receiveInvalidDELETEresponseCode404() {
        user.receiveInvalidDELETEresponseCode404();
    }
}
