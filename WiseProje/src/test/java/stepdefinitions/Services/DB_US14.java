package stepdefinitions.Services;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;



public class DB_US14 {
    private Connection connection;
    private ResultSet resultSet;
    private String jdbcUrl = "URL: \"jdbc:mysql://45.87.83.5/u168183796_qaonlineuser\";\t"; // Veritabanı URL'i
    private String username = "USERNAME= \"u168183796_qaonlineuser\";\t"; // Veritabanı kullanıcı adı
    private String password = "PASSWORD=\"Fi8]K0dv*7g\";\t"; // Veritabanı şifresi

    @Given("Veritabanına bağlanıldı")
    public void veritabanına_bağlanıldı() {
        try {
            // Veritabanına bağlanma
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            Assert.assertNotNull("Veritabanı bağlantısı kurulamadı", connection);
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Veritabanına bağlanırken bir hata oluştu: " + e.getMessage());
        }
    }

    @When("{string} sorgusu çalıştırılır")
    public void sorgusu_çalıştırılır(String query) {
        try {
            // SQL sorgusunu çalıştırma
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Assert.assertNotNull("Sorgu sonucu alınamadı", resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Sorgu çalıştırılırken bir hata oluştu: " + e.getMessage());
        }
    }

    @Then("Yanıt başarıyla alınmalıdır")
    public void yanıt_başarıyla_alınmalıdır() {
        try {
            // Sonuç kümesi varsa başarıyla sorgu çalıştırılmıştır
            Assert.assertTrue("Sonuç kümesi boş", resultSet.next());
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Yanıt alınırken bir hata oluştu: " + e.getMessage());
        }
    }

    @Then("Yanıttaki her `gender` ve `category_type` kombinasyonu için `category_count` doğru olmalıdır")
    public void yanıttaki_her_gender_ve_category_type_kombinasyonu_için_category_count_doğru_olmalıdır() {
        try {
            Map<String, Integer> combinationCountMap = new HashMap<>();

            // Sonuçları işleme
            while (resultSet.next()) {
                String gender = resultSet.getString("gender");
                String categoryType = resultSet.getString("category_type");
                int categoryCount = resultSet.getInt("category_count");

                String key = gender + "_" + categoryType;
                combinationCountMap.put(key, combinationCountMap.getOrDefault(key, 0) + categoryCount);
            }

            // Her kombinasyonun sayısının doğruluğunu kontrol etme
            for (Map.Entry<String, Integer> entry : combinationCountMap.entrySet()) {
                String key = entry.getKey();
                int actualCount = entry.getValue();
                // Bu kısımda, actualCount'u doğrulamak için kendi kontrol mekanizmanızı kullanmalısınız
                // Örneğin, beklenen değeri başka bir sorgudan ya da sabit bir veri setinden alabilirsiniz
                int expectedCount = getExpectedCountForCombination(key); // Bu method'u sizin belirlemeniz gerekecek
                Assert.assertEquals("Kombinasyon için category_count yanlış: " + key, expectedCount, actualCount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Yanıttaki veriler işlenirken bir hata oluştu: " + e.getMessage());
        }
    }

    private int getExpectedCountForCombination(String key) {
        // Bu method'u kendi iş kurallarınıza göre implement etmeniz gerekiyor
        // Örneğin, sabit bir değer dönebilir ya da başka bir veritabanı sorgusu yapabilirsiniz
        return 0; // Örneğin, doğru değerlerle bu kısmı değiştirmelisiniz
    }

}
