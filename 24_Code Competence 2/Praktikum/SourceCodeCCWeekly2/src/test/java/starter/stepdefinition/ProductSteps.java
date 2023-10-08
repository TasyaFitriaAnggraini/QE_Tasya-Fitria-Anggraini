package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.login.Product;

public class ProductSteps {
    @Steps
    Product product;

    //Scenario: [Positive] - PRODUCT_GET all detail data product
    @Given("I GET API all product endpoints")
    public void setGetAllProductEndpoint(){
        product.setGetAllProductEndpoint();
    }
    @When("I GET HTTP request all product data")
    public void getAllProductRequest(){
        product.getAllProductRequest();
    }
    @Then("I receive valid get all product HTTP response code 200")
    public void responseValid200(){
        product.responseAllProduct200();
    }

    //Scenario: [Negative] - PRODUCT_GET all detail data product with invalid url
    @Given("I GET Wrong API all product url endpoints")
    public void setGetAllProductEndpointUrl(){
        product.setGetAllProductEndpointUrl();
    }
    @When("I GET HTTP url request all product data")
    public void getAllProductRequestUrl(){
        product.getAllProductRequestUrl();
    }
    @Then("I receive valid get all product HTTP response code 404")
    public void responseUrlInvalid404(){
        product.responseAllProduct404();
    }

    //Scenario: [Positive] - PRODUCT_GET a single product with valid endpoint
    @Given("I GET API products with valid endpoint")
    public void setGetHTTPEndpoint(){
        product.setGetEndpoint();
    }
    @When("I GET HTTP request with valid endpoint")
    public void getHTTPrequestUrl(){
        product.getHTTPRequest();
    }
    @And("I receive valid data for detail product")
    public void validData(){
        product.validResponse();
    }
    @Then("I receive valid GET response code 200")
    public void response(){
        product.responseGet200();
    }

    //Scenario: [Negative] - PRODUCT_GET a single product with invalid endpoint
    @Given("I GET API products with invalid endpoints")
    public void getAPIProductInvalid() {
        product.getAPIProductInvalid();
    }
    @When("I GET HTTP request with invalid endpoint")
    public void getHTTPInvalidRequest() {
        product.getHTTPInvalidRequest();
    }
    @And("I receive invalid data for detail product")
    public void receiveInvalidDetailProduct() {
        product.receiveInvalidDetailProduct();
    }
    @Then("I receive invalid GET response code 404")
    public void receiveInvalidGETResponseCode404() {
        product.receiveInvalidGETResponseCode404();
    }

    //Scenario: [Positive] - PRODUCT_GET limit result product with valid param
    @Given("I GET user limit result product with valid param")
    public void getValidLimitProduct() {
        product.getValidLimitProduct();
    }
    @When("I GET HTTP request limit result product with valid param")
    public void getInvalidRequestLimitProduct() {
        product.getInvalidRequestLimitProduct();
    }
    @And("I receive limit result product with request param")
    public void receiveLimitProductRequestParam() {
        product.receiveLimitProductRequestParam();
    }
    @Then("I receive valid GET limit result product response code 200")
    public void receiveInvalidLimitProductResponseCode200() {
        product.receiveInvalidLimitProductResponseCode200();
    }

    //Scenario: [Negative] - PRODUCT_GET limit result product with invalid param
    @Given("I GET user limit result product with invalid param")
    public void getLimitProductRequestInvalid() {
        product.getLimitProductRequestInvalid();
    }
    @When("I GET HTTP request limit result product with invalid param")
    public void getHTTPInvalidRequestWithLimitProduct() {
        product.getHTTPInvalidRequestWithLimitProduct();
    }
    @And("I receive limit result product with invalid request param")
    public void receiveLimitProductWithInvalidRequest() {
        product.receiveLimitProductWithInvalidRequest();
    }
    @Then("I receive invalid GET limit result product response code 404")
    public void receiveInvalidLimitResponseCode404() {
        product.receiveInvalidLimitResponseCode404();
    }

    //Scenario: [Positive] - PRODUCT_GET sort result product in descending with valid endpoint
    @Given("I GET API sort product result with valid endpoint")
    public void getAPISortProductWithValidEndpoint(){
        product.getAPISortProductWithValidEndpoint();
    }
    @When("I GET HTTP request sort product with valid endpoint")
    public void getHTTPValidRequestWithSortProduct(){
        product.getHTTPValidRequestWithSortProduct();
    }
    @Then("I receive valid GET sort result product descending response code 200")
    public void receiveValidGETSortProductResponseCode200(){
        product.receiveValidGETSortProductResponseCode200();
    }

    //Scenario: [Negative] - PRODUCT_GET sort result product in descending with invalid endpoint
    @Given("I GET API sort product result with invalid endpoint")
    public void getAPISortProductWithInvalidEndpoint(){
        product.getAPISortProductWithInvalidEndpoint();
    }
    @When("I GET HTTP request sort product with invalid endpoint")
    public void getHTTPInvalidRequestWithSortProduct(){
        product.getHTTPInvalidRequestWithSortProduct();
    }
    @Then("I receive invalid GET sort result product descending response code 404")
    public void receiveInvalidGETSortProductResponseCode404(){
        product.receiveInvalidGETSortProductResponseCode404();
    }

    //Scenario: [Positive] - PRODUCT_GET all categories product with valid endpoints
    @Given("I GET API all categories product endpoints")
    public void getAPIAllCategoriesProduct() {
        product.getAPIAllCategoriesProduct();
    }
    @When("I GET HTTP request all categories product data")
    public void getHTTPrequestAllCategoriesProduct() {
        product.getHTTPrequestAllCategoriesProduct();
    }
    @Then("I receive valid GET all categories product HTTP response code 200")
    public void receiveValidGETAllCategoriesResponseCode200() {
        product.receiveValidGETAllCategoriesResponseCode200();
    }

    //Scenario: [Negative] - PRODUCT_GET all categories product with invalid endpoint
    @Given("I GET API all categories product data invalid endpoints")
    public void getAPIAllCategoriesProductInvalid() {
        product.getAPIAllCategoriesProductInvalid();
    }
    @When("I GET HTTP request all categories product data invalid endpoints")
    public void getHTTPRequestAllCategoriesProductInvalid() {
        product.getHTTPRequestAllCategoriesProductInvalid();
    }
    @Then("I receive invalid GET all categories product HTTP response code 404")
    public void receiveInvalidGETallCategoriesResponseCode404() {
        product.receiveInvalidGETallCategoriesResponseCode404();
    }

    //Scenario: [Positive] - PRODUCT_GET in category product with valid endpoint
    @Given("I GET API category product valid endpoints")
    public void getCategoryProductValidEndpoint() {
        product.getCategoryProductValidEndpoint();
    }
    @When("I GET HTTP request valid category product data")
    public void getHTTPRequestValidCategoryProduct() {
        product.getHTTPRequestValidCategoryProduct();
    }
    @Then("I receive valid GET category product response code 200")
    public void responseCategoriesProduct200() {
        product.responseCategoryProduct200();
    }

    //Scenario: [Negative] - PRODUCT_GET in category product with invalid endpoint
    @Given("I GET API category product invalid endpoints")
    public void getCategoryProductInvalidEndpoint() {
        product.getCategoryProductInvalidEndpoint();
    }
    @When("I GET HTTP request invalid category product data")
    public void getHTTPRequestInvalidCategoryProduct() {
        product.getHTTPRequestInvalidCategoryProduct();
    }
    @Then("I receive invalid GET category product response code 404")
    public void responseInvalidCategoryProduct404() {
        product.responseInvalidCategoryProduct404();
    }

    //Scenario: [Positive] - PRODUCT_POST new product with valid data
    @Given("I POST API product endpoints")
    public void setPostHTTPEndpoint(){
        product.setPostEndpoint();
    }
    @When("I POST HTTP request with valid data")
    public void postHTTPrequestUrl(){
        product.postHTTPRequest();
    }
    @And("I receive valid data for new product")
    public void validBody(){
        product.validBody();
    }
    @Then("I receive valid HTTP response 200")
    public void responsePost200(){
        product.responsePost200();
    }

    //Scenario: [Negative] - PRODUCT_POST new product with invalid data
    @Given("I POST the API product endpoints")
    public void setPostApiEndpoint(){
        product.setPostApiEndpoint();
    }
    @When("I POST wrong HTTP request with valid data")
    public void postWrongHttpRequest(){
        product.postWrongHttpRequest();
    }
    @Then("I receive invalid response code 404")
    public void validResponsePost404(){
        product.responsePost404();
    }

    //[Positive] - PRODUCT_PUT existing product with valid endpoints
    @Given("I PUT API with valid endpoints")
    public void setPutApiEndpoint(){
        product.setPutEndpoint();
    }
    @When("I PUT HTTP request with valid endpoints")
    public void putHTTPValidRequest() {
        product.putHTTPValidRequest();
    }
    @And("I receive valid data for updated product")
    public void receiveValidUpdateData() {
        product.receiveValidUpdateData();
    }
    @Then("I receive valid PUT product response code 200")
    public void receiveValidProductPUTResponseCode200() {
        product.receiveValidProductPUTResponseCode200();
    }

    //Scenario: [Negative] - PRODUCT_PUT existing product with invalid endpoints
    @Given("I PUT API with invalid endpoints")
    public void setPutInvalidEndpoint() {
        product.setPutInvalidEndpoint();
    }
    @When("I PUT HTTP request with invalid endpoints")
    public void putHTTPInvalidRequest() {
        product.putHTTPInvalidRequest();
    }
    @And("I receive invalid data for updated product")
    public void receiveInvalidUpdatedProduct() {
        product.receiveInvalidUpdatedProduct();
    }
    @Then("I receive invalid PUT response 404")
    public void receiveInvalidPUTResponseCode404() {
        product.receiveInvalidPUTResponseCode404();
    }

    //Scenario: [Positive] - PRODUCT_DELETE existing product with valid id
    @Given("I DELETE API product with valid id endpoints")
    public void setDeleteProductWithValidIDEndpoint(){
        product.setDeleteProductWithValidIDEndpoint();
    }
    @When("I DELETE product HTTP request with valid id")
    public void deleteHTTPValidRequestWithProduct(){
        product.deleteHTTPValidRequestWithProduct();
    }
    @Then("I receive valid DELETE product response code 200")
    public void receiveValidDELETEProductResponseCode200() {
        product.receiveValidDELETEProductResponseCode200();
    }

    //Scenario: [Negative] - PRODUCT_DELETE existing cart with invalid id
    @Given("I DELETE API product with invalid id endpoints")
    public void setDeleteProductWithInvalidIDEndpoint(){
        product.setDeleteProductWithInvalidIDEndpoint();
    }
    @When("I DELETE product HTTP request with invalid id")
    public void deleteHTTPInvalidRequestWithProduct(){
        product.deleteHTTPInvalidRequestWithProduct();
    }
    @Then("I receive invalid DELETE product response code 404")
    public void receiveInvalidDELETEProductResponseCode404() {
        product.receiveInvalidDELETEProductResponseCode404();
    }
}
