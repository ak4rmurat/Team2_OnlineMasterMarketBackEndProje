/*package stepdefinitions.Services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class API_Services_US31 {

    private String baseUrl = "https://qa.onlinemastermarket.com";
    private RequestSpecification request;
    private Response response;
    private String serviceId = "67";
    private String invalidServiceId = "99999";

    @Given("Geçerli bir authorization token mevcut")
    public void validAuthorizationTokenIsPresent() {
        request = given().header("Authorization", "API Key");
    }

    @Given("Geçerli bir servis ID'si mevcut")
    public void validServiceIdIsPresent() {
        // serviceId örneği zaten tanımlandı, bu adımda bir işlem yapılmıyor.
    }

    @Given("Geçersiz bir servis ID'si mevcut")
    public void invalidServiceIdIsPresent() {
        // invalidServiceId örneği zaten tanımlandı, bu adımda bir işlem yapılmıyor.
    }

    @When("/api/service-details/67 endpoint'ine GET request gönderilir")
    public void sendGetRequestToServiceDetailsWithId() {
        response = request.when().get(baseUrl + "/api/service-details/" + serviceId);
    }

    @When("/api/service-details/ endpoint'ine GET request gönderilir")
    public void sendGetRequestToServiceDetailsWithoutId() {
        response = request.when().get(baseUrl + "/api/service-details/");
    }

    @When("/api/service-details/9999 endpoint'ine GET request gönderilir")
    public void sendGetRequestToServiceDetailsWithInvalidId() {
        response = request.when().get(baseUrl + "/api/service-details/" + invalidServiceId);
    }

    @Then("Yanıtın HTTP status kodu 200 olmalıdır")
    public void verifyHttpStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("Yanıtın response_message alanında {Service Details} olmalıdır")
    public void verifyResponseMessage(String expectedMessage) {
        response.then().body("response_message", equalTo(expectedMessage));
    }

    @Then("Yanıtın içinde service_id, service_title, final_amount, service_image, category_name, current_offered, service_latitude, service_longitude, about, ratings, rating_count, views, currency bilgileri bulunmalıdır")
    public void verifyServiceDetailsResponse() {
        response.then().body("service_id",equalTo("67") )
                .body("service_title", equalTo("Test Service Updated"))
                .body("final_amount",equalTo("200") )
                .body("service_image", equalTo(""))
                .body("category_name", equalTo("Home Services"))
                .body("current_offered",equalTo("") )
                .body("service_latitude", equalTo("35.125801"))
                .body("service_longitude",equalTo("-117.9859038") )
                .body("about", equalTo("Test Service Description New Service etc."))
                .body("ratings", equalTo("0"))
                .body("rating_count",equalTo("0") )
                .body("views",equalTo("0") )
                .body("currency", equalTo("$"));


    }
}



 */