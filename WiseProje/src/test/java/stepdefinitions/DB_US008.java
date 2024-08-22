package stepdefinitions;

import helperDB.JDBC_Structure_Methods;
import io.cucumber.java.en.Given;
import manage.Manage;
import utilities.DB_Utilities.JDBCMethods;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_US008 extends Manage {


    @Given("bank_account tablosundan statusu inactive kullanicilar silinir")
    public void bank_account_tablosundan_statusu_inactive_kullanicilar_silinir() throws SQLException {

        String inactiveKullaniciSil = getUS08_inactiveKullaniciSil();
        JDBCMethods.executeQuery(inactiveKullaniciSil);

    }
    @Given("istenilen hesaplarin silindigi dogrulanir")
    public void istenilen_hesaplarin_silindigi_dogrulanir() throws SQLException {

        String inactiveKullaniciSayisiQuery = getUS08_inactiveKullaniciSayisi();
        JDBCMethods.executeQuery(inactiveKullaniciSayisiQuery);

        PreparedStatement preparedStatement= JDBC_Structure_Methods.getPraperedStatement(inactiveKullaniciSayisiQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (!resultSet.next()){
            System.out.println("Iliskili tabloda Inactive kullanici yoktur");
        }

    }

}
