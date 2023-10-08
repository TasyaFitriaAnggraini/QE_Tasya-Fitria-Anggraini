package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

public class User {
    protected static String url = "https://fakestoreapi.com/";

    //Scenario: [Positive] - USER_ GET all detail data user with valid url
    @Step("I GET API all detail data user with valid url")
    public String getValidAPIAllDetailDataUser() {
        return url + "users";
    }
    @Step("I GET HTTP request all detail data user with valid url")
    public void getHTTPValidRequestAllDetailDataUser() {
        SerenityRest.given().when().get(getValidAPIAllDetailDataUser());
    }
    @Step("I receive valid GET all detail data user response code 200")
    public void receiveValidAllDetailDataUserResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - USER_GET all detail data cart with invalid url
    @Step("I GET API all detail data user with invalid endpoints")
    public String getInvalidAPIAllDetailDataUser() {
        return url + "user";
    }
    @Step("I GET HTTP request all detail data user with invalid url")
    public void getHTTPInvalidRequestAllDetailDataUser() {
        SerenityRest.given().when().get(getInvalidAPIAllDetailDataUser());
    }
    @Step("I receive invalid GET all detail data user response code 404")
    public void receiveInvalidAllDetailDataUserResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - USER_GET a single user with valid endpoints
    @Step("I GET API single user with valid endpoints")
    public String getSingleUserValidEndpoint() {
        return url + "users/1";
    }
    @Step("I GET HTTP request single user with valid endpoints")
    public void getSingleUserValidRequest(){
        SerenityRest.given().when().get(getSingleUserValidEndpoint());
    }
    @Step("I receive valid data for single user")
    public void receiveValidDataForSingleUser(){
        restAssuredThat(response -> response.body("id", equalTo(1)));
    }
    @Step("I receive valid GET single user response code 200")
    public void receiveValidSingleUserResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - USER_GET a single user with invalid endpoints
    @Step("I GET API single user with invalid endpoints")
    public String getSingleUserInvalidEndpoint() {
        return url + "user/1";
    }
    @Step("I GET HTTP request single user with invalid endpoints")
    public void getSingleUserInvalidRequest(){
        SerenityRest.given().when().get(getSingleUserInvalidEndpoint());
    }
    @Step("I receive invalid data for single user")
    public void receiveInvalidDataForSingleUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /user/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET single user response code 404")
    public void receiveInvalidSingleUserResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - USER_GET limit result with valid param
    @Step("I GET user limit result")
    public String getLimitUserRequest() {
        return url + "users?limit=5";
    }
    @Step("I GET HTTP request with valid param")
    public void getHTTPRequestWithLimitUserParam() {
        SerenityRest.given().when().get(getLimitUserRequest());
    }
    @Step("I receive limit result with request param")
    public void receiveLimitResultWithRequestParam() {
        restAssuredThat(response -> response.body("id", hasItems(1, 2, 3, 4, 5)));
    }
    @Step("I receive valid GET limit result response code 200")
    public void receiveValidLimitResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - USER_GET limit result with invalid param
    @Step("I GET user limit result invalid param")
    public String getLimitUserRequestInvalid() {
        return url + "user?limit=5";
    }
    @Step("I GET HTTP request with invalid param")
    public void getHTTPInvalidRequestWithLimitParam() {
        SerenityRest.given().when().get(getLimitUserRequestInvalid());
    }
    @Step("I receive limit result with invalid request param")
    public void receiveLimitResultWithInvalidRequestParam() {
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot GET /user</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid GET limit result response code 404")
    public void receiveInvalidLimitResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - USER_GET sort result user in descending with valid endpoint
    @Step("I GET API user sort result with valid endpoint")
    public String getSortUserValidEndpoint() {
        return url + "users?sort=desc";
    }
    @Step("I GET HTTP request sort user with valid endpoint")
    public void getHTTPValidRequestSortUser() {
        SerenityRest.given().when().get(getSortUserValidEndpoint());
    }
    @Step("I receive valid GET sort result user descending response code 200")
    public void receiveValidResponseSortUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - USER_GET sort result user in descending with invalid endpoint
    @Step("I GET API user sort result with invalid endpoint")
    public String getSortUserInvalidEndpoint() {
        return url + "user?sort=desc";
    }
    @Step("I GET HTTP request sort user with invalid endpoint")
    public void getHTTPInvalidRequestSortUser() {
        SerenityRest.given().when().get(getSortUserInvalidEndpoint());
    }
    @Step("I receive invalid GET sort result user descending response code 404")
    public void receiveInvalidResponseSortUser404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - USER_POST new product with valid data
    @Step("I access POST API user endpoints")
    public String setPostUserEndpoint(){
        return url + "users";
    }
    @Step("I POST HTTP request with a valid data")
    public void postUserHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setPostUserEndpoint());
    }
    @Step("I receive valid data for new user")
    public void validResponsePostUser(){
        restAssuredThat(response -> response.body("id", anyOf(equalTo(1), equalTo(11))));
    }
    @Step("I receive valid HTTP response code 200")
    public void receiveResponsePostUser200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //[Negative] - USER_POST new product with invalid data
    @Step("I POST the API user endpoints invalid")
    public String postAPIUserEndpointsInvalid() {
        return url + "user";
    }
    @Step("I POST HTTP request with an invalid data")
    public void postUserInvalidHTTPRequest(){
        JSONObject body = new JSONObject();
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postAPIUserEndpointsInvalid());
    }
    @Step("I failed to receive data")
    public void failedReceiveData(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot POST /user</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid POST response code 404")
    public void receiveInvalidPOSTResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: [Positive] - USER_PUT existing user with valid endpoints
    @Step("I PUT API user with valid endpoints")
    public String putUserValidEndpoint(){
        return url + "users/1";
    }
    @Step("I PUT an HTTP request with valid endpoints")
    public void putUserValidRequest(){
        JSONObject body = new JSONObject();
        body.put("id", 7); // Set the 'id' field to the expected value
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");
        // Set other properties for updatedUser object
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(putUserValidEndpoint());
    }
    @Step("I receive valid data for updated user")
    public void receiveValidDataUpdatedUser(){
        // Add logic to validate response for PUT request
        // For example, using SerenityRest:
        restAssuredThat(response -> response.body("id", equalTo(7)));
    }
    @Step("I receive valid PUT response code 200")
    public void receivePUTValidResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    // Scenario: [Negative] - USER_PUT existing user with invalid endpoints
    @Step("I PUT API user with invalid endpoints")
    public String putUserInvalidEndpoint(){
        return url + "user/1";
    }
    @Step("I PUT an HTTP request with invalid endpoints")
    public void putUserInvalidRequest(){
        JSONObject body = new JSONObject();
        body.put("id", 7); // Set the 'id' field to the expected value
        body.put("email", "John@gmail.com");
        body.put("username", "john");
        body.put("password", "m38rmF$");
        body.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");
        body.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");
        address.put("geolocation", geolocation);

        body.put("address", address);
        body.put("phone", "1-570-236-7033");
        // Set other properties for updatedUser object
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(putUserInvalidEndpoint());
    }
    @Step("I receive invalid data for updated user")
    public void receiveInvalidDataUpdatedUser(){
        restAssuredThat(response -> response.body(equalToIgnoringWhiteSpace(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<title>Error</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<pre>Cannot PUT /user/1</pre>\n" +
                        "</body>\n" +
                        "</html>"
        )));
    }
    @Step("I receive invalid PUT response code 404")
    public void receivePUTInvalidResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    //[Positive] - USER_DELETE existing user with valid id
    @Step("I DELETE API user with valid id endpoints")
    public String setDeleteUserValidIDEndpoint(){
        return url + "users/6";
    }
    @Step("I DELETE user HTTP request with valid id")
    public void deleteUserValidRequest(){
        SerenityRest.given().when().delete(setDeleteUserValidIDEndpoint());
    }
    @Step("I receive valid DELETE user response code 200")
    public void receiveValidDELETEresponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: [Negative] - USER_DELETE existing user with invalid id
    @Step("I DELETE API user with invalid id endpoints")
    public String setDeleteUserInvalidEndpoint(){
        return url + "user/11";
    }
    @Step("I DELETE user HTTP request with invalid id")
    public void deleteUserInvalidRequest(){
        SerenityRest.given().when().delete(setDeleteUserInvalidEndpoint());
    }
    @Step("I receive invalid DELETE user response code 404")
    public void receiveInvalidDELETEresponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
