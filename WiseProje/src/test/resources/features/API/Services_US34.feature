Feature: Servis Güncelleme

  Scenario: Geçerli ID ve Data ile Servis Güncelleme
    Given Geçerli bir authorization token mevcut
    And Geçerli bir servis ID'si mevcut
    When "/api/editService/{valid_id}" endpoint'ine PATCH request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Updated Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "55",|
      |                  |   "about": "Updated description"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın response_message alanında "Service updated successfully" olmalıdır

  Scenario: Data İçermeyen PATCH Request ile Servis Güncelleme
    Given Geçerli bir authorization token mevcut
    And Geçerli bir servis ID'si mevcut
    When "/api/editService/{valid_id}" endpoint'ine PATCH request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {}               |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "No data for updated." olmalıdır

  Scenario: ID İçermeyen PATCH Request ile Servis Güncelleme
    Given Geçerli bir authorization token mevcut
    When "/api/editService/" endpoint'ine PATCH request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Updated Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "55",|
      |                  |   "about": "Updated description"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Id missing" olmalıdır

  Scenario: Geçersiz ID ile Servis Güncelleme
    Given Geçerli bir authorization token mevcut
    And Geçersiz bir servis ID'si mevcut
    When "/api/editService/{invalid_id}" endpoint'ine PATCH request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Updated Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "55",|
      |                  |   "about": "Updated description"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "No Results found for the given ID" olmalıdır

  Scenario: Geçersiz Authorization ile Servis Güncelleme
    Given Geçersiz bir authorization token mevcut
    And Geçerli bir servis ID'si mevcut
    When "/api/editService/{valid_id}" endpoint'ine PATCH request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer invalid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Updated Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "55",|
      |                  |   "about": "Updated description"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 401 olmalıdır
    And Yanıtın response_message alanında "Invalid token or token missing" olmalıdır

  Scenario: Güncellenmiş Servis Bilgilerinin Doğrulanması
    Given Başarılı bir şekilde servis güncelleme isteği gönderildi
    And Yanıtta dönen updated_service_id bilgisi alındı
    When "/api/service-details/{updated_service_id}" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın içinde güncellenmiş servise ait bilgiler doğrulanmalıdır
