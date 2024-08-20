package stepdefinitions;

import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class US006_API_Stepdefinitions {
    Response response;

    JsonPath jsonPath;

    HashMap<String, Object> reqBody;

    String requestBody;






    @Given("Api kullanicisi {string} request gonderir ve donen response kaydeder.")
    public void api_kullanicisi_get_request_gonderir_ve_donen_response_kaydeder(String requestBody) {

            response = given()
                    .spec(HooksAPI.spec)
                    .header("token", Authentication.generateToken())
                    .header("Accept", "application/json")
                    .when()
                    .get(API_Methods.fullPath);

            response.prettyPrint();}

    @Given("Api kullanicisi status code {int} oldugunu dogrular")
    public void api_kullanicisi_status_code_oldugunu_dogrular(Integer code) {
        response.then().assertThat().statusCode(code);
    }

    @Given("Api kullanicisi response bodyde {string} bilgisinin {string} oldugunu dogrular")
    public void api_kullanicisi_response_bodyde_bilgisinin_oldugunu_dogrular(String key, String value) {
        response.then().assertThat().body(key, Matchers.equalTo(value));
    }

    @Then("Api kullanicisi response bodydeki data {string},{string}, {string}, {string}, {string}, {string} , {string},{string},{string},{string},{string},{string} içeriklerini doğrular.")
    public void api_kullanicisi_response_bodydeki_data_içeriklerini_doğrular(String id, String lang_id, String name, String slug, String description, String keywords, String category_order, String status, String createdAt, String createdBy, String updateAt, String updateBy){


        jsonPath = response.jsonPath();



        Assert.assertEquals(lang_id, jsonPath.getString("data.blogs[" + id + "].lang_id"));
        Assert.assertEquals(name, jsonPath.getString("data.blogs[" + id + "].name"));
        Assert.assertEquals(slug, jsonPath.getString("data.blogs[" + id + "].slug"));
        Assert.assertEquals(description, jsonPath.getString("data.blogs[" + id + "].description"));
        Assert.assertEquals(keywords, jsonPath.getString("data.blogs[" + id + "].keywords"));


        Assert.assertEquals(keywords, jsonPath.getString("data.blogs[" + id + "].keywords"));
        Assert.assertEquals(category_order, jsonPath.getString("data.blogs[" + id + "].category_order"));
        Assert.assertEquals(status, jsonPath.getString("data.blogs[" + id + "].status"));
        Assert.assertEquals(createdAt, jsonPath.getString("data.blogs[" + id + "].createdAt"));
        Assert.assertEquals(createdBy, jsonPath.getString("data.blogs[" + id + "].createdBy"));
        Assert.assertEquals(updateAt, jsonPath.getString("data.blogs[" + id + "].updatedAt"));
        Assert.assertEquals(updateBy, jsonPath.getString("data.blogs[" + id + "].updatedBy"));


    }
}



