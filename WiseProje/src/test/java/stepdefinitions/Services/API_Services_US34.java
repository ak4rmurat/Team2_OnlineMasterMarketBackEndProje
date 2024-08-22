package stepdefinitions.Services;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import java.util.Map;


public class API_Services_US34 {

    private Response response;
    private String baseUrl = "https://qa.onlinemastermarket.com/";
    private String updatedServiceId;

    @Given("Başarılı bir şekilde servis güncelleme isteği gönderildi")
    public void başarılı_bir_şekilde_servis_güncelleme_isteği_gönderildi() {
        // Base URL'i ayarla
        RestAssured.baseURI = baseUrl;
    }

    @When("{ {{base_url}}/api/editService/69 endpoint'ine PATCH request gönderilir")
    public void endpoint_ine_patch_request_gönderilir(String endpoint, DataTable dataTable) {
        // DataTable'dan JSON veri hazırlama
        Map<String, String> data = dataTable.asMaps(String.class, String.class).get(0);

        // PATCH isteği gönder
        response = RestAssured.given()
                .contentType("application/json")
                .body(data)
                .patch(endpoint);

        // Yanıtın JSON içeriğini al ve updated_service_id'yi çek
        JsonPath jsonPath = response.jsonPath();
        updatedServiceId = jsonPath.getString("{\n" +
                "    \"shop_id\": 10,\n" +
                "    \"staff_id\": 41,\n" +
                "    \"duration\":60,\n" +
                "    \"service_title\":\"Test Service Updated\",\n" +
                "    \"category\": \"1\",\n" +
                "    \"subcategory\":\"5\",\n" +
                "    \"service_amount\": 200,\n" +
                "    \"about\":\"Test Service Description New Service etc.\"\n" +
                "}");
    }

    @Given("Yanıtta dönen updated_service_id bilgisi alındı")
    public void yanıtta_dönen_updated_service_id_bilgisi_alındı() {
        // Bu adımda updatedServiceId zaten alınmış olmalı
        Assert.assertNotNull("updated_service_id alınamadı", updatedServiceId);
    }

    @Then("Yanıtın içinde güncellenmiş servise ait bilgiler doğrulanmalıdır")
    public void yanıtın_içinde_güncellenmiş_servise_ait_bilgiler_doğrulanmalıdır() {
        // GET isteği ile güncellenen servisin detaylarını al
        Response getResponse = RestAssured.given()
                .contentType("application/json")
                .get("/services/" + updatedServiceId);

        // JSON yanıtında gerekli bilgilerin olup olmadığını doğrulama
        JsonPath jsonPath = getResponse.jsonPath();
        Assert.assertNotNull("service_id bulunamadı", jsonPath.getString("service_id"));
        Assert.assertNotNull("service_title bulunamadı", jsonPath.getString("service_title"));
        Assert.assertNotNull("service_amount bulunamadı", jsonPath.getString("service_amount"));
        Assert.assertNotNull("category_name bulunamadı", jsonPath.getString("category_name"));
        Assert.assertNotNull("service_offered bulunamadı", jsonPath.getString("service_offered"));
        Assert.assertNotNull("service_latitude bulunamadı", jsonPath.getString("service_latitude"));
        Assert.assertNotNull("service_longitude bulunamadı", jsonPath.getString("service_longitude"));
        Assert.assertNotNull("about bulunamadı", jsonPath.getString("about"));
        Assert.assertNotNull("ratings bulunamadı", jsonPath.getString("ratings"));
        Assert.assertNotNull("rating_count bulunamadı", jsonPath.getString("rating_count"));
        Assert.assertNotNull("views bulunamadı", jsonPath.getString("views"));
        Assert.assertNotNull("currency bulunamadı", jsonPath.getString("currency"));
    }

}
