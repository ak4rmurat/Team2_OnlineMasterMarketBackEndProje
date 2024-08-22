package stepdefinitions;

import helperDB.JDBC_Structure_Methods;
import io.cucumber.java.en.Given;
import static helperDB.JDBC_Structure_Methods.*;
import static helperDB.JDBC_Structure_Methods.preparedStatement;
import helperDB.CommonData;
import manage.Manage;
import utilities.DB_Utilities.JDBCMethods;

import java.sql.SQLException;


public class DB_US006 extends Manage{

    CommonData data1;
    CommonData data2;
    CommonData data3;
    CommonData data4;

    @Given("veri tabanina baglanti kurulur")
    public void veri_tabanina_baglanti_kurulur() {

        JDBC_Structure_Methods.createConnection();

    }
    @Given("status degeri active inactive ve pending olan dort tane query olusturulur")
    public void status_degeri_active_inactive_ve_pending_olan_tane_query_olusturulur() throws SQLException {

        String kullaniciEklemeQuery = getUS06_bankAccountVeriGirisi();
        preparedStatement=getPraperedStatement(kullaniciEklemeQuery);

        preparedStatement.setString(1,data.getEmail());
        preparedStatement.setString(2,data.getPassword());
        preparedStatement.setString(3,data.getUsername());
        preparedStatement.setString(4,data.getFullName());
        preparedStatement.setString(5,data.getProfileImg());
        preparedStatement.setInt(6,data.getRole());
        preparedStatement.setString(7,data.getToken());
        preparedStatement.setString(8,data.getToken());
        preparedStatement.setString(9,data.getToken());
        preparedStatement.setString(10,data.getToken());
        preparedStatement.setString(11,data.getToken());

    }
    @Given("olusturulan queryler bank_account tablosuna eklenir")
    public void olusturulan_queryler_bank_account_tablosuna_eklenir() {



    }
    @Given("tabloya eklenen datalardan aktif olan hesaplar dogrulanir")
    public void tabloya_eklenen_datalardan_aktif_olan_hesaplar_dogrulanir() {

        String statusuActiveOlanKullanicilar = getUS06_bankAccountStatusActive();
        JDBCMethods.executeQuery(statusuActiveOlanKullanicilar);

    }
    @Given("veri tabani ile baglanti kesilir")
    public void veri_tabani_ile_baglanti_kesilir() {

        JDBC_Structure_Methods.closeConnection();

    }

}
