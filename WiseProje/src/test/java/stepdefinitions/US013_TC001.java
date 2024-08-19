package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;

public class US013_TC001 {

    String endPoint = "";
    JsonPath responseJP;
    JSONObject postRequestBody;
    Response response;


    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve dogru datalar (post_id, name, email, comment) ile bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_dogru_datalar_post_id_name_email_comment_ile_bir_post_request_gonderir(String string) {



    }
    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve eksik data iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_eksik_data_iceren_bir_post_request_gonderir(String string) {



    }
    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve data iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_data_iceren_bir_post_request_gonderir(String string) {



    }
    @Given("Api kullanicisi {string} endpointine gecersiz (invalid api key) authorization bilgileri ve dogru datalar (post_id, name, email, comment) iceren bir POST request gonderir")
    public void api_kullanicisi_endpointine_gecersiz_invalid_api_key_authorization_bilgileri_ve_dogru_datalar_post_id_name_email_comment_iceren_bir_post_request_gonderir(String string) {



    }
    @Given("APi kullanicisi geri donen response'in bodydeki response_message bilgisinin bos olmadigini dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_bodydeki_response_message_bilgisinin_bos_olmadigini_dogrular() {



    }

}
