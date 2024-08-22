Feature:Shop details

  Scenario Outline: TC01

    * Api kullanicisi "api/shop-details/<id>" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Donen response icin status code'un 200 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Shop Details" oldugu dogulanir

    Examples:
      | id |
      | 21 |

  Scenario Outline: TC02

    * Api kullanicisi "api/shop-details/<id>" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Donen response icin status code'un 203 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Id missing" oldugu dogulanir

    Examples:
      | id |
      |    |

  Scenario Outline: TC03

    * Api kullanicisi "api/shop-details/<id>" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Donen response icin status code'un 203 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "No Details found" oldugu dogulanir

    Examples:
      | id |
      | 5712 |

  Scenario Outline: Invalid Token TC04

    * Api kullanicisi "api/shop-details/<id>" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Api kullanicisi exception mesajinin "status code: 401, reason phrase: Unauthorized" oldugunu dogrular.


    Examples:
      | id |
      | 57 |


