Feature: Bir provider olarak API baglantisi üzerinden belirtilen id numarasına sahip staff'ın bilgilerini güncelleyebilmek istiyorum.


  Scenario Outline: Staff güncelleme   -   AC 1


    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>","<firstname>", "<mobileno>", "<email>", "<gender>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff updated successfully" oldugunu dogrular

    Examples:
      | id    | firstname | mobileno    | email           | gender       |  shop_id   | about_emp    |
      |  102  | Muhammed  |  123456789  | staffmail.gmail | Male         |     25     |    ---       |


  Scenario Outline: Staff güncelleme   -   AC 2


    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>","<firstname>", "<mobileno>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff updated successfully" oldugunu dogrular

    Examples:
      | id    | firstname | mobileno    |
      |  102  | Muhammed  |  123456789  |




  Scenario Outline: Staff güncelleme doğru id ve  data icermeyen bilgiler ile -   AC 3


    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>"bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "No data for updated." oldugunu dogrular

    Examples:
      | id    |
      |  12  |




  Scenario Outline: Staff güncelleme  id icermeyen bilgiler ile  -   AC 4

    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>","<firstname>", "<mobileno>", "<email>", "<gender>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Id missing" oldugunu dogrular

    Examples:
      | id    | firstname | mobileno    | email           | gender       |  shop_id   | about_emp    |
      |       | Muhammed  |  123456789  | staffmail.gmail | Male         |     25     |    ---       |




  Scenario Outline: Staff güncelleme kaydı olmayıp doğru data girişi ile   -   AC 5

    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>","<firstname>", "<mobileno>", "<email>", "<gender>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Failed to update staff.No staff this id." oldugunu dogrular

    Examples:
      | id     | firstname | mobileno    | email           | gender       |  shop_id   | about_emp    |
      | 757676 | Muhammed  |  123456789  | staffmail.gmail | Male         |     25     |    ---       |



  Scenario Outline: Invalid Token ile Staff güncelleme denemesi   -   AC 6

    * Api kullanicisi "api/editStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi api editstaff endpointine gondermek icin "<id>","<firstname>", "<mobileno>", "<email>", "<gender>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "PATCH" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular

    Examples:
      | id     | firstname | mobileno    | email           | gender       |  shop_id   | about_emp    |
      | 97     | Muhammed  |  123456789  | staffmail.gmail | Male         |     25     |    ---       |










