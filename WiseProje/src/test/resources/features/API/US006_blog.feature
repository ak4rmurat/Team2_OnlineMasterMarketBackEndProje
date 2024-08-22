Feature:Bir provider olarak API bağlantısı üzerinden blog kategorilerine erişebilmek istiyorum.




  Scenario Outline:blog categories AC 1 ve 2



    * Api kullanicisi "api/blogCategories" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen response kaydeder.
    * Api kullanicisi status code 200 oldugunu dogrular
    * Api kullanicisi response bodyde "response.response_message" bilgisinin "Blog Categories Listed Successfully" oldugunu dogrular
    * Api kullanicisi response bodydeki data "<id>","<lang_id>", "<name>", "<slug>", "<description>", "<keywords>" , "<category_order>","<status>","<createdAt>","<createdBy>","<updateAt>","<updateBy>" içeriklerini doğrular.


    Examples:
      | id | lang_id | name               | slug               | description | keywords | category_order | status | createdAt           | createdBy | updateAt            | updateBy |
      | 0  | 1       | Household Services | household-services |             |          | 1              | 1      | 2022-10-03 19:57:19 | 1         | 2024-06-28 23:15:56 | 1        |




  Scenario: Invalid Token Blog Categories   -   AC3

    * Api kullanicisi "api/blogCategories" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular

