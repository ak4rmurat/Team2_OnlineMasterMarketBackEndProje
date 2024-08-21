Feature:GET MyShop

  Scenario: API MYSHOP

    * Api kullanicisi "api/myShops" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Donen response icin status code'un 200 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Shops Listed Successfully" oldugu dogulanir


  Scenario: TC02 Invalid Token

    * Api kullanicisi "api/myShops" path parametresini olusturur
    * Api kullanicisi "GET" request icin donen response kaydeder
    * Donen response'nin mesaj bilgisinin "status code: 401, reason phrase: Unauthorized" oldugu dogrulanir



