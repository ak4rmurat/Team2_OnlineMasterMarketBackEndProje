package stepdefinitions;

import config_Requirements.ConfigReader;
import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import utilities.API_Utilities.API_Methods;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class US008_API_Stepdefinitou {


    Response response;
    HashMap<String, Object> reqBody;




    JSONObject requestBody;



    @Given("Api kullanicisi {string} requesti gonderir ve donen responsei kaydeder")
    public void api_kullanicisi_requesti_gonderir_ve_donen_responsei_kaydeder(String httpMethod) {


        if (requestBody == null || requestBody.isEmpty()) {
            API_Methods.sendRequest(httpMethod, null);
        } else {
            API_Methods.sendRequest(httpMethod, requestBody);
        }


    }




    @Given("Api kullanicisi {string} request gonderir ve donen responsei kaydederr")
    public void api_kullanicisi_request_gonderir_ve_donen_responsei_kaydederr(String httpMethod) {
        API_Methods.sendRequest(httpMethod, reqBody);


    }

    @Given("Api kullanicisi status code {int} oldugunu dogrularr")
    public void api_kullanicisi_status_code_oldugunu_dogrularr(int code) {
        API_Methods.statusCodeAssert(code);


    }


    @Given("Api kullanicisi response bodyde {string} bilgisinin {string} oldugunu dogrularr")
    public void api_kullanicisi_response_bodyde_bilgisinin_oldugunu_dogrularr(String key, String value) {
        API_Methods.assertBody(key, value);
        {


        }


    }

    @Given("Api kullanicisi {string}, {string}, {string} request body olusturur.")
    public void api_kullanicisi_request_body_olusturur(String id,String name, String description) {
        requestBody = new JSONObject();
        requestBody.put("id","id");
        requestBody.put("name", name);
        requestBody.put("description", description);
        System.out.println("RequestBody : " + requestBody.toString());
    }

    @Given("Api kullanicisi {string}, {string} request body olusturur")
    public void api_kullanicisi_request_body_olusturur(String name, String description) {
        reqBody = new HashMap<>();
        reqBody.put("name", name);
        reqBody.put("description", description);


    }

    @Given("Api kullanicisi status codeun {int} oldugunu dogrularr")
    public void api_kullanicisi_status_codeun_oldugunu_dogrularr(int code) {API_Methods.statusCodeAssert(code);

    }
    @Given("Api kullanicisi  request body olusturur")
    public void api_kullanicisi_request_body_olusturur() {
        reqBody = new HashMap<>();

    }

    @Given("Api kullanicisi {string} requesti gonderir ve donen responsei kaydederr")
    public void api_kullanicisi_requesti_gonderir_ve_donen_responsei_kaydederr(String httpMethod){
        API_Methods.sendRequest(httpMethod, reqBody);
    }





}




