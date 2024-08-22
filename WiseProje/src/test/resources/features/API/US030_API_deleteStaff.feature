Feature: Bir provider olarak API baglantisi üzerinden belirtilen id numarasına sahip staff bilgilerini silebilmek istiyorum.

  Scenario Outline: Staff silme   -   AC 1


    * Api kullanicisi "api/deleteStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Staff deleted successfully" oldugunu dogrular

    Examples:
      | id |
      | 100 |



  Scenario Outline: Staff silme   -   AC 2


    * Api kullanicisi "api/deleteStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Id missing" oldugunu dogrular

    Examples:
      | id |
      |    |



  Scenario Outline: Staff silme   -   AC 3


    * Api kullanicisi "api/deleteStaff/<id>" path parametrelerini olusturur
    * Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Failed to delete staff.It can be wrong ID." oldugunu dogrular

    Examples:
      | id    |
      | 17678 |


  Scenario: Invalid Token Staff silme   -   AC 4

    * Api kullanicisi "api/deleteStaff" path parametrelerini olusturur
    * Api kullanicisi "DELETE" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular




