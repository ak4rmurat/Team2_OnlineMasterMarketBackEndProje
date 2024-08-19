package stepdefinitions;

import config_Requirements.ConfigReader;
import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.API_Utilities.API_Methods;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class US028_API_addStaff {

    Response response;
    HashMap<String, Object> reqBody;


    @Given("Api kullanicisi api addBlog endpointine gondermek icin {string}, {string}, {string}, {string}, {string}, {string}, {string} bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_add_blog_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar(String firstname, String mobileno, String email, String gender, String dob, String shop_id, String about_emp) {

        reqBody = new HashMap<>();

        reqBody.put("firstname",firstname);
        reqBody.put("mobileno", mobileno);
        reqBody.put("email", email);
        reqBody.put("gender", gender);
        reqBody.put("dob", dob);
        reqBody.put("shop_id", shop_id);
        reqBody.put("about_emp", about_emp);


    }




    @Given("Api kullanicisi POST request gonderir ve donen responsei kaydeder")
    public void api_kullanicisi_post_request_gonderir_ve_donen_responsei_kaydeder() {
        response = given()
                .spec(HooksAPI.spec)
                .header("token", ConfigReader.getProperty("invalidApiKey", "api"))
                .header("Accept", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(reqBody)
                .post(API_Methods.fullPath);

        response.prettyPrint();

    }



}
