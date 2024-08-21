package stepdefinitions;

import helperDB.JDBC_Structure_Methods;
import io.cucumber.java.en.Given;
import utilities.DB_Utilities.JDBCMethods;

public class DB_US006 {


    @Given("veri tabanina baglanti kurulur")
    public void veri_tabanina_baglanti_kurulur() {

        JDBC_Structure_Methods.createConnection();

    }
    @Given("status degeri active inactive ve pending olan dort tane query olusturulur")
    public void status_degeri_active_inactive_ve_pending_olan_tane_query_olusturulur() {



    }
    @Given("olusturulan queryler bank_account tablosuna eklenir")
    public void olusturulan_queryler_bank_account_tablosuna_eklenir() {



    }
    @Given("tabloya eklenen datalardan aktif olan hesaplar dogrulanir")
    public void tabloya_eklenen_datalardan_aktif_olan_hesaplar_dogrulanir() {



    }
    @Given("veri tabani ile baglanti kesilir")
    public void veri_tabani_ile_baglanti_kesilir() {

        JDBC_Structure_Methods.closeConnection();

    }

}
