package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;

public class US014_TC001 {

    String endPoint = "";
    JsonPath responseJP;
    JSONObject postRequestBody;
    Response response;


    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve dogru datalar \\(name, email,comment) iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_dogru_datalar_name_email_comment_iceren_bir_patch_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve dogru data \\(name) iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_dogru_data_name_iceren_bir_patch_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve data icermeyen bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_data_icermeyen_bir_patch_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile kaydi olmayan bir \\(id) ve dogru datalar \\(name, email,comment) iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_kaydi_olmayan_bir_id_ve_dogru_datalar_name_email_comment_iceren_bir_patch_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_bir_get_istegi_gonderilir(String string) {



    }
    @Given("Api kullanicisi donen response'in icindeki updated_blog_comment_id bilgisinin \\/api\\/editBlogComment\\/\\{id} endpoint'inde yazan id path ile ayni oldugu dogrulanir")
    public void api_kullanicisi_donen_response_in_icindeki_updated_blog_comment_id_bilgisinin_api_edit_blog_comment_endpoint_inde_yazan_id_path_ile_ayni_oldugu_dogrulanir() {



    }
    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri iceren bir GET istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_iceren_bir_get_istegi_gonderilir(String string) {



    }


}
