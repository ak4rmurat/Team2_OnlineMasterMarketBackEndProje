Feature: Servis Detaylarını Alma

  Scenario: Geçerli Authorization ile Servis Detaylarını Alma
    Given Geçerli bir authorization token mevcut
    And Geçerli bir servis ID'si mevcut
    When "/api/service-details/{id}" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın response_message alanında "Service Details" olmalıdır
    And Yanıtın içinde service_id, service_title, service_amount, category_name, service_offered, service_latitude, service_longitude, about, ratings, rating_count, views, currency bilgileri bulunmalıdır

  Scenario: ID İçermeyen GET Request ile Servis Detayları Alma
    Given Geçerli bir authorization token mevcut
    When "/api/service-details/" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Id missing" olmalıdır

  Scenario: Geçersiz ID ile Servis Detaylarını Alma
    Given Geçerli bir authorization token mevcut
    And Geçersiz bir servis ID'si mevcut
    When "/api/service-details/{invalid_id}" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "No Details found" olmalıdır

