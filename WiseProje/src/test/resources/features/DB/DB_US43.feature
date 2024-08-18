Feature: `shop_service_offered` Tablosunda Bir Servis İçin İndirim Oluşturma ve `service_offered` Alanını Güncelleme

  Scenario: İndirim Oluşturma ve Servis Bilgilerini Güncelleme
    Given Veritabanına bağlanıldı
    When "SELECT * FROM shop_service_offered WHERE service_id = <specified_service_id>;" sorgusu çalıştırılır
    Then Mevcut veriler başarıyla alınmalıdır
    When "UPDATE shop_service_offered SET discount = <discount_value>, service_offered = <new_service_offered_value> WHERE service_id = <specified_service_id>;" sorgusu çalıştırılır
    Then Güncelleme işlemi başarıyla gerçekleştirilmelidir
    When "SELECT * FROM shop_service_offered WHERE service_id = <specified_service_id>;" sorgusu çalıştırılır
    Then Güncellenmiş veriler doğrulanmalıdır
    And `service_offered` ve `discount` alanları doğru olmalıdır
