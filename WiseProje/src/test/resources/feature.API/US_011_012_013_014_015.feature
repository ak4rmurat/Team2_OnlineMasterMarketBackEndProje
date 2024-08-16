Feature: Bir provider olarak API baglantısı ile blog yorumlarina erisebilmek istiyorum

  Scenario Outline:

    * Api kullanicisi "api/blog/Comments" end pointine gecerli authorization bilgileri ile gir GET request gonderir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Comments Listed Successfully" oldugunu dogrular

    * Api kullanicisi "api/blog/Comments" end pointine gecerli authorization bilgileri ile gir GET request gonderir
    * Api kullanicisi geri donen response'in id(x) olaninin response bodyde donen bilgilerinin (post_id, user_id, email, name, comment, ip_address, status, created_at) oldugunu dogrular

    * Api kullanicisi "api/blog/Comments" end pointine gecersiz authorization bilgileri ile bir GET istegi gonderir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or missing token" oldugunu dogrular

    Examples:
      | username       | password   | id | post_id | user_id | name | comment | ip_address | status | created_at |
      | info@team2.com | Urban.123  |    |         |         |      |         |            |        |            |


Feature: Bir provider olarak API baglantısı belirli ID numarasina sahip olan blog yorumunun detali bilgilerine erisebilmeliyim

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
      | username       | password   | id | post_id | user_id | name | comment | ip_address | status | created_at |
      | info@team2.com | Urban.123  |    |         |         |      |         |            |        |            |


Feature: Bir provider olarak API baglantısı üzerinden yeni bir blog comment kaydi olusturabilmek istiyorum

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
      | username       | password   | id | post_id | user_id | name | comment | ip_address | status | created_at |
      | info@team2.com | Urban.123  |    |         |         |      |         |            |        |            |


Feature: Bir provider olarak API baglantisi uzerinden belirtilen id numarasina sahip blog comment bilgilerini guncelleyebilmek istiyorum

  Scenario Outline:

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar (name, email,comment) iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment Updated Successfully" oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru data (name) iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment Updated Successfully" oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile dogru (id) ve data icermeyen bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "No data for updated." oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar (name, email,comment) iceren bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Id missing" oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile kaydi olmayan bir (id) ve dogru datalar (name, email,comment) iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "No Results found for the given ID" oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar (name, email,comment) iceren bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or token missing" oldugunu dogrular

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir
    * Api kullanicisi donen response'in icindeki updated_blog_comment_id bilgisinin /api/editBlogComment/{id} endpoint'inde yazan id path ile ayni oldugu dogrulanir

    * Api kullanicisi "api/editBlog/Comment/{id}" end pointine gecerli authorization bilgileri iceren bir GET istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 200 oldugunu dogrular

    Examples:
      | username       | password   | id | post_id | user_id | name | comment | ip_address | status | created_at |
      | info@team2.com | Urban.123  |    |         |         |      |         |            |        |            |


Feature: Bir provider olarak API baglantisi uzerinden belirtilen id numarasina sahip blog comment bilgilerini guncelleyebilmek istiyorum

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
      | username       | password   | id | post_id | user_id | name | comment | ip_address | status | created_at |
      | info@team2.com | Urban.123  |    |         |         |      |         |            |        |            |