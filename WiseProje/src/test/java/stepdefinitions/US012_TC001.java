package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;
import utilities.API_Utilities.RequestBuilder;

public class US012_TC001 {

    String endPoint = "";
    JsonPath responseJP;
    JSONObject postRequestBody;
    Response response;
    String token;
    RequestBuilder requestBuilder = new RequestBuilder();

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ile gir GET request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ile_gir_get_request_gonderir(String string) {

        token = Authentication.generateToken();
        API_Methods.pathParam(string);
        response = API_Methods.sendRequest("GET",null);


    }
    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve dogru data {id} ile gir GET request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_dogru_data_ile_gir_get_request_gonderir(String string,int id) {

        //(post_id, user_id, email, name, comment, ip_address, status, created_at)
        requestBuilder.addParameterForJSONObject("post_id",);
        requestBuilder.addParameterForJSONObject("user_id",);
        requestBuilder.addParameterForJSONObject("email","");
        requestBuilder.addParameterForJSONObject("name","");
        requestBuilder.addParameterForJSONObject("comment",);
        requestBuilder.addParameterForJSONObject("ip_address",);
        requestBuilder.addParameterForJSONObject("status",);
        requestBuilder.addParameterForJSONObject("created_at",);

        API_Methods.pathParam(string);
        API_Methods.sendRequest("GET",null);

    }
    @Given("Api kullanicisi geri donen response body'deki datalar (post_id, user_id, email, name, comment, ip_address, status, created_at) oldugunu dogrular")
    public void api_kullanicisi_geri_donen_response_body_deki_datalar_post_id_user_id_email_name_comment_ip_address_status_created_at_oldugunu_dogrular() {

        Assert.assertEquals(response.body("post_id",""); // (message, expected, actual)
        Assert.assertEquals(response.body("user_id","");
        Assert.assertEquals(response.body("email","");
        Assert.assertEquals(response.body("name","");
        Assert.assertEquals(response.body("comment","");
        Assert.assertEquals(response.body("ip_address","");
        Assert.assertEquals(response.body("status","");
        Assert.assertEquals(response.body("created_at","");


    }
    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve (id) icermeyen bir GET istegi gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_id_icermeyen_bir_get_istegi_gonderir(String string) {



    }
    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve kaydi olmayan bir (id) icermeyen bir GET istegi gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_kaydi_olmayan_bir_id_icermeyen_bir_get_istegi_gonderir(String string) {



    }
    @Given("Api kullanicisi {string} endpointine gecersiz authorization bilgileri ile gir GET request gonderir")
    public void api_kullanicisi_endpointine_gecersiz_authorization_bilgileri_ile_gir_get_request_gonderir(String string) {



    }
}
