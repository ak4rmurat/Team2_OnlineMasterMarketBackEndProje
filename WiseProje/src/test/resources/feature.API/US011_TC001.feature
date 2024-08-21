Feature: Bir provider olarak API baglantısı ile blog yorumlarina erisebilmek istiyorum

  @US
  Scenario Outline:

    * Api kullanicisi "api/blog/Comments" end pointine gecerli authorization bilgileri ile gir GET request gonderir
    * Api kullanicisi geri donen responsin status code'unun 200 oldugunu dogrular
    * Api kullanicisi geri donen responsin body'deki response_message bilgisinin "Comments Listed Successfully" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/blog/Comments" end pointine gecerli authorization bilgileri ile gir GET request gonderir
    * Api kullanicisi geri donen response'in id(x) olaninin response bodyde donen bilgilerinin "<post_id>", "<user_id>", "<email>", "<name>", "<comment>", "<ip_address>", "<status>", "<created_at>" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |

    * Api kullanicisi "api/blog/Comments" end pointine gecersiz authorization bilgileri ile bir GET istegi gonderir
    * APi kullanicisi geri donen response'in status code'unun 401 oldugunu dogrular
    * APi kullanicisi geri donen response'in bodydeki response_message bilgisinin "Invalid token or missing token" oldugunu dogrular

    Examples:
      | username       | password   | id | name | email | comment | post_id | user_id | ip_address   | status    | created_at |
      | info@team2.com | Urban.123  | 22 | John | Doe   | deneme  | 8888_88 | 444_444 | 89.105.63.49 | Available | 2020-08-10 |