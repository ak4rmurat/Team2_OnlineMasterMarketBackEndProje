package stepdefinitions;

import io.cucumber.java.en.Given;

import java.util.HashMap;

public class US029_API_editStaff {


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

}
