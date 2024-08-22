package stepdefinitions.Services;

import io.cucumber.java.en.Given;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DB_US23 {


    private Connection connection;
    private ResultSet resultSet;
    private String jdbcUrl = "URL: \"jdbc:mysql://45.87.83.5/u168183796_qaonlineuser\";\t"; // Veritabanı URL'i
    private String username = "USERNAME= \"u168183796_qaonlineuser\";\t"; // Veritabanı kullanıcı adı
    private String password = "PASSWORD=\"Fi8]K0dv*7g\";\t"; // Veritabanı şifresi

    private List<Map<String, String>> resetRequests = new ArrayList<>();

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
}