package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import utilities.API_Utilities.RequestBuilder;

import static io.restassured.RestAssured.given;

public class US013_TC001 {

    JsonPath jsonPath;
    JSONObject jsonObject;
    Response response;


    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve dogru datalar {string}, {string}, {string}, {string} ile bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_dogru_datalar_ile_bir_post_request_gonderir(String string, String string2, String string3, String string4, String string5) {

        RequestBuilder requestBuilder = new RequestBuilder();

        requestBuilder.addParameterForJSONObject("post_id",string2);
        requestBuilder.addParameterForJSONObject("name",string3);
        requestBuilder.addParameterForJSONObject("email",string4);
        requestBuilder.addParameterForJSONObject("comment",string5);

        response = given().contentType(ContentType.JSON)
                .when().body(requestBuilder.toString())
                .post(string);

    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve eksik data iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_eksik_data_iceren_bir_post_request_gonderir(String string) {



    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve data iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_data_iceren_bir_post_request_gonderir(String string) {


        RequestBuilder requestBuilder = new RequestBuilder();

        requestBuilder.addParameterForJSONObject("post_id",5);
        requestBuilder.addParameterForJSONObject("name","John");
        requestBuilder.addParameterForJSONObject("email","Doe");
        requestBuilder.addParameterForJSONObject("comment","Deneme");

        response = given().contentType(ContentType.JSON)
                .when().body(requestBuilder.toString())
                .post(string);

    }

    @Given("Api kullanicisi {string} endpointine gecersiz \\(invalid api key) authorization bilgileri ve dogru datalar {string}, {string}, {string}, {string} iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecersiz_invalid_api_key_authorization_bilgileri_ve_dogru_datalar_iceren_bir_post_request_gonderir(String string, String string2, String string3, String string4, String string5) {



    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ile gir GET request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ile_gir_get_request_gonderir(String string) {



    }

    @Given("APi kullanicisi geri donen response'in bodydeki response_message bilgisinin bos olmadigini dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_bodydeki_response_message_bilgisinin_bos_olmadigini_dogrular() {



    }

}
