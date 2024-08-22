Feature:Post addShop

  Scenario Outline: TC01

    * Api kullanicisi "api/addShop" path parametresini olusturur
    * Api kullanicisi "<shop_title>", "<description>", "<contact_no>", "<email>", "<address>", <tax_allow>, <category>, <sub_category> request body olusturur.
    * Api kullanicisi post request icin donen response kaydederr
    * Donen response icin status code'un 200 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Shop added successfully" oldugu dogulanir


    Examples:
      | shop_title | description     | contact_no   | email             |       address     | tax_allow | category  | sub_category |
      |   New Shop |  New Shop Desc  |  12365478985 | newshop@gmail.com | New York City,USA |  1        |  1        |    3         |


  Scenario Outline: TC02

    * Api kullanicisi "api/addShop" path parametresini olusturur
    * Api kullanicisi "<shop_title>", "<description>", "<contact_no>", "<email>", <tax_allow>, <category>, <sub_category> request body olustururr.
    * Api kullanicisi post request icin donen response kaydederr
    * Donen response icin status code'un 203 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "address is required" oldugu dogulanir


    Examples:
      | shop_title | description     | contact_no   | email             | tax_allow | category  | sub_category |
      |   New Shop |  New Shop Desc  |  12365478985 | newshop@gmail.com |   1        |  1        |    3         |


  Scenario:  TC03

    * Api kullanicisi "api/addShop" path parametresini olusturur
    * Api kullanicisi post request icin donen response kaydederrr
    * Donen response icin status code'un 203 oldugu dogrulanir
    * Donen response icin "response_message" bilgisinin "No data for updated. Required fields empty\"" oldugu dogulanir


  Scenario Outline: TC04 Invalid Token

    * Api kullanicisi "api/addShop" path parametresini olusturur
    * Api kullanicisi "<shop_title>", "<description>", "<contact_no>", "<email>", "<address>", <tax_allow>, <category>, <sub_category> request body olusturur.
    * Api kullanicisi post request icin donen response kaydederr
    * Donen response icin status code'un 401 oldugu dogrulanir
    * Donen response icin "response.response_message" bilgisinin "Invalid token or token missing" oldugu dogulanir


    Examples:
      | shop_title | description   | contact_no  | email             | address           | tax_allow | category | sub_category |
      | New Shop   | New Shop Desc | 12365478985 | newshop@gmail.com | New York City,USA | 1         | 1        | 3            |

