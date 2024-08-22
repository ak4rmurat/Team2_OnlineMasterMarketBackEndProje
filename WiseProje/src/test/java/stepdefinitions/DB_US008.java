package stepdefinitions;

import io.cucumber.java.en.Given;
import manage.Manage;
import utilities.DB_Utilities.JDBCMethods;
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

        if (Integer.parseInt(getUS08_inactiveKullaniciSayisi())==0){
            System.out.println("Inactive kullanici sayisi: "+inactiveKullaniciSayisiQuery);
        }
        else{
            System.out.println(getUS08_inactiveKullaniciSayisi());
        }


    }

}
