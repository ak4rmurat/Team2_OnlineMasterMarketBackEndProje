package stepdefinitions.Services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;


public class API_Services_US32 {

    private WebDriver driver;
    private String baseUrl = "https://qa.onlinemastermarket.com/";

    @Given("Geçerli bir servis ID'si mevcut")
    public void geçerli_bir_servis_ıd_si_mevcut() {
        // WebDriver'ı başlat
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("Servis ID'sine göre servis bilgilerini al")
    public void servis_id_sine_göre_servis_bilgilerini_al() {
        // Web sayfasında servis ID'sini arayın ve detayları alın
        WebElement serviceIdField = driver.findElement(By.id("67"));
        serviceIdField.sendKeys("67");

        WebElement searchButton = driver.findElement(By.id("search_button")); // id veya uygun locator kullanın
        searchButton.click();
    }

    @Then("Yanıtın içinde service_id, service_title, service_amount, category_name, service_offered, service_latitude, service_longitude, about, ratings, rating_count, views, currency bilgileri bulunmalıdır")
    public void yanıtın_içinde_service_id_service_title_service_amount_category_name_service_offered_service_latitude_service_longitude_about_ratings_rating_count_views_currency_bilgileri_bulunmalıdır() {
        // Yanıtın içeriğini kontrol et
        WebElement serviceId = driver.findElement(By.id(""));
        WebElement serviceTitle = driver.findElement(By.id("T"));
        WebElement serviceAmount = driver.findElement(By.id(""));
        WebElement categoryName = driver.findElement(By.id(""));
        WebElement serviceOffered = driver.findElement(By.id(""));
        WebElement serviceLatitude = driver.findElement(By.id(""));
        WebElement serviceLongitude = driver.findElement(By.id(""));
        WebElement about = driver.findElement(By.id(""));
        WebElement ratings = driver.findElement(By.id(""));
        WebElement ratingCount = driver.findElement(By.id(""));
        WebElement views = driver.findElement(By.id(""));
        WebElement currency = driver.findElement(By.id(""));

        assertTrue(serviceId.isDisplayed());
        assertTrue(serviceTitle.isDisplayed());
        assertTrue(serviceAmount.isDisplayed());
        assertTrue(categoryName.isDisplayed());
        assertTrue(serviceOffered.isDisplayed());
        assertTrue(serviceLatitude.isDisplayed());
        assertTrue(serviceLongitude.isDisplayed());
        assertTrue(about.isDisplayed());
        assertTrue(ratings.isDisplayed());
        assertTrue(ratingCount.isDisplayed());
        assertTrue(views.isDisplayed());
        assertTrue(currency.isDisplayed());

        driver.quit();
    }

    @Given("Geçersiz bir servis ID'si mevcut")
    public void geçersiz_bir_servis_ıd_si_mevcut() {
        // WebDriver'ı başlat
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("Geçersiz servis ID'si ile sorgu yap")
    public void geçersiz_servis_id_si_ile_sorgu_yap() {
        // Web sayfasında geçersiz servis ID'sini arayın
        WebElement serviceIdField = driver.findElement(By.id("67"));
        serviceIdField.sendKeys("9999");

        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();
    }

    @Then("Geçersiz servis ID'si için hata mesajı görünmelidir")
    public void geçersiz_servis_id_si_için_hata_mesajı_görünmelidir() {
        // Hata mesajını kontrol et
        WebElement errorMessage = driver.findElement(By.id("error_message"));
        assertTrue(errorMessage.isDisplayed());

        driver.quit();

    }
}