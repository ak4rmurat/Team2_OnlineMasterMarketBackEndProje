package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import utilities.API_Utilities.RequestBuilder;

import static io.restassured.RestAssured.given;

public class US014_TC001 {

    JsonPath jsonPath;
    JSONObject jsonObject;
    Response response;


    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve dogru datalar {string}, {string},{string} iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_dogru_datalar_iceren_bir_patch_istegi_gonderilir(String string, String string2, String string3, String string4) {

        RequestBuilder requestBuilder = new RequestBuilder();

        requestBuilder.addParameterForJSONObject("name",string2);
        requestBuilder.addParameterForJSONObject("email",string3);
        requestBuilder.addParameterForJSONObject("comment",string4);

        response = given().contentType(ContentType.JSON)
                          .when().body(requestBuilder.toString())
                          .patch(string);


    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve dogru data {string} iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_dogru_data_iceren_bir_patch_istegi_gonderilir(String string, String string2) {



    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile dogru \\(id) ve data icermeyen bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_dogru_id_ve_data_icermeyen_bir_patch_istegi_gonderilir(String string) {



    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile kaydi olmayan bir \\(id) ve dogru datalar {string}, {string},{string} iceren bir PATCH istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_kaydi_olmayan_bir_id_ve_dogru_datalar_iceren_bir_patch_istegi_gonderilir(String string, String string2, String string3, String string4) {



    }

    @Given("Api kullanicisi donen response'in icindeki updated_blog_comment_id bilgisinin {string} endpoint'inde yazan id path ile ayni oldugu dogrulanir")
    public void api_kullanicisi_donen_response_in_icindeki_updated_blog_comment_id_bilgisinin_endpoint_inde_yazan_id_path_ile_ayni_oldugu_dogrulanir(String string) {



    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri iceren bir GET istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_iceren_bir_get_istegi_gonderilir(String string) {



    }

}
