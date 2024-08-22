package stepdefinitions;

import helperDB.JDBC_Structure_Methods;
import io.cucumber.java.en.Given;
import static helperDB.JDBC_Structure_Methods.*;
import static helperDB.JDBC_Structure_Methods.preparedStatement;
import manage.Manage;
import utilities.DB_Utilities.JDBCMethods;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class DB_US006 extends Manage{

    String kullaniciEklemeQuery1 = getUS06_bankAccountVeriGirisi();
    PreparedStatement preparedStatement1=getPraperedStatement(kullaniciEklemeQuery1);

    String kullaniciEklemeQuery2 = getUS06_bankAccountVeriGirisi();
    PreparedStatement preparedStatement2=getPraperedStatement(kullaniciEklemeQuery2);

    String kullaniciEklemeQuery3 = getUS06_bankAccountVeriGirisi();
    PreparedStatement preparedStatement3=getPraperedStatement(kullaniciEklemeQuery3);

    String kullaniciEklemeQuery4 = getUS06_bankAccountVeriGirisi();
    PreparedStatement preparedStatement4=getPraperedStatement(kullaniciEklemeQuery4);

    
    @Given("veri tabanina baglanti kurulur")
    public void veri_tabanina_baglanti_kurulur() {

        JDBC_Structure_Methods.createConnection();

    }
    @Given("status degeri active inactive ve pending olan dort tane query olusturulur")
    public void status_degeri_active_inactive_ve_pending_olan_tane_query_olusturulur() throws SQLException {


        preparedStatement1.setInt(1,77);
        preparedStatement1.setInt(2,112);
        preparedStatement1.setString(3,"David Lidd");
        preparedStatement1.setString(4,"149853233785");
        preparedStatement1.setString(5,"Wells Fargo");
        preparedStatement1.setString(6,"7890 Oak Lane, TX");
        preparedStatement1.setString(7,"WELF0000003");
        preparedStatement1.setString(8,"EEUFK7018A");
        preparedStatement1.setString(9,"david_lidd409");
        preparedStatement1.setString(10,"david.lidd@example.com");
        preparedStatement1.setString(11,"active");

        preparedStatement2.setInt(1,25);
        preparedStatement2.setInt(2,113);
        preparedStatement2.setString(3,"Ashton Cox");
        preparedStatement2.setString(4,"149853260085");
        preparedStatement2.setString(5,"Wells Fargo");
        preparedStatement2.setString(6,"7890 Oak Lane, TX");
        preparedStatement2.setString(7,"WELF0000003");
        preparedStatement2.setString(8,"THUJJ6438A");
        preparedStatement2.setString(9,"ashton_cox556");
        preparedStatement2.setString(10,"ashton.cox@example.com");
        preparedStatement2.setString(11,"inactive");

        preparedStatement3.setInt(1,3284);
        preparedStatement3.setInt(2,114);
        preparedStatement3.setString(3,"Andy Moore");
        preparedStatement3.setString(4,"149858260785");
        preparedStatement3.setString(5,"Citi Bank");
        preparedStatement3.setString(6,"4321 Pine Street, FL");
        preparedStatement3.setString(7,"CITI0000004");
        preparedStatement3.setString(8,"THOOK4438A");
        preparedStatement3.setString(9,"andy_moore894");
        preparedStatement3.setString(10,"andy.moore@example.com");
        preparedStatement3.setString(11,"pending");

        preparedStatement4.setInt(1,4);
        preparedStatement4.setInt(2,115);
        preparedStatement4.setString(3,"Allen Page");
        preparedStatement4.setString(4,"149853760785");
        preparedStatement4.setString(5,"Bank of America");
        preparedStatement4.setString(6,"1234 Elm Street, NY");
        preparedStatement4.setString(7,"BOFA0000001");
        preparedStatement4.setString(8,"ABUFK0128A");
        preparedStatement4.setString(9,"allen_page778");
        preparedStatement4.setString(10,"allen.page@example.com");
        preparedStatement4.setString(11,"active");


    }
    @Given("olusturulan queryler bank_account tablosuna eklenir")
    public void olusturulan_queryler_bank_account_tablosuna_eklenir() throws SQLException {

        preparedStatement1.execute();
        preparedStatement2.execute();
        preparedStatement3.execute();
        preparedStatement4.execute();

    }
    @Given("tabloya eklenen datalardan aktif olan hesaplar dogrulanir")
    public void tabloya_eklenen_datalardan_aktif_olan_hesaplar_dogrulanir() {

        String statusuActiveOlanKullanicilar = getUS06_bankAccountStatusActive();
        List<List<Object>> activeKullanicilar = JDBCMethods.getQueryResultList(statusuActiveOlanKullanicilar);

        if (!activeKullanicilar.isEmpty()){
            System.out.println("Database has values with 'active' status");
        }else {
            System.out.println("Result List is empty!");
        }


    }
    @Given("veri tabani ile baglanti kesilir")
    public void veri_tabani_ile_baglanti_kesilir() {

        JDBC_Structure_Methods.closeConnection();

    }

}
