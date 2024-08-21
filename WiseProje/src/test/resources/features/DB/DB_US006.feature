Feature: bank_account tablosunda status degeri active, inactive, pending olan rastgele 4 data ekleme.Tabloya eklenen datalardan aktif olan hesapları dogrulama

  Scenario: Data ekleme ve eklenenlerden aktif olanlari dogrulama

    * veri tabanina baglanti kurulur
    * status degeri active inactive ve pending olan dort tane query olusturulur
    * olusturulan queryler bank_account tablosuna eklenir
    * tabloya eklenen datalardan aktif olan hesaplar dogrulanir
    * veri tabani ile baglanti kesilir