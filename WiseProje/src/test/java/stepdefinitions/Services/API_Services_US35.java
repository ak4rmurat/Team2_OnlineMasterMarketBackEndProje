/*
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


public class API_Services_US35 {

    private Response response;
    private String baseUrl = "https://qa.onlinemastermarket.com/";
    private String deletedServiceId;

    @Given("Başarılı bir şekilde servis silme isteği gönderildi")
    public void başarılı_bir_şekilde_servis_silme_isteği_gönderildi() {
        // Base URL'i ayarla
        RestAssured.baseURI = baseUrl;
    }

    @When(" {{base_url}}/api/deleteService/69 endpoint'ine DELETE request gönderilir")
    public void endpoint_ine_delete_request_gönderilir(String endpoint, DataTable dataTable) {
        // DataTable'dan JSON veri hazırlama
        Map<String, String> data = dataTable.asMaps(String.class, String.class).get(0);

        // DELETE isteği gönder
        response = RestAssured.given()
                .contentType("application/json")
                .body(data)
                .delete(endpoint);

        // Yanıtın JSON içeriğini al ve deleted_service_id'yi çek
        JsonPath jsonPath = response.jsonPath();
        deletedServiceId = jsonPath.getString("{\n" +
                "  \"response\": {\n" +
                "    \"response_code\": \"200\",\n" +
                "    \"response_message\": \"Service deleted successfully\"\n" +
                "  },\n" +
                "  \"data\": {\n" +
                "    \"deleted_service_id\": \"69\"\n" +
                "  }\n" +
                "}" );
    }

    @Given("Yanıtta dönen deleted_service_id bilgisi alındı")
    public void yanıtta_dönen_deleted_service_id_bilgisi_alındı() {
        // Bu adımda deletedServiceId zaten alınmış olmalı
        Assert.assertNotNull("deleted_service_id alınamadı", deletedServiceId);
    }

    @Then("Yanıtın içinde silinmiş servise ait bilgiler doğrulanmalıdır")
    public void yanıtın_içinde_silinmiş_servise_ait_bilgiler_doğrulanmalıdır() {
        // Bu adımda, yanıtın silinmiş servise ait bilgileri içerip içermediği kontrol edilir.
        // Silinmiş bir servis için çoğunlukla sunucu belirli bir yanıt verir.
        Assert.assertTrue("Yanıt başarılı bir silme işlemini doğrulamalıdır", response.getStatusCode() == 200 || response.getStatusCode() == 204);
        Assert.assertNotNull("deleted_service_id bulunamadı", deletedServiceId);
    }

}


 */
