package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import static utilities.API_Utilities.API_Methods.response;

public class US027_API_Staff_Detail {

    JsonPath jsonPath;

    JsonPath responseJP;

    @Given("Api kullanıcısı response body icindeki {int} indexe sahip olanin {string}, {string}, {string}, {string}, {string}, {string}, {string},{string} {string}, {string} bilgilerini doğrular.")
    public void api_kullanıcısı_response_body_icindeki_indexe_sahip_olanin_bilgilerini_doğrular(int dataIndex, String id, String provider_id, String first_name, String last_name, String country_code, String contact_no, String email, String password, String dob, String gender) {

        jsonPath = response.jsonPath();

        Assert.assertEquals(id, jsonPath.getString("api.staff-detail[" + dataIndex + "].id"));
        Assert.assertEquals(password, jsonPath.getString("api.staff-detail[" + dataIndex + "].password"));
        Assert.assertEquals(provider_id, jsonPath.getString("api.staff-detail[" + dataIndex + "].provider_id"));
        Assert.assertEquals(first_name, jsonPath.getString("api.staff-detail[" + dataIndex + "].first_name"));
        Assert.assertEquals(last_name, jsonPath.getString("api.staff-detail[" + dataIndex + "].last_name"));
        Assert.assertEquals(country_code, jsonPath.getString("api.staff-detail[" + dataIndex + "].country_code"));
        Assert.assertEquals(contact_no, jsonPath.getString("api.staff-detail[" + dataIndex + "].contact_no"));
        Assert.assertEquals(email, jsonPath.getString("api.staff-detail[" + dataIndex + "].email"));
        Assert.assertEquals(dob, jsonPath.getString("api.staff-detail[" + dataIndex + "].dob"));
        Assert.assertEquals(gender, jsonPath.getString("api.staff-detail[" + dataIndex + "].gender"));


    }

    @Given("Api kullanicisi response bodydeki data {string}, {string}, {string}, {string}, {string}, {string}, {string},{string} {string}, {string} bilgilerini doğrular.")
    public void api_kullanicisi_response_bodydeki_data_bilgilerini_doğrular(String id, String provider_id, String first_name, String last_name, String country_code, String contact_no, String email, String password, String dob, String gender) {

        jsonPath = response.jsonPath();
        Assert.assertEquals(id, jsonPath.getString("api.staff-detail[" + id + "].id"));
        Assert.assertEquals(password, jsonPath.getString("api.staff-detail[" + id + "].password"));
        Assert.assertEquals(provider_id, jsonPath.getString("api.staff-detail[" + id + "].provider_id"));
        Assert.assertEquals(first_name, jsonPath.getString("api.staff-detail[" + id + "].first_name"));
        Assert.assertEquals(last_name, jsonPath.getString("api.staff-detail[" + id + "].last_name"));
        Assert.assertEquals(country_code, jsonPath.getString("api.staff-detail[" + id + "].country_code"));
        Assert.assertEquals(contact_no, jsonPath.getString("api.staff-detail[" + id + "].contact_no"));
        Assert.assertEquals(email, jsonPath.getString("api.staff-detail[" + id + "].email"));
        Assert.assertEquals(dob, jsonPath.getString("api.staff-detail[" + id + "].dob"));
        Assert.assertEquals(gender, jsonPath.getString("api.staff-detail[" + id + "].gender"));
    }





    @Given("Api kullanicisi response bodydeki {string} bilgisinin {string} oldugunu dogrular--,---")
    public void api_kullanicisi_response_bodydeki_bilgisinin_oldugunu_dogrular(String string, String string2) {


    }

}
