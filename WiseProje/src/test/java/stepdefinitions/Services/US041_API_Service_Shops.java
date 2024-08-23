package stepdefinitions.Services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static utilities.API_Utilities.API_Methods.response;

public class US041_API_Service_Shops {

    private Response response;

    @Given("I have valid authorization")
    public void i_have_valid_authorization() {

    }
    @When("I send a GET request to \\/api\\/categories")
    public void i_send_a_get_request_to_api_categories() {

        String https;
        String url = "https://qa.onlinemastermarket.com";

        Response response =given().when().get(url);


    }
    @Then("the status code is {int}")
    public void the_status_code_is(Integer int1) {

        Assertions.assertEquals(200,response.getStatusCode());

    }
    @Then("the response message is {string}")
    public void the_response_message_is(String string) {
        assertThat(response.body().jsonPath().getString("response_message"), equalTo("Category List"));

    }


    @Given("Api kullanicisi response bodydeki data {string},{string}, {string}, {string}, {string}, {string} , {string},{string},{string},{string},{string} içeriklerini doğrular.")
    public void api_kullanicisi_response_bodydeki_data_içeriklerini_doğrular(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
