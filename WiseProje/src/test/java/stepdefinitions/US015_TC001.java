package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;

public class US015_TC001 {

    String endPoint = "";
    JsonPath responseJP;
    JSONObject postRequestBody;
    Response response;


    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve dogru \\(id) ile bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_dogru_id_ile_bir_delete_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve \\(id) icermeyen bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_id_icermeyen_bir_delete_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve kaydi olmayan \\(id) iceren bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_kaydi_olmayan_id_iceren_bir_delete_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecersiz authorization bilgileri ile bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecersiz_authorization_bilgileri_ile_bir_delete_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi geri donen response'in deleted_blog_comment_id bilgisinin \\/api\\/deleteBlogComment\\/\\{id} endpointinde yazan id ile parametrelerinin ayni oldugu dogrulanir")
    public void api_kullanicisi_geri_donen_response_in_deleted_blog_comment_id_bilgisinin_api_delete_blog_comment_endpointinde_yazan_id_ile_parametrelerinin_ayni_oldugu_dogrulanir() {



    }

}
