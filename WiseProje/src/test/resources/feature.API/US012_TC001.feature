Feature: Bir provider olarak API baglantısı belirli ID numarasina sahip olan blog yorumunun detali bilgilerine erisebilmeliyim

  @US
  Scenario Outline:

    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecerli authorization bilgileri ile gir GET request gonderir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comments Details" oldugunu dogrular

    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecerli authorization bilgileri ve dogru data {id} ile gir GET request gonderir
    * Api kullanicisi geri donen response body'deki datalar (post_id, user_id, email, name, comment, ip_address, status, created_at) oldugunu dogrular

    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecerli authorization bilgileri ve (id) icermeyen bir GET istegi gonderir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Id missing" oldugunu dogrular

    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecerli authorization bilgileri ve kaydi olmayan bir (id) icermeyen bir GET istegi gonderir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "No Details for this id." oldugunu dogrular

    * Api kullanicisi "api/blog/Comment/{id}" endpointine gecersiz authorization bilgileri ile gir GET request gonderir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or token missing" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |