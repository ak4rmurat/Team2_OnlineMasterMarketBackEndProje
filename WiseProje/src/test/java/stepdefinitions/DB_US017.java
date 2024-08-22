package stepdefinitions;

import io.cucumber.java.en.Given;
import manage.Manage;

public class DB_US017 extends Manage {


    @Given("contact_form_details tablosundan en cok gonderi yapan kisinin adi ve mesaj sayisi dogrulanir")
    public void contact_form_details_tablosundan_en_cok_gonderi_yapan_kisinin_adi_ve_mesaj_sayisi_dogrulanir() {

        String kisiAdi = getUS17_enCokMesajGonderenKisi();
        String enCokAtilanMesaj = getUS17_enCokAtilanMesaj();

        System.out.println("En cok mesaj gonderen kisi: "+kisiAdi+"\n"+
                            "En cok atilan mesaj: "+enCokAtilanMesaj);

    }

}
