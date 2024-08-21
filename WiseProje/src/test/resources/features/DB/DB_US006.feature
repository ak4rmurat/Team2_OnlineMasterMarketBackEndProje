Feature: bank_account tablosunda status degeri active, inactive, pending olan rastgele 4 data ekleme.Tabloya eklenen datalardan aktif olan hesapları dogrulama

  Scenario: Data ekleme ve eklenenlerden aktif olanlari dogrulama

    * veri tabanina baglanti kurulur
    * bank_account tablosuna status degeri active, inactive ve pending olan rastgele 4 data eklenir
    * tabloya eklenen datalardan aktif olan hesaplar dogrulanir
    * veri tabani ile baglanti kesilir