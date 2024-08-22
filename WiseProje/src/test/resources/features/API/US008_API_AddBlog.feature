Feature:

  Scenario Outline: senaryo


    * Api kullanicisi "api/addBlogCategory" path parametresini olusturur
    * Api kullanicisi "<id>", "<name>", "<description>" request body olusturur.
    * Api kullanicisi post request icin donen response kaydederr
    * Donen response icin status code'un 200 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Blog Category added successfully" oldugu dogulanir


    Examples:
      | id | name  | description |
      | 29 | Bulut | umit        |


  Scenario Outline:Add blog Category  AC 1


    * Api kullanicisi "api/addBlogCategory" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 200 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blog Category added successfully" oldugunu dogrular


    Examples:
      | name  | description |
      | Bulut | umit        |


  Scenario Outline:Add Blog Category post AC 2


    * Api kullanicisi "api/addBlogCategory" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 203 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Name and description is required." oldugunu dogrular


    Examples:
      | name | description |
      |      |             |


  Scenario Outline:Add Blog Category post AC 3


    * Api kullanicisi "api/addBlogCategory" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 203 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Name and description is required." oldugunu dogrular


    Examples:
      | name  | description |
      | Bulut |             |


  Scenario Outline:Invalid Token - AC 4




    * Api kullanicisi "api/addBlogCategory" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "POST" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 401 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Invalid token or token missing" oldugunu dogrular

    Examples:
      | name  | description |
      | Bulut | Umit        |











