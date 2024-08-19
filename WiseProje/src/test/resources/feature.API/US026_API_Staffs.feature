Feature: Bir provider olarak API bağlantısı üzerinden staffs'a erişebilmek istiyorum.

  Scenario: Staff List  -  AC 1

    * Api kullanicisi "api/myStaffs" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staffs Listed Successfully" oldugunu dogrular





  Scenario Outline: my Staff   -   AC 2
    * Api kullanicisi "api/myStaffs" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanıcısı response body icindeki <dataIndex> indexe sahip olanin "<provider_id>", "<first_name>", "<last_name>", "<country_code>", "<contact_no>", "<email>", "<dob>", "<gender>", "<profile_img>", "<designation>", "<exp_year>", "<exp_month>", "<status>" bilgilerini doğrular.

    Examples:
      | dataIndex | provider_id | first_name    | last_name | country_code | contact_no | email           | dob         | gender | profile_img                       | designation | exp_year | exp_month | status |
      | 0         |     4       | Marcus Hayes  |           |        1     | 2157893265 | marcus@gmail.com | 1984-10-19 | Male  | https://qa.onlinemastermarket.com/ |            |           |       0   | Active |






  Scenario: Invalid Token Blog List   -   AC 3

    * Api kullanicisi "api/myStaffs" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular


