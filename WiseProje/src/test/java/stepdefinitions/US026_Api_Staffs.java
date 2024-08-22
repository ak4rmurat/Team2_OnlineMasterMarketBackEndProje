package stepdefinitions;

import config_Requirements.ConfigReader;
import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class US026_Api_Staffs {

    String requestBody;
    Response response;
    JsonPath jsonPath;

    JSONObject body;
    HashMap<String, Object> reqBody;

    String exceptionMessage;


    @Given("Api kullanicisi {string} path parametrelerini olusturur")
    public void api_kullanicisi_path_parametrelerini_olusturur(String pathParam) {

        if (API_Methods.addedId == 0) {
            API_Methods.pathParam(pathParam);
        } else {
            API_Methods.pathParam(pathParam + "/" + API_Methods.addedId);
        }


    }


    @Given("Api kullanicisi {string} request gonderir ve donen responsei kaydeder")
    public void api_kullanicisi_request_gonderir_ve_donen_responsei_kaydeder(String httpMethod) {
        try{
        if (requestBody == null || requestBody.isEmpty()) {
            API_Methods.sendRequest(httpMethod, null);
        } else {
            API_Methods.sendRequest(httpMethod, requestBody);
        }
        } catch(Exception e){
            exceptionMessage = e.getMessage();
        }
        System.out.println("Message :" + exceptionMessage);

        response.prettyPrint();

    }



    @Given("Api kullanicisi GET request gonderir ve donen responsei kaydeder")
    public void api_kullanicisi_get_request_gonderir_ve_donen_responsei_kaydeder() {

        try{
        response = given()
                .spec(HooksAPI.spec)
                .header("token", Authentication.generateToken())
                .header("Accept", "application/json")
                .when()
                .get(API_Methods.fullPath);

        } catch(Exception e){
            exceptionMessage = e.getMessage();
        }
        System.out.println("Message :" + exceptionMessage);
    }



    @Given("Api kullanicisi status codeun {int} oldugunu dogrular")
    public void api_kullanicisi_status_codeun_oldugunu_dogrular(int code) {API_Methods.statusCodeAssert(code);


    }


    @Given("Api kullanicisi response bodydeki {string} bilgisinin {string} oldugunu dogrular")
    public void api_kullanicisi_response_bodydeki_bilgisinin_oldugunu_dogrular(String key, String value) {
        API_Methods.assertBody(key, value);

    }










    @Given("Api kullanicisi {string} request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular")
    public void the_api_user_sends_a_request_saves_the_returned_response_and_verifies_that_the_status_code_is_with_the_reason_phrase_unauthorized(String httpMethod) {
        String response = (reqBody == null) ? API_Methods.tryCatchRequest(httpMethod, null) : API_Methods.tryCatchRequest(httpMethod, reqBody);
        Assert.assertEquals(ConfigReader.getProperty("unauthorizedExceptionMessage", "api"), response);
    }



    @Given("Api kullanıcısı response body icindeki {int} indexe sahip olanin {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} bilgilerini doğrular.")
    public void api_kullanıcısı_response_body_icindeki_indexe_sahip_olanin_bilgilerini_doğrular(int dataIndex, String provider_id, String first_name, String last_name, String country_code, String contact_no, String email, String dob, String gender, String profile_img, String designation, String exp_year, String exp_month, String status) {


        jsonPath = response.jsonPath();

        Assert.assertEquals(provider_id, jsonPath.getString("api.myStaffs[" + dataIndex + "].provider_id"));
        Assert.assertEquals(first_name, jsonPath.getString("api.myStaffs[" + dataIndex + "].first_name"));
        Assert.assertEquals(last_name, jsonPath.getString("api.myStaffs[" + dataIndex + "].last_name"));
        Assert.assertEquals(country_code, jsonPath.getString("api.myStaffs[" + dataIndex + "].country_code"));
        Assert.assertEquals(contact_no, jsonPath.getString("api.myStaffs[" + dataIndex + "].contact_no"));
        Assert.assertEquals(email, jsonPath.getString("api.myStaffs[" + dataIndex + "].email"));
        Assert.assertEquals(dob, jsonPath.getString("api.myStaffs[" + dataIndex + "].dob"));
        Assert.assertEquals(gender, jsonPath.getString("api.myStaffs[" + dataIndex + "].gender"));
        Assert.assertEquals(profile_img, jsonPath.getString("api.myStaffs[" + dataIndex + "].profile_img"));
        Assert.assertEquals(designation, jsonPath.getString("api.myStaffs[" + dataIndex + "].designation"));
        Assert.assertEquals(exp_year, jsonPath.getString("api.myStaffs[" + dataIndex + "].exp_year"));
        Assert.assertEquals(exp_month, jsonPath.getString("api.myStaffs[" + dataIndex + "].exp_month"));
        Assert.assertEquals(status, jsonPath.getString("api.myStaffs[" + dataIndex + "].status"));



    }

    @Given("Api kullanıcısı response body icindeki {string} indexe sahip olanin {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} bilgilerini doğrular.")
    public void api_kullanıcısı_response_body_icindeki_indexe_sahip_olanin_bilgilerini_doğrular(String dataIndex, String provider_id, String first_name, String last_name, String country_code, String contact_no, String email, String dob, String gender, String profile_img, String designation, String exp_year, String exp_month, String status) {
        jsonPath = response.jsonPath();

        Assert.assertEquals(provider_id, jsonPath.getString("api.myStaffs[" + dataIndex + "].provider_id"));
        Assert.assertEquals(first_name, jsonPath.getString("api.myStaffs[" + dataIndex + "].first_name"));
        Assert.assertEquals(last_name, jsonPath.getString("api.myStaffs[" + dataIndex + "].last_name"));
        Assert.assertEquals(country_code, jsonPath.getString("api.myStaffs[" + dataIndex + "].country_code"));
        Assert.assertEquals(contact_no, jsonPath.getString("api.myStaffs[" + dataIndex + "].contact_no"));
        Assert.assertEquals(email, jsonPath.getString("api.myStaffs[" + dataIndex + "].email"));
        Assert.assertEquals(dob, jsonPath.getString("api.myStaffs[" + dataIndex + "].dob"));
        Assert.assertEquals(gender, jsonPath.getString("api.myStaffs[" + dataIndex + "].gender"));
        Assert.assertEquals(profile_img, jsonPath.getString("api.myStaffs[" + dataIndex + "].profile_img"));
        Assert.assertEquals(designation, jsonPath.getString("api.myStaffs[" + dataIndex + "].designation"));
        Assert.assertEquals(exp_year, jsonPath.getString("api.myStaffs[" + dataIndex + "].exp_year"));
        Assert.assertEquals(exp_month, jsonPath.getString("api.myStaffs[" + dataIndex + "].exp_month"));
        Assert.assertEquals(status, jsonPath.getString("api.myStaffs[" + dataIndex + "].status"));


    }


    @Given("Api kullanicisi {string} request gonderir ve donen responsei kaydeder-get")
    public void api_kullanicisi_request_gonderir_ve_donen_responsei_kaydeder_get(String httpMethod) {

        API_Methods.sendRequest(httpMethod, reqBody);
    }

}
