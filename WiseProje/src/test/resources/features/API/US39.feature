Feature:Post addShop id

  Scenario Outline: TC01
    * Api kullanicisi "api/editShop/<id>" path parametresini olusturur
    * Api kullanicisi "<shop_title>", "<description>", "<contact_no>", "<email>", "<address>", <tax_allow>, <category>, <sub_category> request body olusturur.
    * Api kullanicisi patch request icin donen response kaydederr
    * Donen response icin status code'un 200 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Shop updated successfully" oldugu dogulanir

    Examples:
      | id | shop_title | description   | contact_no  | email             | address           | tax_allow | category | sub_category |
      | 22 | New Shop   | New Shop Desc | 12365478985 | newshop@gmail.com | New York City,USA | 1         | 1        | 5             |

  Scenario Outline: TC02
    * Api kullanicisi "api/editShop/<id>" path parametresini olusturur
    * Api kullanicisi data icermeyen patch request icin donen response kaydederr
    * Donen response icin status code'un 203 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "No data to update" oldugu dogulanir

    Examples:
      | id | shop_title | description   | contact_no  | email             | address           | tax_allow | category | sub_category |
      | 22| New Shop   | New Shop Desc | 12365478985 | newshop@gmail.com | New York City,USA | 1         | 1        | 5             |