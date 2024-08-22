Feature: Servis Ekleme

  Scenario: Geçerli Authorization ile Servis Ekleme
    Given Geçerli bir authorization token mevcut
    When "/api/addService" endpoint'ine POST request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Premium Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "50",|
      |                  |   "about": "Premium professional haircut service"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın response_message alanında "Service added successfully" olmalıdır

  Scenario: Eksik Data ile Servis Ekleme
    Given Geçerli bir authorization token mevcut
    When "/api/addService" endpoint'ine POST request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Premium Haircut",|
      |                  |   "category": "Grooming"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Add service failed, required fields empty" olmalıdır

  Scenario: Data İçermeyen POST Request ile Servis Ekleme
    Given Geçerli bir authorization token mevcut
    When "/api/addService" endpoint'ine POST request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
      | Content-Type      | application/json |
      | Body              | {}               |
    Then Yanıtın HTTP status kodu 203 olmalıdır
    And Yanıtın response_message alanında "Add service failed, required fields empty" olmalıdır

  Scenario: Geçersiz Authorization ile Servis Ekleme
    Given Geçersiz bir authorization token mevcut
    When "/api/addService" endpoint'ine POST request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer invalid_token |
      | Content-Type      | application/json |
      | Body              | {                |
      |                  |   "shop_id": "1",|
      |                  |   "staff_id": "2",|
      |                  |   "duration": "90",|
      |                  |   "service_title": "Premium Haircut",|
      |                  |   "category": "Grooming",|
      |                  |   "subcategory": "Men's Haircut",|
      |                  |   "service_amount": "50",|
      |                  |   "about": "Premium professional haircut service"|
      |                  | }                |
    Then Yanıtın HTTP status kodu 401 olmalıdır
    And Yanıtın response_message alanında "Invalid token or token missing" olmalıdır

  Scenario: Servis Eklendiğini Doğrulama
    Given Başarılı bir şekilde servis eklendi
    And Yanıtta dönen added_service_id bilgisi alındı
    When "/api/service-details/{added_service_id}" endpoint'ine GET request gönderilir
      | Header            | Value            |
      | Authorization     | Bearer valid_token |
    Then Yanıtın HTTP status kodu 200 olmalıdır
    And Yanıtın içinde eklenen servise ait bilgiler doğrulanmalıdır
