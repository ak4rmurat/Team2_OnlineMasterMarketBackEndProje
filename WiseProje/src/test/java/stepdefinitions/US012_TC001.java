package stepdefinitions;

import config_Requirements.ConfigReader;
import hooks.HooksAPI;
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
    Response response;

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ile gir {string} request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ile_gir_request_gonderir(String string, String string2) {

        //Authentication.generateToken();
        API_Methods.sendRequest(string,null);

    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve dogru data {string} ile gir {string} request gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_dogru_data_ile_gir_request_gonderir(String string, String string2, String string3) {

        //Authentication.generateToken();
        API_Methods.sendRequest(string,"GET");

    }

    @Given("Api kullanicisi geri donen response body'deki datalar {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} oldugunu dogrular")
    public void api_kullanicisi_geri_donen_response_body_deki_datalar_oldugunu_dogrular(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

        responseJP = response.jsonPath();
        /*
        Assert.assertEquals(string,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string2,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string3,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string4,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string5,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string6,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string7,responseJP.getString()); //Expected, Actual
        Assert.assertEquals(string8,responseJP.getString()); //Expected, Actual

         */

        /*
        Assert.assertEquals(lang_id, jsonPath.getString("data.blogs[" + dataIndex + "].lang_id"));
        Assert.assertEquals(title, jsonPath.getString("data.blogs[" + dataIndex + "].title"));
        Assert.assertTrue(jsonPath.getString("data.blogs[" + dataIndex + "].slug").contains(slug));
        Assert.assertEquals(tags, jsonPath.getString("data.blogs[" + dataIndex + "].tags"));
        Assert.assertTrue(jsonPath.getString("data.blogs[" + dataIndex + "].summary").contains(summary));
         */

    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve \\(id) icermeyen bir {string} istegi gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_id_icermeyen_bir_istegi_gonderir(String string, String string2) {



    }

    @Given("Api kullanicisi {string} endpointine gecerli authorization bilgileri ve kaydi olmayan bir \\(id) icermeyen bir {string} istegi gonderir")
    public void api_kullanicisi_endpointine_gecerli_authorization_bilgileri_ve_kaydi_olmayan_bir_id_icermeyen_bir_istegi_gonderir(String string, String string2) {



    }

    @Given("Api kullanicisi {string} endpointine gecersiz authorization bilgileri ile gir GET request gonderir")
    public void api_kullanicisi_endpointine_gecersiz_authorization_bilgileri_ile_gir_get_request_gonderir(String string) {

        ConfigReader.getProperty("Invalid Token","api");

        API_Methods.sendRequest(string,"GET");

    }
}
