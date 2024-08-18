Feature: En Son Oluşturulan 3 Şifre Sıfırlama Talebini Gerçekleştiren Kullanıcıların Bilgilerini Doğrulama

  Scenario: En Son 3 Şifre Sıfırlama Talebini Gerçekleştiren Kullanıcıların `user_id` ve `email` Bilgilerini Doğrulama
    Given Veritabanına bağlanıldı
    When "SELECT user_id, email FROM password_reset_requests ORDER BY created_at DESC LIMIT 3;" sorgusu çalıştırılır
    Then Yanıt başarıyla alınmalıdır
    And Yanıttaki `user_id` ve `email` bilgileri `users` tablosundaki kayıtlarla doğrulanmalıdır
    And Beklenen `user_id` ve `email` bilgileri doğru olmalıdır
