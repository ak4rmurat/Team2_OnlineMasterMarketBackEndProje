Feature: Servis Listesi Alma

  Scenario: Geçerli Authorization ile Servis Listesi Alma
    Given Geçerli bir authorization token mevcut
    When "/api/myServices" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın response_message alanında "Service list" olmalıdır

  Scenario: Geçerli Authorization ile Belirli Servisin Bilgilerini Alma
    Given Geçerli bir authorization token mevcut
    And Geçerli bir service_id mevcut
    When "/api/myServices" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın içinde service_id, service_title, service_location, finalAmount, service_image, category_name, ratings, rating_count, user_image, currency_code, is_active, currency, service_amount bilgileri bulunmalıdır

  Scenario: Geçersiz Authorization ile Servis Listesi Alma
    Given Geçersiz bir authorization token mevcut
    When "/api/myServices" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer invalid_token |
    Then Yanıtın HTTP status kodu 401 olmalıdır
    And Yanıtın response_message alanında "Invalid token or token missing" olmalıdır
