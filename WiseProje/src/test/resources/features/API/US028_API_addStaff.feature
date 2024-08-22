Feature: Bir provider olarak API bağlantısı üzerinden yeni bir staff kaydı olusturabilmek istiyorum.


  Scenario Outline: Staff ekleme   -   AC 1


    * Api kullanicisi "api/addStaff" path parametrelerini olusturur
    * Api kullanicisi api addBlog endpointine gondermek icin "<firstname>", "<mobileno>", "<email>", "<gender>", "<dob>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydeder-post
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff added successfully" oldugunu dogrular

    Examples:
      | firstname | mobileno    | email           | gender       |     dob       | shop_id   | about_emp    |
      | Mehmet  |  123456789  | staffmail.gmail | Male         | 05.06.1999    |    25     |    ---       |




  Scenario Outline: Staff ekleme 203 hatalı   -   AC 2

    * Api kullanicisi "api/addStaff" path parametrelerini olusturur
    * Api kullanicisi api addBlog endpointine gondermek icin "<firstname>", "<mobileno>", "<email>", "<gender>", "<dob>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydeder-post
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Missing required fields.Firstname,mobileno,email,gender,dob and shop_id." oldugunu dogrular

    Examples:
      | firstname | mobileno  | email           | gender | dob        | shop_id | about_emp |
      |           |           |                 |        |            |         |           |





  Scenario Outline: Staff ekleme 203 hatalı   -   AC 3

    * Api kullanicisi "api/addStaff" path parametrelerini olusturur
    * Api kullanicisi api addBlog endpointine gondermek icin "<firstname>", "<mobileno>", "<email>", "<gender>", "<dob>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydeder-post
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Missing required fields.Firstname,mobileno,email,gender,dob and shop_id." oldugunu dogrular

    Examples:
      | firstname | mobileno  | email     | gender |  dob     | shop_id | about_emp |
      |  |   |      |  |       |  |  |


  Scenario Outline: Invalid Token Staff Ekleme - AC 4

    * Api kullanicisi "api/addStaff" path parametrelerini olusturur
    * Api kullanicisi api addBlog endpointine gondermek icin "<firstname>", "<mobileno>", "<email>", "<gender>", "<dob>", "<shop_id>", "<about_emp>" bilgilerini iceren bir post request hazirlar
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydeder-post
    * Api kullanicisi status codeun 401 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Invalid token or token missing" oldugunu dogrular

    Examples:
      | firstname | mobileno  | email           | gender | dob        | shop_id | about_emp |
      | Muhammed  | 123456789 | staffmail.gmail | Male   | 05.06.1999 | 25      | ---       |







