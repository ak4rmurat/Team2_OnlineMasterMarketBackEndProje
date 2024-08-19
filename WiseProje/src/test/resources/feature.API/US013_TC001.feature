Feature: Bir provider olarak API baglantısı üzerinden yeni bir blog comment kaydi olusturabilmek istiyorum
@US
  Scenario Outline:

    * Api kullanicisi "api/addBlogComment" endpointine gecerli authorization bilgileri ve dogru datalar (post_id, name, email, comment) ile bir POST request gonderir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment added successfully" oldugunu dogrular

    * Api kullanicisi "api/addBlogComment" endpointine gecerli authorization bilgileri ve eksik data iceren bir POST request gonderir
    * Api kullanicisi geri donen responsin status code'unun 203 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "POST ID, email, name and comment is required" oldugunu dogrular

    * Api kullanicisi "api/addBlogComment" endpointine gecerli authorization bilgileri ve data iceren bir POST request gonderir
    * Api kullanicisi geri donen responsin status code'unun 203 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "POST ID, email, name and comment is required" oldugunu dogrular

    * Api kullanicisi "api/addBlogComment" endpointine gecersiz (invalid api key) authorization bilgileri ve dogru datalar (post_id, name, email, comment) iceren bir POST request gonderir
    * Api kullanicisi geri donen responsin status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or token missing" oldugunu dogrular


    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecerli authorization bilgileri ile gir GET request gonderir
    * APi kullanicisi geri donen response'in status code'unun 200 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin bos olmadigini dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |