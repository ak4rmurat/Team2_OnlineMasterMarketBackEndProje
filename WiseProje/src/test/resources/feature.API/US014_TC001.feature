Feature: Bir provider olarak API baglantisi uzerinden belirtilen id numarasina sahip blog comment bilgilerini guncelleyebilmek istiyorum

  @US
  Scenario Outline:

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar "<name>", "<email>","<comment>" iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment Updated Successfully" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru data "<name>" iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Blog Comment Updated Successfully" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile dogru (id) ve data icermeyen bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "No data for updated." oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar "<name>", "<email>","<comment>" iceren bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Id missing" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile kaydi olmayan bir (id) ve dogru datalar "<name>", "<email>","<comment>" iceren bir PATCH istegi gonderilir
    * Api kullanicisi geri donen responsin status code'unun 203 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "No Results found for the given ID" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile dogru (id) ve dogru datalar "<name>", "<email>","<comment>" iceren bir PATCH istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or token missing" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri ile bir GET istegi gonderilir
    * Api kullanicisi donen response'in icindeki updated_blog_comment_id bilgisinin "/api/editBlogComment/<id>" endpoint'inde yazan id path ile ayni oldugu dogrulanir

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/editBlog/Comment/<id>" end pointine gecerli authorization bilgileri iceren bir GET istegi gonderilir
    * APi kullanicisi geri donen response'in status code'unun 200 oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |