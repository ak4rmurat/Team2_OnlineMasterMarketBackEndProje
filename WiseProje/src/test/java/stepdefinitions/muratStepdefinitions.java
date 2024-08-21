package stepdefinitions;


import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import io.restassured.response.Response;
import utilities.API_Utilities.Authentication;

import java.util.Optional;

import static io.restassured.path.json.JsonPath.given;


public class muratStepdefinitions {
    Response response;
    String exceptionMesaj;

    JSONObject requestBody;

    @Given("Api kullanicisi {string} path parametresini olusturur")
    public void api_kullanicisi_path_parametrelerini_olusturur(String pathParam) {

        API_Methods.pathParam(pathParam);

    }


    @Given("Api kullanicisi {string} request icin donen response kaydeder")
    public void api_kullanicis_request_icin_donen_response_kaydeder(String httpMethod) {
        try {
            if (requestBody == null || requestBody.isEmpty()) {
                API_Methods.sendRequest(httpMethod, null);
            } else {
                API_Methods.sendRequest(httpMethod, requestBody);
            }
        } catch (Exception e) {
            exceptionMesaj = e.getMessage();
        }
        System.out.println("Mesaj : " + exceptionMesaj);

    }

    @Given("Donen response icin status code'un {int} oldugu dogrulanir")
    public void donen_response_icin_status_code_un_oldugu_dogrulanir(int statusCode) {

        API_Methods.statusCodeAssert(statusCode);

    }

    @Given("Donen response icin {string} bilgisinin {string} oldugu dogulanir")
    public void donen_response_icin_bilgisinin_oldugu_dogulanir(String key, String value) {
        API_Methods.assertBody(key, value);

    }

    @Given("Donen response'nin mesaj bilgisinin {string} oldugu dogrulanir")
    public void donen_response_nin_bilgisinin_oldugu_dogrulanir(String expectedMesaj) {

        Assert.assertEquals(expectedMesaj, exceptionMesaj);
    }

    @Given("Api kullanicisi exception mesajinin {string} oldugunu dogrular.")
    public void api_kullanicisi_exception_mesajinin_oldugunu_dogrular(String expectedMesaj) {
        Assert.assertEquals(expectedMesaj, exceptionMesaj);
    }

    @Given("Api kullanicisi {string}, {string}, {string}, {string}, {string}, {int}, {int}, {int} request body olusturur.")
    public void api_kullanici_request_body_i_olusturur(String shop_title, String description, String contact_no, String email, String address, int tax_allow, int category, int sub_category) {
        requestBody = new JSONObject();
        requestBody.put("shop_title", shop_title);
        requestBody.put("description", description);
        requestBody.put("contact_no", contact_no);
        requestBody.put("email", email);
        requestBody.put("address", address);
        requestBody.put("tax_allow", tax_allow);
        requestBody.put("category", category);
        requestBody.put("sub_category", sub_category);
        System.out.println("RequestBody : " + requestBody.toString());


    }

    @Given("Api kullanicisi post request icin donen response kaydederr")
    public void api_kullanicisi_post_request_icin_donen_response_kaydeder() {
        try {
            API_Methods.sendRequest("POST", requestBody.toString());
        }catch (Exception e){
            exceptionMesaj = e.getMessage();

        }

        System.out.println("Mesaj : " + exceptionMesaj);


    }

    @Given("Api kullanicisi {string}, {string}, {string}, {string}, {int}, {int}, {int} request body olustururr.")
    public void api_kullanici_request_body_i_olustururr(String shop_title, String description, String contact_no, String email, int tax_allow, int category, int sub_category) {
        requestBody = new JSONObject();
        requestBody.put("shop_title", shop_title);
        requestBody.put("description", description);
        requestBody.put("contact_no", contact_no);
        requestBody.put("email", email);
        requestBody.put("tax_allow", tax_allow);
        requestBody.put("category", category);
        requestBody.put("sub_category", sub_category);
        System.out.println("RequestBody : " + requestBody.toString());

    }

    @Given("Api kullanicisi bos request body olusturur.")
    public void api_kullanicisi_bos_request_body_olusturur() {
        requestBody = null;
    }

    @Given("Api kullanicisi post request icin donen response kaydederrr")
    public void api_kullanicisi_post_request_icin_donen_response_kaydederr() {

        API_Methods.sendRequest("POST", requestBody);

    }

    @Given("Api kullanicisi request body olustururrr.")
    public void api_kullanici_request_body_i_olustururrr() {
        requestBody = new JSONObject(Optional.ofNullable(null));
        System.out.println(requestBody.toString());


    }
}
