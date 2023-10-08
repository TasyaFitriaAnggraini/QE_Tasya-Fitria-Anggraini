package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.login.Cart;

public class CartSteps {
    @Steps
    Cart cart;

    //Scenario: [Positive] - CART_ GET all detail data cart with valid endpoints
    @Given("I GET API all cart with valid endpoints")
    public void getAPIAllCartValidEndpoint(){
        cart.getAPIAllCartValidEndpoint();
    }
    @When("I GET HTTP request all cart data with valid endpoints")
    public void getRequestAllCartWithValidEndpoint(){
        cart.getRequestAllCartWithValidEndpoint();
    }
    @Then("I receive valid GET all cart response code 200")
    public void eceiveValidGETAllCartResponseCode200(){
        cart.receiveValidGETAllCartResponseCode200();
    }

    //Scenario: [Negative] - CART_GET all detail data cart with invalid endpoints
    @Given("I GET API all cart with invalid endpoints")
    public void getAPIAllCartInvalidEndpointUrl() {
        cart.getAPIAllCartInvalidEndpointUrl();
    }
    @When("I GET HTTP request all cart data with invalid endpoints")
    public void getRequestAllCartWithInvalidRequestUrl() {
        cart.getRequestAllCartWithInvalidRequestUrl();
    }
    @Then("I receive invalid GET all cart response code 404")
    public void receiveInvalidGETAllCartResponseCode404(){
        cart.receiveInvalidGETAllCartResponseCode404();
    }

    //Scenario: [Positive] - CART_GET a single cart with valid url
    @Given("I GET API single cart with valid url")
    public void getAPISingleCartValidURL(){
        cart.getAPISingleCartValidURL();
    }
    @When("I GET HTTP request single cart data with valid url")
    public void getRequestSingleCartValidURL(){
        cart.getRequestSingleCartValidURL();
    }
    @And("I receive valid data for single cart")
    public void receiveValidDataForSingleUser(){
        cart.receiveValidDataForSingleUser();
    }
    @Then("I receive valid GET single cart response code 200")
    public void receiveValidGETSingleCartResponseCode200(){
        cart.receiveValidGETSingleCartResponseCode200();
    }

    //Scenario: [Negative] - CART_GET a single cart with invalid url
    @Given("I GET API single cart with invalid url")
    public void setGetUserCartEndpoint(){
        cart.setGetUserCartEndpoint();
    }
    @When("I GET HTTP request single cart data with invalid url")
    public void getUserCartRequest(){
        cart.getUserCartRequest();
    }
    @And("I receive invalid data for single cart")
    public void receiveInvalidDataForSingleUser(){
        cart.receiveInvalidDataForSingleUser();
    }
    @Then("I receive invalid GET single cart response code 404")
    public void responseUserCartValid404(){
        cart.responseUserCart404();
    }

    //Scenario: [Positive] - CART_GET limit result cart with valid param
    @Given("I GET user limit result cart with valid param")
    public void getLimitCartValidRequest() {
        cart.getLimitCartValidRequest();
    }
    @When("I GET HTTP request limit result cart with valid param")
    public void getHTTPValidRequestWithLimitCartParam() {
        cart.getHTTPValidRequestWithLimitCartParam();
    }
    @And("I receive limit result cart with request param")
    public void receiveLimitCartWithValidRequestParam() {
        cart.receiveLimitCartWithValidRequestParam();
    }
    @Then("I receive valid GET limit result cart response code 200")
    public void receiveValidLimitCartResponseCode200() {
        cart.receiveValidLimitCartResponseCode200();
    }

    //Scenario: [Negative] - CART_GET limit result cart with invalid param
    @Given("I GET user limit result cart with invalid param")
    public void getLimitCartInvalidRequest() {
        cart.getLimitCartInvalidRequest();
    }
    @When("I GET HTTP request limit result cart with invalid param")
    public void getHTTPInvalidRequestWithLimitCartParam() {
        cart.getHTTPInvalidRequestWithLimitCartParam();
    }
    @And("I receive limit result cart with invalid request param")
    public void receiveLimitCartWitInvalidhRequestParam() {
            cart.receiveLimitCartWitInvalidhRequestParam();
        }
    @Then("I receive invalid GET limit result cart response code 404")
    public void receiveInvalidLimitCartResponseCode404() {
            cart.receiveInvalidLimitCartResponseCode404();
        }

    //Scenario: [Positive] - CART_GET sort result cart in descending with valid endpoint
    @Given("I GET API sort cart result with valid endpoint")
    public void getAPISortCartWithValidEndpoint(){
        cart.getAPISortCartWithValidEndpoint();
    }
    @When("I GET HTTP request sort cart with valid endpoint")
    public void getHTTPValidRequestSortCart() {
        cart.getHTTPValidRequestSortCart();
    }
    @Then("I receive valid GET sort result cart descending response code 200")
    public void receiveValidGETSortCartResponseCode200(){
        cart.receiveValidGETSortCartResponseCode200();
    }

    //Scenario: [Negative] - CART_GET sort result cart in descending with invalid endpoint
    @Given("I GET API cart sort result with invalid endpoint")
    public void getAPISortCartWithInvalidEndpoint(){
        cart.getAPISortCartWithInvalidEndpoint();
    }
    @When("I GET HTTP request sort cart with invalid endpoint")
    public void getHTTPInvalidRequestSortCart() {
        cart.getHTTPInvalidRequestSortCart();
    }
    @Then("I receive invalid GET sort result cart descending response code 404")
    public void receiveInvalidGETSortCartResponseCode404(){
        cart.receiveInvalidGETSortCartResponseCode404();
    }

    //Scenario: [Positive] - CART_GET in date range cart with valid data
    @Given("I GET API in date range cart param with valid data")
    public void getAPIDateRangeCartWithValidData(){
        cart.getAPIDateRangeCartWithValidData();
    }
    @When("I GET HTTP request data range cart param with valid data")
    public void getHTTPRequestValidWithDataRangeCart() {
        cart.getHTTPRequestValidWithDataRangeCart();
    }
    @And("I receive valid data with data range cart param")
    public void receiveValidDataRange() {
        cart.receiveValidDataRange();
    }
    @Then("I receive valid GET data range cart response code 200")
    public void receiveValidGETDataRangeCartResponseCode200() {
        cart.receiveValidGETDataRangeCartResponseCode200();
    }

    //Scenario: [Negative] - CART_GET in date range cart with invalid data
    @Given("I GET API in date range cart param with invalid data")
    public void getAPIDateRangeCartWithInvalidData(){
        cart.getAPIDateRangeCartWithInvalidData();
    }
    @When("I GET HTTP request data range cart param with invalid data")
    public void getHTTPRequestInvalidWithDataRangeCart() {
        cart.getHTTPRequestInvalidWithDataRangeCart();
    }
    @And("I receive invalid data with data range cart param")
    public void receiveInvalidDataRange() {
        cart.receiveInvalidDataRange();
    }
    @Then("I receive invalid GET data range cart response code 404")
    public void receiveInvalidGETDataRangeCartResponseCode404() {
        cart.receiveInvalidGETDataRangeCartResponseCode404();
    }

    //Scenario: [Negative] - CART_GET user cart with invalid data
    @Given("I GET API user cart with invalid data")
    public void getAPIUserCartWithInvalidData() {
        cart.getAPIUserCartWithInvalidData();
    }
    @When("I GET HTTP request user cart with invalid data")
    public void getHTTPRequestUserCartWithInvalidData() {
        cart.getHTTPRequestUserCartWithInvalidData();
    }
    @And("I receive invalid data with user cart")
    public void receiveInvalidDataWithUserCart() {
        cart.receiveInvalidDataWithUserCart();
    }
    @Then("I receive invalid GET user cart response code 400")
    public void receiveInvalidGETUserCartResponseCode400(){
        cart.receiveInvalidGETUserCartResponseCode400();
    }

    //Scenario: [Positive] - CART_POST new cart with valid data
    @Given("I POST API new cart with valid endpoints")
    public void postNewCartWithValidEndpoint(){
        cart.postNewCartWithValidEndpoint();
    }
    @When("I POST HTTP request with valid data cart")
    public void postRequestWithValidDataCart(){
        cart.postRequestWithValidDataCart();
    }
    @And("I receive valid data for new cart")
    public void receiveValidDataForNewCart(){
        cart.receiveValidDataForNewCart();
    }
    @Then("I receive valid POST new cart response code 200")
    public void receiveValidPOSTNewCartResponseCode200(){
        cart.receiveValidPOSTNewCartResponseCode200();
    }

    //Scenario: [Negative] - CART_POST new cart with invalid data
    @Given("I POST API new cart with invalid endpoints")
    public void postNewCartWithInvalidEndpoint() {
        cart.postNewCartWithInvalidEndpoint();
    }
    @When("I POST HTTP request with invalid data cart")
    public void postHTTPRequestWithInvalidDataCart(){
        cart.postHTTPRequestWithInvalidDataCart();
    }
    @And("I receive invalid data for new cart")
    public void receiveInvalidDataForNewCart(){
        cart.receiveInvalidDataForNewCart();
    }
    @Then("I receive invalid POST new cart response code 404")
    public void receiveInvalidPOSTNewCartResponseCode404(){
        cart.receiveInvalidPOSTNewCartResponseCode404();
    }

    //Scenario: [Positive] - CART_PUT existing cart with valid data
    @Given("I PUT cart API with valid endpoints")
    public void putCartWithValidEndpoint(){
        cart.putCartWithValidEndpoint();
    }
    @When("I PUT cart HTTP request with valid data cart")
    public void putCartRequestWithValidDataCart(){
        cart.putCartRequestWithValidDataCart();
    }
    @And("I receive valid data for updated cart")
    public void receiveValidDataForUpdatedCart(){
        cart.receiveValidDataForUpdatedCart();
    }
    @Then("I receive valid PUT cart response code 200")
    public void receiveValidPUTCartResponseCode200() {
        cart.receiveValidPUTCartResponseCode200();
    }

    //Scenario: [Negative] - CART_PUT existing cart with invalid data
    @Given("I PUT cart API with invalid endpoints")
    public void putCartWithInvalidEndpoint(){
        cart.putCartWithInvalidEndpoint();
    }
    @When("I PUT cart HTTP request with invalid data cart")
    public void putCartRequestWithInvalidDataCart(){
        cart.putCartRequestWithInvalidDataCart();
    }
    @And("I receive invalid data for updated cart")
    public void receiveInvalidDataForUpdatedCart(){
        cart.receiveInvalidDataForUpdatedCart();
    }
    @Then("I receive invalid PUT cart response code 404")
    public void receiveInvalidPUTCartResponseCode2404(){
        cart.receiveInvalidPUTCartResponseCode2404();
    }

    //Scenario: [Positive] - CART_DELETE existing cart with valid id
    @Given("I DELETE API cart with valid id endpoints")
    public void eleteAPICartWithValidIDEndpoint(){
        cart.deleteAPICartWithValidIDEndpoint();
    }
    @When("I DELETE cart HTTP request with valid id")
    public void deleteCartValidIDRequest(){
        cart.deleteCartValidIDRequest();
    }
    @Then("I receive valid DELETE cart response code 200")
    public void receiveValidDELETECartResponseCode200() {
        cart.receiveValidDELETECartResponseCode200();
    }

    //Scenario: [Negative] - CART_DELETE existing cart with invalid id
    @Given("I DELETE API cart with invalid id endpoints")
    public void deleteAPICartWithInvalidIDEndpoint(){
        cart.deleteAPICartWithInvalidIDEndpoint();
    }
    @When("I DELETE cart HTTP request with invalid id")
    public void deleteCartInvalidIDRequest(){
        cart.deleteCartInvalidIDRequest();
    }
    @Then("I receive invalid DELETE cart response code 404")
    public void receiveInvalidDELETECartResponseCode404() {
        cart.receiveInvalidDELETECartResponseCode404();
    }
}
