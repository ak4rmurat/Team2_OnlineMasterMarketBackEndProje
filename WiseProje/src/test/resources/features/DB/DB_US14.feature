Feature: Kategoriler Tablosunda Cinsiyet ve Kategori Türüne Göre Kategori Sayısını Gruplama

  Scenario: Cinsiyet ve Kategori Türüne Göre Kategori Sayısını Listeleme
    Given Veritabanına bağlanıldı
    When "SELECT gender, category_type, COUNT(*) as category_count FROM categories GROUP BY gender, category_type;" sorgusu çalıştırılır
    Then Yanıt başarıyla alınmalıdır
    And Yanıttaki her `gender` ve `category_type` kombinasyonu için `category_count` doğru olmalıdır
