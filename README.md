# API Test Projesi: 

Bu proje, bir sağlayıcı olarak API bağlantıları üzerinden çeşitli işlemleri gerçekleştiren servislerin test edilmesini amaçlayan bir test otomasyon projesidir. Proje, API endpoint'lerinin doğru şekilde çalıştığını doğrulamak için test senaryolarını içerir.

# Kullanılan Teknolojiler:

Postman: API isteklerini test etmek ve doğrulamak için kullanılır.

Java: Test otomasyonunu gerçekleştirmek için kullanılan programlama dili.

JUnit: Testleri çalıştırmak ve sonuçları raporlamak için kullanılır.

Gherkin: Test senaryolarını tanımlamak için kullanılan dil.

Cucumber: Gherkin senaryolarını çalıştırarak test otomasyonunu gerçekleştirmek için kullanılır.

IntelliJ IDEA: Projeyi geliştirmek ve çalıştırmak için kullanılan IDE.

MySQL: Veritabanı işlemlerini gerçekleştirmek ve doğrulamak için kullanılır.


# Proje Yapısı:

src/test/resources/features: Gherkin dilinde yazılmış test senaryoları burada bulunur.

src/test/java/stepdefinitions: Test senaryolarına ait adımların Java ile tanımlandığı sınıflar burada yer alır.

src/test/java/runners: Testlerin çalıştırıldığı Cucumber runner sınıfları burada bulunur.

src/test/resources: Test verileri ve yapılandırma dosyaları burada yer alır.


# Nasıl Çalıştırılır? :

Projeyi bilgisayarınıza klonlayın.
IntelliJ IDEA veya tercih ettiğiniz bir IDE ile projeyi açın.
Gerekli bağımlılıkları yükleyin (Maven veya Gradle kullanarak).
src/test/java/runners klasöründeki Runner sınıflarını kullanarak testleri çalıştırın.
Test sonuçlarını ve raporları inceleyin.

# Veritabanı Testleri:

Proje ayrıca, veritabanı üzerinde gerçekleştirilen işlemler için test senaryoları içerir. Bu testler, veritabanındaki belirli tablolar üzerinde yapılan işlemleri doğrular.
