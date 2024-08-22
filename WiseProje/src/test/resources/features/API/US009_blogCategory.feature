Feature:

  Scenario Outline: edit blog category ac1

    * Api kullanicisi "api/editBlogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 200 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blog Category Updated successfully" oldugunu dogrular

    Examples:
      | id | name  | description |
      | 26 | Barut | Bulut       |


  Scenario Outline:edit blog category ac2

    * Api kullanicisi "api/editBlogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi  request body olusturur
    * Api kullanicisi "PATCH" requesti gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 203 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "No data for updated." oldugunu dogrular

    Examples:
      | id |
      | 26 |

  Scenario Outline:edit blog category ac3

    * Api kullanicisi "api/editBlogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 203 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Id missing" oldugunu dogrular

    Examples:
      | id | name  | description |
      |    | Barut | Bulut       |

  Scenario Outline:edit blog category ac4

    * Api kullanicisi "api/editBlogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "<name>", "<description>" request body olusturur
    * Api kullanicisi "PATCH" request gonderir ve donen responsei kaydederr
    * Api kullanicisi status codeun 203 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "No Results found for the given ID" oldugunu dogrular

    Examples:
      | id   | name  | description |
      | 1012 | Barut | Bulut       |


  Scenario : Invalid Token edit blog category ac4

    * Api kullanicisi "api/editBlogCategory" path parametrelerini olusturur
    * Api kullanicisi status codeun 401 oldugunu dogrularr
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Invalid token or token missing" oldugunu dogrular












