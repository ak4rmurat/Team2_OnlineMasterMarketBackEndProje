Feature: Bir provider olarak API baglantisi üzerinden belirtilen id numarasına sahip staff'ın detaylı bilgilerine erisebilmeliyim.


  Scenario Outline: Staff List - AC 1

    * Api kullanicisi "api/staff-detail/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder-get
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff Details" oldugunu dogrular

    Examples:
      |    id   |
      |    41   |



  Scenario Outline: Staff List - AC 2

    * Api kullanicisi "api/staff-detail/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder-get
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff Details" oldugunu dogrular
    * Api kullanicisi response bodydeki data "<id>", "<provider_id>", "<first_name>", "<last_name>", "<country_code>", "<contact_no>", "<email>","<password>" "<dob>", "<gender>" bilgilerini doğrular.
    Examples:
      |    id   | provider_id | first_name   | last_name | country_code | contact_no | email            | password | dob        | gender |
      |    41   | 4           | Marcus Hayes |           | 1            | 2157893265 | marcus@gmail.com |          | 1984-10-19 | Male   |




  Scenario Outline: Staff List - AC 3

    * Api kullanicisi "api/staff-detail/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder-get
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Id missing" oldugunu dogrular--,---
    Examples:
      |    id   |
      |         |


  Scenario Outline: Staff List - AC 4

    * Api kullanicisi "api/staff-detail/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder-get
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "No Details found" oldugunu dogrular
    Examples:
      |    id        |
      |    74757     |




  Scenario: Invalid Token Staff List - AC 5
    * Api kullanicisi "api/staff-detail" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular





