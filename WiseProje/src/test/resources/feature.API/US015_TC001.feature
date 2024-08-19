Feature: Bir provider olarak API baglantisi uzerinden belirtilen id numarasina sahip blog comment bilgilerini guncelleyebilmek istiyorum

  @US
  Scenario Outline:

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecerli authorization bilgileri ve dogru (id) ile bir DELETE istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment deleted successfully" oldugunu dogrular

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecerli authorization bilgileri ve (id) icermeyen bir DELETE istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 203 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Id missing" oldugunu dogrular

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecerli authorization bilgileri ve kaydi olmayan (id) iceren bir DELETE istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Blog comment not found. Invalid ID." oldugunu dogrular

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecersiz authorization bilgileri ile bir DELETE istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or token missing" oldugunu dogrular

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir
    * Api kullanicisi geri donen response'in deleted_blog_comment_id bilgisinin /api/deleteBlogComment/{id} endpointinde yazan id ile parametrelerinin ayni oldugu dogrulanir

    * Api kullanicisi "api/deleteBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 200 oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |