package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

public class Cart {

    protected static String url = "https://fakestoreapi.com/";

    //Scenario: [Positive] - CART_ GET all detail data cart with valid endpoints
    @Step("I GET API all cart with valid endpoints")
    public String getAPIAllCartValidEndpoint(){
        return url + "carts";
    }

    @Step("I GET HTTP request all cart data with valid endpoints")
    public void getRequestAllCartWithValidEndpoint(){
        SerenityRest.given().when().get(getAPIAllCartValidEndpoint());
    }
    @Step("I receive valid GET all cart response code 200")
    public void receiveValidGETAllCartResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET all detail data cart with invalid endpoints
    @Step("I GET API all cart with invalid endpoints")
    public String getAPIAllCartInvalidEndpointUrl(){
        return url + "keranjang";
    }
    @Step("I GET HTTP request all cart data with invalid endpoints")
    public void getRequestAllCartWithInvalidRequestUrl(){
        SerenityRest.given().when().get(getAPIAllCartInvalidEndpointUrl());
    }
    @Step("I receive invalid GET all cart response code 404")
    public void receiveInvalidGETAllCartResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_GET a single cart with valid url
    @Step("I GET API single cart with valid url")
    public String getAPISingleCartValidURL(){
        return url + "carts/5";
    }
    @Step("I GET HTTP request single cart data with valid url")
    public void getRequestSingleCartValidURL(){
        SerenityRest.given().when().get(getAPISingleCartValidURL());
    }
    @Step("I receive valid data for single cart")
    public void receiveValidDataForSingleUser(){
        restAssuredThat(response -> response.body("'id'", equalTo(5)));
    }
    @Step("I receive valid GET single cart response code 200")
    public void receiveValidGETSingleCartResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET a single cart with invalid url
    @Step("I GET API single cart with invalid url")
    public String setGetUserCartEndpoint(){
        return url + "cart/5";
    }
    @Step("I GET HTTP request single cart data with invalid url")
    public void getUserCartRequest(){
        SerenityRest.given().when().get(setGetUserCartEndpoint());
    }
    @Step("I receive invalid data for single cart")
    public void receiveInvalidDataForSingleUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart/5</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET single cart response code 404")
    public void responseUserCart404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_GET limit result cart with valid param
    @Step("I GET user limit result cart with valid param")
    public String getLimitCartValidRequest() {
        return url + "carts?limit=5";
    }
    @Step("I GET HTTP request limit result cart with valid param")
    public void getHTTPValidRequestWithLimitCartParam() {
        SerenityRest.given().when().get(getLimitCartValidRequest());
    }
    @Step("I receive limit result cart with request param")
    public void receiveLimitCartWithValidRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result cart response code 200")
    public void receiveValidLimitCartResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET limit result cart with invalid param
    @Step("I GET user limit result cart with invalid param")
    public String getLimitCartInvalidRequest() {
        return url + "cart?limit=5";
    }
    @Step("I GET HTTP request limit result cart with invalid param")
    public void getHTTPInvalidRequestWithLimitCartParam() {
        SerenityRest.given().when().get(getLimitCartInvalidRequest());
    }
    @Step("I receive limit result cart with invalid request param")
    public void receiveLimitCartWitInvalidhRequestParam() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result cart response code 404")
    public void receiveInvalidLimitCartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_GET sort result cart in descending with valid endpoint
    @Step("I GET API sort cart result with valid endpoint")
    public String getAPISortCartWithValidEndpoint(){
        return url + "carts?sort=desc";
    }
    @Step("I GET HTTP request sort cart with valid endpoint")
    public void getHTTPValidRequestSortCart() {
        SerenityRest.given().when().get(getAPISortCartWithValidEndpoint());
    }
    @Step("I receive valid GET sort result cart descending response code 200")
    public void receiveValidGETSortCartResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET sort result cart in descending with invalid endpoint
    @Step("I GET API cart sort result with invalid endpoint")
    public String getAPISortCartWithInvalidEndpoint(){
        return url + "cart?sort=desc";
    }
    @Step("I GET HTTP request sort cart with invalid endpoint")
    public void getHTTPInvalidRequestSortCart() {
        SerenityRest.given().when().get(getAPISortCartWithInvalidEndpoint());
    }
    @Step("I receive invalid GET sort result cart descending response code 404")
    public void receiveInvalidGETSortCartResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_GET in date range cart with valid data
    @Step("I GET API in date range cart param with valid data")
    public String getAPIDateRangeCartWithValidData(){
        return url + "carts?startdate=2019-12-10&enddate=2020-10-10";
    }
    @Step("I GET HTTP request data range cart param with valid data")
    public void getHTTPRequestValidWithDataRangeCart() {
        SerenityRest.given().when().get(getAPIDateRangeCartWithValidData());
    }
    @Step("I receive valid data with data range cart param")
    public void receiveValidDataRange() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5, 6, 7)));
    }
    @Step("I receive valid GET data range cart response code 200")
    public void receiveValidGETDataRangeCartResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET in date range cart with invalid data
    @Step("I GET API in date range cart param with invalid data")
    public String getAPIDateRangeCartWithInvalidData(){
        return url + "cart?startdate=2019-12-10&enddate=2020-10-10";
    }
    @Step("I GET HTTP request data range cart param with invalid data")
    public void getHTTPRequestInvalidWithDataRangeCart() {
        SerenityRest.given().when().get(getAPIDateRangeCartWithInvalidData());
    }
    @Step("I receive invalid data with data range cart param")
    public void receiveInvalidDataRange() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /cart</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET data range cart response code 404")
    public void receiveInvalidGETDataRangeCartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_POST new cart with valid data
    @Step("I POST API new cart with valid endpoints")
    public String postNewCartWithValidEndpoint(){
        return url + "carts";
    }
    @Step("I POST HTTP request with valid data cart")
    public void postRequestWithValidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",5);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postNewCartWithValidEndpoint());
    }
    @Step("I receive valid data for new cart")
    public void receiveValidDataForNewCart(){
        restAssuredThat(response -> response.body("'userId'", equalTo(5)));
    }
    @Step("I receive valid POST new cart response code 200")
    public void receiveValidPOSTNewCartResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_GET user cart with invalid data
    @Step("I GET API user cart with invalid data")
    public String getAPIUserCartWithInvalidData() {
        return url + "carts/user/2";
    }
    @Step("I GET HTTP request user cart with invalid data")
    public void getHTTPRequestUserCartWithInvalidData() {
        SerenityRest.given().when().get(getAPIUserCartWithInvalidData());
    }
    @Step("I receive invalid data with user cart")
    public void receiveInvalidDataWithUserCart() {
        restAssuredThat(response -> response.body("status", equalTo("error")));
    }
    @Step("I receive invalid GET user cart response code 400")
        public void receiveInvalidGETUserCartResponseCode400(){
            restAssuredThat(response -> response.statusCode(400));
        }

    //Scenario: [Negative] - CART_POST new cart with invalid data
    @Step("I POST API new cart with invalid endpoints")
    public String postNewCartWithInvalidEndpoint(){
        return url + "keranjan/5";
    }
    @Step("I POST HTTP request with invalid data cart")
    public void postHTTPRequestWithInvalidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",5);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postNewCartWithInvalidEndpoint());
    }
    @Step("I receive invalid data for new cart")
    public void receiveInvalidDataForNewCart(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot POST /keranjan/5</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid POST new cart response code 404")
    public void receiveInvalidPOSTNewCartResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_PUT existing cart with valid data
    @Step("I PUT cart API with valid endpoints")
    public String putCartWithValidEndpoint(){
        return url + "carts/7";
    }
    @Step("I PUT cart HTTP request with valid data cart")
    public void putCartRequestWithValidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",3);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(putCartWithValidEndpoint());
    }
    @Step("I receive valid data for updated cart")
    public void receiveValidDataForUpdatedCart(){
        restAssuredThat(response -> response.body("'userId'", equalTo(3)));
    }
    @Step("I receive valid PUT cart response code 200")
    public void receiveValidPUTCartResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_PUT existing cart with invalid data
    @Step("I PUT cart API with invalid endpoints")
    public String putCartWithInvalidEndpoint() {
        return url + "cart/7";
    }
    @Step("I PUT cart HTTP request with invalid data cart")
    public void putCartRequestWithInvalidDataCart(){
        JSONObject body = new JSONObject();
        body.put("userId",7);

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(putCartWithInvalidEndpoint());
    }
    @Step("I receive invalid data for updated cart")
    public void receiveInvalidDataForUpdatedCart(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /cart/7</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT cart response code 404")
    public void receiveInvalidPUTCartResponseCode2404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - CART_DELETE existing cart with valid id
    @Step("I DELETE API cart with valid id endpoints")
    public String deleteAPICartWithValidIDEndpoint(){
        return url + "products/6";
    }
    @Step("I DELETE cart HTTP request with valid id")
    public void deleteCartValidIDRequest(){
        SerenityRest.given().when().delete(deleteAPICartWithValidIDEndpoint());
    }
    @Step("I receive valid DELETE cart response code 200")
    public void receiveValidDELETECartResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - CART_DELETE existing cart with invalid id
    @Step("I DELETE API cart with invalid id endpoints")
    public String deleteAPICartWithInvalidIDEndpoint(){
        return url + "product/6";
    }
    @Step("I DELETE cart HTTP request with invalid id")
    public void deleteCartInvalidIDRequest(){
        SerenityRest.given().when().delete(deleteAPICartWithInvalidIDEndpoint());
    }
    @Step("I receive invalid DELETE cart response code 404")
    public void receiveInvalidDELETECartResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
