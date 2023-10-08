package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class Product {
    protected static String url = "https://fakestoreapi.com/";

    //Scenario: [Positive] - PRODUCT_GET all detail data product
    @Step("I GET API all product endpoints")
    public String setGetAllProductEndpoint(){
        return url + "products";
    }
    @Step("I GET HTTP request product data")
    public void getAllProductRequest(){
        SerenityRest.given().when().get(setGetAllProductEndpoint());
    }
    @Step("I receive valid user HTTP response code 200")
    public void responseAllProduct200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET all detail data product with invalid url
    @Step("I GET Wrong API all product endpoints")
    public String setGetAllProductEndpointUrl(){
        return url + "barang";
    }
    @Step("I GET HTTP request user data")
    public void getAllProductRequestUrl(){
        SerenityRest.given().when().get(setGetAllProductEndpointUrl());
    }
    @Step("I receive valid get all product HTTP response code 404")
    public void responseAllProduct404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_GET a single product with valid endpoint
    @Step("I GET API products with valid endpoint")
    public String setGetEndpoint(){
        return url + "products/1";
    }
    @Step("I GET HTTP request with valid endpoint")
    public void getHTTPRequest(){
        SerenityRest.given().when().get(setGetEndpoint());
    }
    @Step("I receive valid data for detail product")
    public void validResponse(){
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
    }
    @Step("I receive valid GET response code 200")
    public void responseGet200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET a single product with invalid endpoint
    @Step("I GET API products with invalid endpoints")
    public String getAPIProductInvalid() {
        return url + "product/1";
    }
    @Step("I GET HTTP request with invalid endpoint")
    public void getHTTPInvalidRequest() {
        SerenityRest.given().when().get(getAPIProductInvalid());
    }
    @Step("I receive invalid data for detail product")
    public void receiveInvalidDetailProduct() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET response code 404")
    public void receiveInvalidGETResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_GET limit result product with valid param
    @Step("I GET user limit result product with valid param")
    public String getValidLimitProduct() {
        return url + "products?limit=5";
    }
    @Step("I GET HTTP request limit result product with valid param")
    public void getInvalidRequestLimitProduct() {
        SerenityRest.given().when().get(getValidLimitProduct());
    }
    @Step("I receive limit result product with request param")
    public void receiveLimitProductRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result product response code 200")
    public void receiveInvalidLimitProductResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET limit result product with invalid param
    @Step("I GET user limit result product with invalid param")
    public String getLimitProductRequestInvalid() {
        return url + "product?limit=5";
    }
    @Step("I GET HTTP request limit result product with invalid param")
    public void getHTTPInvalidRequestWithLimitProduct() {
        SerenityRest.given().when().get(getLimitProductRequestInvalid());
    }
    @Step("I receive limit result product with invalid request param")
    public void receiveLimitProductWithInvalidRequest() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result product response code 404")
    public void receiveInvalidLimitResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_GET sort result product in descending with valid endpoint
    @Step("I GET API sort product result with valid endpoint")
    public String getAPISortProductWithValidEndpoint(){
        return url + "products?sort=desc";
    }
    @Step("I GET HTTP request sort product with valid endpoint")
    public void getHTTPValidRequestWithSortProduct(){
        SerenityRest.given().when().get(getAPISortProductWithValidEndpoint());
    }
    @Step("I receive valid GET sort result product descending response code 200")
    public void receiveValidGETSortProductResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET sort result product in descending with invalid endpoint
    @Step("I GET API sort product result with invalid endpoint")
    public String getAPISortProductWithInvalidEndpoint(){
        return url + "product?sort=desc";
    }
    @Step("I GET HTTP request sort product with invalid endpoint")
    public void getHTTPInvalidRequestWithSortProduct(){
        SerenityRest.given().when().get(getAPISortProductWithInvalidEndpoint());
    }
    @Step("I receive invalid GET sort result product descending response code 404")
    public void receiveInvalidGETSortProductResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_GET all categories product with valid endpoints
    @Step("I GET API all categories product endpoints")
    public String getAPIAllCategoriesProduct() {
        return url + "products/categories";
    }
    @Step("I GET HTTP request all categories product data")
    public void getHTTPrequestAllCategoriesProduct() {
        SerenityRest.given().when().get(getAPIAllCategoriesProduct());
    }
    @Step("I receive valid GET all categories product HTTP response code 200")
    public void receiveValidGETAllCategoriesResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET all categories product with invalid endpoint
    @Step("I GET API all categories product data invalid endpoints")
    public String getAPIAllCategoriesProductInvalid() {
        return url + "product/categories";
    }
    @Step("I GET HTTP request all categories product data invalid endpoints")
    public void getHTTPRequestAllCategoriesProductInvalid() {
        SerenityRest.given().when().get(getAPIAllCategoriesProductInvalid());
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product/categories</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET all categories product HTTP response code 404")
    public void receiveInvalidGETallCategoriesResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_GET in category product with valid endpoint
    @Step("I GET API category product valid endpoints")
    public String getCategoryProductValidEndpoint(){
        return url + "products/category/jewelry";
    }
    @Step("I GET HTTP request valid category product data")
    public void getHTTPRequestValidCategoryProduct(){
        SerenityRest.given().when().get(getCategoryProductValidEndpoint());
    }
    @Step("I receive valid GET category product response code 200")
    public void responseCategoryProduct200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_GET in category product with invalid endpoint
    @Step("I GET API category product invalid endpoints")
    public String getCategoryProductInvalidEndpoint() {
        return url + "product/category/jewelry";
    }
    @Step("I GET HTTP request invalid category product data")
    public void getHTTPRequestInvalidCategoryProduct() {
        SerenityRest.given().when().get(getCategoryProductInvalidEndpoint());
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /product/category/jewelry</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET category product response code 404")
    public void responseInvalidCategoryProduct404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_POST new product with valid data
    @Step("I POST API product endpoints")
    public String setPostEndpoint(){
        return url + "products";
    }
    @Step("I POST HTTP request with valid data")
    public void postHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostEndpoint());
    }
    @Step("I receive valid data for new product")
    public void validBody(){
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
    }
    @Step("I receive valid HTTP response code 200")
    public void responsePost200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_POST new product with invalid data
    @Step("I POST the API product endpoints")
    public String setPostApiEndpoint(){
        return url + "barang";
    }
    @Step("I POST wrong HTTP request with valid data")
    public void postWrongHttpRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(setPostApiEndpoint())
                .then()
                .statusCode(404);
    }
    @Step("I receive invalid response code 404")
    public void responsePost404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //[Positive] - PRODUCT_PUT existing product with valid endpoints
    @Step("I PUT API with valid endpoints")
    public String setPutEndpoint(){
        return url + "products/7";
    }
    @Step("I PUT HTTP request with valid endpoints")
    public void putHTTPValidRequest(){
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setPutEndpoint());
    }
    @Step("I receive valid data for updated product")
    public void receiveValidUpdateData(){
        restAssuredThat(response -> response.body("id", equalTo(7)));
    }
    @Step("I receive valid PUT product response code 200")
    public void receiveValidProductPUTResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_PUT existing product with invalid endpoints
    @Step("I PUT API with invalid endpoints")
    public String setPutInvalidEndpoint() {
        return url + "product/7";
    }
    @Step("I PUT HTTP request with invalid endpoints")
    public void putHTTPInvalidRequest() {
        JSONObject body = new JSONObject();
        body.put("title","test product");
        body.put("price","13.5");
        body.put("description","lorem ipsum set");
        body.put("image","https://i.pravatar.cc");
        body.put("category","eceltronic");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setPutInvalidEndpoint());
    }
    @Step("I receive invalid data for updated product")
    public void receiveInvalidUpdatedProduct() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /product/7</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT response 404")
    public void receiveInvalidPUTResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - PRODUCT_DELETE existing product with valid id
    @Step("I DELETE API product with valid id endpoints")
    public String setDeleteProductWithValidIDEndpoint(){
        return url + "products/6";
    }
    @Step("I DELETE product HTTP request with valid id")
    public void deleteHTTPValidRequestWithProduct(){
        SerenityRest.given().when().delete(setDeleteProductWithValidIDEndpoint());
    }
    @Step("I receive valid DELETE product response code 200")
    public void receiveValidDELETEProductResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - PRODUCT_DELETE existing cart with invalid id
    @Step("I DELETE API product with invalid id endpoints")
    public String setDeleteProductWithInvalidIDEndpoint(){
        return url + "product/6";
    }
    @Step("I DELETE product HTTP request with invalid id")
    public void deleteHTTPInvalidRequestWithProduct(){
        SerenityRest.given().when().delete(setDeleteProductWithInvalidIDEndpoint());
    }
    @Step("I receive invalid DELETE product response code 404")
    public void receiveInvalidDELETEProductResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
