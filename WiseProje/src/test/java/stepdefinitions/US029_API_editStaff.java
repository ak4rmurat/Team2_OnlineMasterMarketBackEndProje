package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utilities.API_Utilities.API_Methods;

import java.util.HashMap;

public class US029_API_editStaff {


    String requestBody;
    String exceptionMessage;
    Response response;
    HashMap<String, Object> reqBody;


    @Given("Api kullanicisi api editstaff endpointine gondermek icin {string},{string}, {string}, {string}, {string}, {string}, {string} bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_editstaff_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar(String id, String firstname, String mobileno, String email, String gender, String shop_id, String about_emp) {

        reqBody = new HashMap<>();

        reqBody.put("id", id);
        reqBody.put("firstname", firstname);
        reqBody.put("mobileno", mobileno);
        reqBody.put("email", email);
        reqBody.put("gender", gender);
        reqBody.put("shop_id", shop_id);
        reqBody.put("about_emp", about_emp);

    }



    @Given("Api kullanicisi api editstaff endpointine gondermek icin {string},{string}, {string} bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_editstaff_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar(String id, String firstname, String mobileno) {

        reqBody = new HashMap<>();

        reqBody.put("id", id);
        reqBody.put("firstname", firstname);
        reqBody.put("mobileno", mobileno);

    }



    @Given("Api kullanicisi api editstaff endpointine gondermek icin \"{int}\"bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_editstaff_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar(int id) {
        reqBody = new HashMap<>();
        reqBody.put("id", id);

    }



    @Given("Api kullanicisi {string} request gonderir ve donen responsei kaydeder-")
    public void api_kullanicisi_request_gonderir_ve_donen_responsei_kaydeder(String httpMethod) {

        API_Methods.sendRequest(httpMethod, reqBody);
    }


    @Given("Api kullanicisi api editstaff endpointine gondermek icin {string}, {string}, {string}, {string}, {string}, {string} bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_editstaff_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar(String firstname, String mobileno, String email, String gender, String shop_id, String about_emp) {

        reqBody = new HashMap<>();

        reqBody.put("firstname", firstname);
        reqBody.put("mobileno", mobileno);
        reqBody.put("email", email);
        reqBody.put("gender", gender);
        reqBody.put("shop_id", shop_id);
        reqBody.put("about_emp", about_emp);

    }


    @Given("Api kullanicisi {string} path parametrelerini olusturur-")
    public void api_kullanicisi_path_parametrelerini_olusturur(String pathParam) {

        if (API_Methods.addedId == 0) {
            API_Methods.pathParam(pathParam);
        } else {
            API_Methods.pathParam(pathParam + "/" + API_Methods.addedId);
        }


    }

    @Given("Api kullanicisi api editstaff endpointine gondermek icin bilgilerini iceren bir post request hazirlar")
    public void api_kullanicisi_api_editstaff_endpointine_gondermek_icin_bilgilerini_iceren_bir_post_request_hazirlar() {

        reqBody = new HashMap<>();

    }

}
