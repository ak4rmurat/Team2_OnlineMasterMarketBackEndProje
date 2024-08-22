
Scenario Outline: BLog Category silme   -   AC 1


* Api kullanicisi "api/deleteBlogCategory/<id>" path parametrelerini olusturur
* Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
* Api kullanicisi status codeun 200 oldugunu dogrular
* Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blog Category deleted successfully" oldugunu dogrular

Examples:
| id |
| 33 |


Scenario Outline: BLog Category silme   -   AC 2


* Api kullanicisi "api/deleteBlogCategory/<id>" path parametrelerini olusturur
* Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
* Api kullanicisi status codeun 200 oldugunu dogrular
* Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blog Category deleted successfully" oldugunu dogrular

Examples:
| id |
|    |



Scenario Outline: BLog Category silme   -   AC 3


* Api kullanicisi "api/deleteBlogCategory/<id>" path parametrelerini olusturur
* Api kullanicisi "DELETE" request gonderir ve donen responsei kaydeder
* Api kullanicisi status codeun 200 oldugunu dogrular
* Api kullanicisi response bodydeki "response.response_message" bilgisinin "Blog Category deleted successfully" oldugunu dogrular

Examples:
| id       |
| 123456   |


Scenario: Invalid Token    -   AC 4

* Api kullanicisi "api/deleteBlogCategory" path parametrelerini olusturur
* Api kullanicisi "DELETE" request gonderir, donen responsei kaydeder, status codeun '401' ve reason phrase bilgisinin Unauthorized oldugunu dogrular

