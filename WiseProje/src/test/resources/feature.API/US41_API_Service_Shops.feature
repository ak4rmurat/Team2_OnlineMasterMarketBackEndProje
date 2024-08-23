
Feature: Verify successful GET request with valid authorization


  Scenario: Categories TC001

* Api kullanicisi "api/categories" path parametrelerini olusturur
* Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
* Api kullanicisi status codeun 200 oldugunu dogrular
* Api kullanicisi response bodydeki "response.response_message" bilgisinin "Category List" oldugunu dogrular

  Scenario Outline: Categories TC002
    * Api kullanicisi "api/categories" path parametrelerini olusturur
    * Api kullanicisi "GET" request gonderir ve donen responsei kaydeder
    * Api kullanicisi response bodydeki data "<id>","<category_name>", "<category_slug>", "<category_type>", "<gender_type>", "<category_image >" , "<thumb_image >","< category_mobile_icon>","<status>","< is_featured>","<created_at>" içeriklerini doğrular.

    Examples:
      | id | category_name | category_slug | category_type | gender_type | category_image                                  | thumb_image                                       | category_mobile_icon | status | is_featured | created_at          |
      | 1  | Home Services | home-services | 0             |             | uploads/category_images/17191404842_381_286.png | uploads/category_images/thu_17191404842_50_50.png |                      | 1      | 1           | 2024-06-23 15:31:48 |


  Scenario: Invalid Token Blog List

    * The api user sets "api/categories" path parameters.
    # Api kullanicisi "api/blogs" path parametrelerini olusturur
    * The api user sends a "GET" request, saves the returned response, and verifies that the status code is '401' with the reason phrase Unauthorized.
    # Api kullanicisi GET request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular