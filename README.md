# API Test Otomasyon Projesi

API Test Otomasyon Projesi'ne hoş geldiniz! Bu proje, servislerle ilgili çeşitli API endpoint'lerinin güvenilirliğini sağlamak için test süreçlerini otomatikleştirmek üzere tasarlanmıştır. Amacımız, API endpoint'lerinin farklı senaryolar altında beklenen şekilde çalıştığını doğrulayarak, güçlü ve hatasız bir servis deneyimi sunmaktır.

# Kullanılan Teknolojiler

Postman: API isteklerini oluşturmak, göndermek ve doğrulamak için kullanılır.

Java: Test otomasyonu için kullanılan ana programlama dili.

JUnit: Testleri çalıştırmak ve raporlar oluşturmak için kullanılan framework.

Gherkin: Test senaryolarını insan tarafından okunabilir formatta tanımlamak için kullanılan dil.

Cucumber: Gherkin senaryolarını çalıştırarak Java ile entegrasyonu sağlar ve otomasyonu gerçekleştirir.

IntelliJ IDEA: Kod yazmak ve çalıştırmak için kullanılan Entegre Geliştirme Ortamı (IDE).

MySQL: Veri bütünlüğünü test etmek ve veritabanı işlemlerini doğrulamak için kullanılan veritabanı.

# Proje Yapısı

src/test/resources/features: Tüm Gherkin tabanlı test senaryolarını içerir.

src/test/java/stepdefinitions: Gherkin'de tanımlanan adımların Java ile uygulandığı sınıflar burada bulunur.

src/test/java/runners: Test senaryolarını çalıştıran Cucumber runner sınıflarını içerir.

src/test/resources: Test verileri ve testlerin çalışması için gerekli yapılandırma dosyalarını içerir.

# Testlerin Nasıl Çalıştırılacağı

Projenin Kopyalanması: Öncelikle projeyi yerel makinenize klonlayın.

Kodu kopyala: git clone https://github.com/ak4rmurat/Team2_OnlineMasterMarketBackEndProje.git

Projeyi Açın: IntelliJ IDEA veya tercih ettiğiniz IDE ile projeyi açın.

Bağımlılıkları Yükleyin: Gerekli tüm bağımlılıkları yükleyin. Proje yapılandırmasına göre Maven veya Gradle kullanabilirsiniz.

Testleri Çalıştırın: src/test/java/runners dizinine giderek, istediğiniz Cucumber runner sınıfını çalıştırın.

Test Sonuçlarını İnceleyin: Çalıştırma sonrası test sonuçlarını ve oluşturulan raporları inceleyerek sonuçları analiz edin.

# Veritabanı Testleri

Bu proje, API endpoint testlerinin yanı sıra veri bütünlüğünü sağlamak için veritabanı testlerini de içerir. 

# Katkıda Bulunma

Katkılarınızı bekleriz! Bu projeye katkıda bulunmak isterseniz, lütfen depoyu forklayarak önerdiğiniz değişikliklerle bir pull request oluşturun. Kodunuzun en iyi uygulamalara uygun olduğundan ve gerekli testleri içerdiğinden emin olun.

# Lisans

Bu proje LICENSE dosyasına bakın.

# İletişim
Herhangi bir sorunuz veya geri bildiriminiz için lütfen bizimle iletişime geçin.


