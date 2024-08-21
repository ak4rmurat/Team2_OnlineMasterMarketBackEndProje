package stepdefinitions;

import hooks.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;
import utilities.API_Utilities.RequestBuilder;

import static io.restassured.RestAssured.given;

public class US015_TC001 {

    JsonPath jsonPath;
    JSONObject jsonObject;
    Response response;


    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve dogru \\(id) ile bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_dogru_id_ile_bir_delete_istegi_gonderilir(String string) {

        response = given().when().delete(HooksAPI.spec.toString());


    }
    @Given("Api kullanicisi geri donen responsin status code'unun {int} oldugunu dogrular")
    public void api_kullanicisi_geri_donen_responsin_status_code_unun_oldugunu_dogrular(Integer int1) {

        response.then().assertThat().statusCode(int1);

    }
    @Given("Api kullanicisi geri donen responsin body'deki response_message bilgisinin {string} oldugunu dogrular")
    public void api_kullanicisi_geri_donen_responsin_body_deki_response_message_bilgisinin_oldugunu_dogrular(String string) {

        response.then().assertThat()
                                    .body("response_message", Matchers.equalTo(string));

    }


    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve \\(id) icermeyen bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_id_icermeyen_bir_delete_istegi_gonderilir(String string) {

        jsonObject.put()


    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ve kaydi olmayan \\(id) iceren bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ve_kaydi_olmayan_id_iceren_bir_delete_istegi_gonderilir(String string) {

        response = response.then().assertThat()
                                    .body().contentType(ContentType.JSON)
                                    .

    }
    @Given("APi kullanicisi geri donen response'in status code'unun {int} oldugunu dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_status_code_unun_oldugunu_dogrular(Integer int1) {

        response.then().assertThat().statusCode(int1);

    }
    @Given("APi kullanicisi geri donen response'in bodydeki response_message bilgisinin {string} oldugunu dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_bodydeki_response_message_bilgisinin_oldugunu_dogrular(String string) {

        response.then().assertThat()
                .body("response_message", Matchers.equalTo(string));

    }


    @Given("Api kullanicisi {string} end pointine gecersiz authorization bilgileri ile bir DELETE istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecersiz_authorization_bilgileri_ile_bir_delete_istegi_gonderilir(String string) {

        response =  given()
                            .spec(HooksAPI.spec)
                            .header("token", Authentication.generateToken())
                            .header("Accept", "application/json")
                            .when()
                            .delete();

    }

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_bir_get_istegi_gonderilir(String string) {

        response =  given()
                            .spec(HooksAPI.spec)
                            .header("token", Authentication.generateToken())
                            .header("Accept", "application/json")
                            .when()
                            .get(API_Methods.fullPath);


    }
    @Given("Api kullanicisi geri donen response'in deleted_blog_comment_id bilgisinin \\/api\\/deleteBlogComment\\/{int}\" endpointinde yazan id ile parametrelerinin ayni oldugu dogrulanir")
    public void api_kullanicisi_geri_donen_response_in_deleted_blog_comment_id_bilgisinin_api_delete_blog_comment_endpointinde_yazan_id_ile_parametrelerinin_ayni_oldugu_dogrulanir(Integer int1) {

        jsonPath = response.jsonPath();

        Assert.assertEquals(lang_id, jsonPath.getString("data.blogs[" + dataIndex + "].lang_id"));
        Assert.assertEquals(title, jsonPath.getString("data.blogs[" + dataIndex + "].title"));
        Assert.assertTrue(jsonPath.getString("data.blogs[" + dataIndex + "].slug").contains(slug));
        Assert.assertEquals(tags, jsonPath.getString("data.blogs[" + dataIndex + "].tags"));
        Assert.assertTrue(jsonPath.getString("data.blogs[" + dataIndex + "].summary").contains(summary));

    }

}
