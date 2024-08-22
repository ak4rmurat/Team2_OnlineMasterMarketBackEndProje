package stepdefinitions;

import helperDB.JDBC_Structure_Methods;
import io.cucumber.java.en.Given;
import manage.Manage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_US017 extends Manage {


    @Given("contact_form_details tablosundan en cok gonderi yapan kisinin adi ve mesaj sayisi dogrulanir")
    public void contact_form_details_tablosundan_en_cok_gonderi_yapan_kisinin_adi_ve_mesaj_sayisi_dogrulanir() throws SQLException {

        String enCokMesajGonderenKisiAdi = getUS17_enCokMesajGonderenKisi();
        ResultSet enCokMesajAtanKisiAdi = JDBC_Structure_Methods.getPraperedStatement(enCokMesajGonderenKisiAdi).executeQuery();
        System.out.println("En cok mesaj atan kisi: "+enCokMesajAtanKisiAdi.getNString("name"));



        String enCokAtilanMesajSayisi = getUS17_enCokAtilanMesaj();
        PreparedStatement preparedStatement = JDBC_Structure_Methods.getPraperedStatement(enCokAtilanMesajSayisi);
        int mesajSayisi = preparedStatement.executeUpdate();
        System.out.println("En cok mesaj atma sayisi: "+mesajSayisi);

    }

}
