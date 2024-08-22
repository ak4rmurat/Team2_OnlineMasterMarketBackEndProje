Feature: Servis Silme

  Scenario: Geçerli ID ile Servis Silme
    Given Geçerli bir authorization token mevcut
    And Geçerli bir servis ID'si mevcut
    When "/api/deleteService/{valid_id}" endpoint'ine DELETE request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın response_message alanında "Service deleted successfully" olmalıdır

  Scenario: ID İçermeyen DELETE Request ile Servis Silme
    Given Geçerli bir authorization token mevcut
    When "/api/deleteService/" endpoint'ine DELETE request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Id missing" olmalıdır

  Scenario: Geçersiz ID ile Servis Silme
    Given Geçerli bir authorization token mevcut
    And Geçersiz bir servis ID'si mevcut
    When "/api/deleteService/{invalid_id}" endpoint'ine DELETE request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Service delete failed. No service this id." olmalıdır

  Scenario: Geçersiz Authorization ile Servis Silme
    Given Geçersiz bir authorization token mevcut
    When "/api/deleteService/{valid_id}" endpoint'ine DELETE request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer invalid_token |
    Then Yanıtın HTTP status kodu 401 olmalıdır
    And Yanıtın response_message alanında "Invalid token or token missing" olmalıdır

  Scenario: Silinen Servis Bilgilerinin Doğrulanması
    Given Başarılı bir şekilde servis silme isteği gönderildi
    And Yanıtta dönen deleted_service_id bilgisi alındı
    When "/api/service-details/{deleted_service_id}" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Service delete failed. No service this id." olmalıdır
