Feature:

  Scenario Outline : Blog Categories - AC 1

    * Api kullanicisi "api/blogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 200 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blogs Category Details " oldugunu dogrular
    * Api kullanicisi response bodydeki data "<id>","<lang_id>", "<name>", "<slug>", "<description>", "<keywords>" , "<category_order>","<status>","<createdAt>","<createdBy>","<updateAt>","<updateBy>" içeriklerini doğrular.


    Examples:
      | id | lang_id | name               | slug               | description | keywords | category_order | status | createdAt           | createdBy | updateAt            | updateBy |
      | 0  | 1       | Household Services | household-services |             |          | 1              | 1      | 2022-10-03 19:57:19 | 1         | 2024-06-28 23:15:56 | 1        |


  Scenario Outline: blog category AC2

    * Api kullanicisi "api/blogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "Id missing" oldugunu dogrular


    Examples:
      | id |
      |    |


  Scenario Outline: blog category AC3

    * Api kullanicisi "api/blogCategory/<id>" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanicisi status codeun 203 oldugunu dogrular
    * Api kullanicisi response bodydeki "response.response_message" bilgisinin "No Details for this id." oldugunu dogrular
    Examples:
      |    id         |
      |    8012016    |





  Scenario: Invalid Token Blog Categories   -   AC 4

    * Api kullanicisi "api/blogCategory" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular



