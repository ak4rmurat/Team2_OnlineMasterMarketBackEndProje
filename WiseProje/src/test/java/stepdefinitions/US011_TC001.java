package stepdefinitions;

import config_Requirements.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;

import static io.restassured.RestAssured.given;

public class US011_TC001 {

    Response response;
    JsonPath responseJP;
    JSONObject postRequestBody;
    String token;
    Response gecersizBilgiResponse;

    @Given("Api kullanicisi {string} end pointine gecerli authorization bilgileri ile gir GET request gonderir")
    public void api_kullanicisi_end_pointine_gecerli_authorization_bilgileri_ile_gir_get_request_gonderir(String string) {

        token = Authentication.generateToken();
        response = API_Methods.sendRequest("GET",token);

    }
    @Given("Api kullanicisi geri donen responsin status code'unun {int} oldugunu dogrular")
    public void api_kullanicisi_geri_donen_responsin_status_code_unun_oldugunu_dogrular(Integer statusCode) {

        API_Methods.statusCodeAssert(statusCode);

    }
    @Given("Api kullanicisi geri donen responsin body'deki response_message bilgisinin {string} oldugunu dogrular")
    public void api_kullanicisi_geri_donen_responsin_body_deki_response_message_bilgisinin_oldugunu_dogrular(String string) {

        responseJP = response.jsonPath();
        Assert.assertEquals(string,responseJP.getString("response_message"));

    }
    @Given("Api kullanicisi geri donen response'in id\\(x) olaninin response bodyde donen bilgilerinin \\(post_id, user_id, email, name, comment, ip_address, status, created_at) oldugunu dogrular")
    public void api_kullanicisi_geri_donen_response_in_id_x_olaninin_response_bodyde_donen_bilgilerinin_post_id_user_id_email_name_comment_ip_address_status_created_at_oldugunu_dogrular() {

        Assert.assertEquals("post_id",responseJP.getString("post_id"));
        Assert.assertEquals("user_id",responseJP.getString("user_id"));
        Assert.assertEquals("email",responseJP.getString("email"));
        Assert.assertEquals("name",responseJP.getString("name"));
        Assert.assertEquals("comment",responseJP.getString("comment"));
        Assert.assertEquals("ip_address",responseJP.getString("ip_address"));
        Assert.assertEquals("status",responseJP.getString("status"));
        Assert.assertEquals("created_at",responseJP.getString("created_at"));

    }
    @Given("Api kullanicisi {string} end pointine gecersiz authorization bilgileri ile bir GET istegi gonderir")
    public void api_kullanicisi_end_pointine_gecersiz_authorization_bilgileri_ile_bir_get_istegi_gonderir(String string) {


        String invalidURL = ConfigReader.getProperty("invalidApiKey","api");
        gecersizBilgiResponse = given().when().get(invalidURL);


    }
    @Given("APi kullanicisi geri donen response'in status code'unun {int} oldugunu dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_status_code_unun_oldugunu_dogrular(Integer int1) {

        Assert.assertEquals(int1, (Integer)Matchers.equalTo(gecersizBilgiResponse.getStatusCode());

    }
    @Given("APi kullanicisi geri donen response'in bodydeki response_message bilgisinin {string} oldugunu dogrular")
    public void a_pi_kullanicisi_geri_donen_response_in_bodydeki_response_message_bilgisinin_oldugunu_dogrular(String string) {

        JsonPath gecersizBilgiResponseJsonPath = gecersizBilgiResponse.jsonPath();
        Assert.assertEquals(string,Matchers.equalTo(gecersizBilgiResponseJsonPath.getString("response_message")));

    }
}
