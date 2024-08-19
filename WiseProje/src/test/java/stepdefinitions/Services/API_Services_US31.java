package stepdefinitions.Services;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class API_Services_US31 {

    @Given("Geçerli bir authorization token mevcut")
    public void geçerli_bir_authorization_token_mevcut() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("{string} endpoint'ine GET request gönderilir")
    public void endpoint_ine_get_request_gönderilir(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("Yanıtın HTTP status kodu {int} olmalıdır")
    public void yanıtın_http_status_kodu_olmalıdır(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Yanıtın response_message alanında {string} olmalıdır")
    public void yanıtın_response_message_alanında_olmalıdır(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("Geçerli bir service_id mevcut")
    public void geçerli_bir_service_id_mevcut() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Yanıtın içinde service_id, service_title, service_location, finalAmount, service_image, category_name, ratings, rating_count, user_image, currency_code, is_active, currency, service_amount bilgileri bulunmalıdır")
    public void yanıtın_içinde_service_id_service_title_service_location_final_amount_service_image_category_name_ratings_rating_count_user_image_currency_code_is_active_currency_service_amount_bilgileri_bulunmalıdır() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("Geçersiz bir authorization token mevcut")
    public void geçersiz_bir_authorization_token_mevcut() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
