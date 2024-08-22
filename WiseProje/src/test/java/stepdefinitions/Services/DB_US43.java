/*package stepdefinitions.Services;


import io.cucumber.java.en.Then;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Assert;
import java.util.Map;
import java.util.HashMap;


public class DB_US43 {

    private Connection connection;
    private ResultSet resultSet;
    private Map<String, String> existingData = new HashMap<>();
    private String tableName = "your_table_name"; // Güncelleme işleminin yapıldığı tablo adı

    @Then("Mevcut veriler başarıyla alınmalıdır")
    public void mevcut_veriler_başarıyla_alınmalıdır() {
        try {
            // Mevcut verileri almak için SQL sorgusu
            String query = "SELECT * FROM " + tableName + " WHERE your_condition;"; // Gerekli koşulu belirtin
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Sonuçları kaydetme
            Assert.assertTrue("Mevcut veriler alınamadı", resultSet.next());
            existingData.put("service_offered", resultSet.getString("service_offered"));
            existingData.put("discount", resultSet.getString("discount"));

        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Mevcut veriler alınırken bir hata oluştu: " + e.getMessage());
        }
    }

    @Then("Güncelleme işlemi başarıyla gerçekleştirilmelidir")
    public void güncelleme_işlemi_başarıyla_gerçekleştirilmelidir() {
        try {
            // Güncellenmiş veriyi almak için SQL sorgusu
            String query = "SELECT * FROM " + tableName + " WHERE your_condition;"; // Gerekli koşulu belirtin
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Güncellenmiş veriyi kontrol etme
            Assert.assertTrue("Güncelleme işlemi başarısız oldu, sonuçlar boş", resultSet.next());

        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Güncelleme işlemi gerçekleştirilirken bir hata oluştu: " + e.getMessage());
        }
    }

    @Then("Güncellenmiş veriler doğrulanmalıdır")
    public void güncellenmiş_veriler_doğrulanmalıdır() {
        try {
            // Güncellenmiş verileri doğrulamak için SQL sorgusu
            String query = "SELECT * FROM " + tableName + " WHERE your_condition;"; // Gerekli koşulu belirtin
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Sonuçların doğruluğunu kontrol etme
            Assert.assertTrue("Güncellenmiş veriler bulunamadı", resultSet.next());
            // Örneğin:
            String updatedServiceOffered = resultSet.getString("service_offered");
            String updatedDiscount = resultSet.getString("discount");

            // Mevcut veri ile karşılaştırma yapabilirsiniz veya beklenen bir veri seti ile doğrulama yapabilirsiniz
            Assert.assertNotEquals("service_offered güncellenmedi", existingData.get("service_offered"), updatedServiceOffered);
            Assert.assertNotEquals("discount güncellenmedi", existingData.get("discount"), updatedDiscount);

        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Güncellenmiş veriler doğrulanırken bir hata oluştu: " + e.getMessage());
        }
    }

    @Then("`service_offered` ve `discount` alanları doğru olmalıdır")
    public void service_offered_ve_discount_alanları_doğru_olmalıdır() {
        try {
            // Güncellenmiş verileri doğrulamak için SQL sorgusu
            String query = "SELECT service_offered, discount FROM " + tableName + " WHERE your_condition;"; // Gerekli koşulu belirtin
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            Assert.assertTrue("Sonuç kümesi boş, service_offered ve discount alınamadı", resultSet.next());

            // Örnek olarak beklenen değerler ile doğrulama
            String expectedServiceOffered = "expected_value"; // Beklenen değeri belirleyin
            String expectedDiscount = "expected_value"; // Beklenen değeri belirleyin

            String actualServiceOffered = resultSet.getString("service_offered");
            String actualDiscount = resultSet.getString("discount");

            Assert.assertEquals("service_offered alanı beklenenle eşleşmiyor", expectedServiceOffered, actualServiceOffered);
            Assert.assertEquals("discount alanı beklenenle eşleşmiyor", expectedDiscount, actualDiscount);

        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("service_offered ve discount alanları doğrulanırken bir hata oluştu: " + e.getMessage());
        }
    }



}


 */