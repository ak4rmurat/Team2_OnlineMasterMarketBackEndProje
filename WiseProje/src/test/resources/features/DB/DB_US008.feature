Feature: bank_account tablosunda statusu inactive olanlari silme.Silindiğini dogrulama

  Scenario: Tablodan inactive olanlari silme ve silindigini dogrulama

    * veri tabanina baglanti kurulur
    * bank_account tablosundan statusu inactive kullanicilar silinir
    * istenilen hesaplarin silindigi dogrulanir
    * veri tabani ile baglanti kesilir