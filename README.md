 # QueryCart Appium ve Cucumber ile Test Otomasyonu

Bu proje, QueryCart mobil uygulamasının otomasyon testlerini Appium ve Cucumber framework'lerini kullanarak gerçekleştirir.
Proje, APK dosyası üzerinde çalışmakta ve farklı sayfa etkileşimlerini test etmektedir.

 ## Proje Yapısı
- **src/test/java/Apps**: Test edilen uygulamanın APK dosyalarını içerir.
    - `Apk Info_2.5.2_apkcombo.com.apk`: Yardımcı bir APK dosyası.
    - `querycart2006.apk`: Test edilen ana uygulama APK'sı.

- **src/test/java/Page**: Page Object Model (POM) yapısına göre oluşturulmuş,
  uygulamanın farklı sayfalarını temsil eden sınıflar.

- **src/test/java/Runner**: Test senaryolarını çalıştırmak için kullanılan Cucumber Runner dosyalarını içerir.

- **src/test/java/stepdefinitions**: Cucumber senaryoları için adımların (step definitions) yer aldığı sınıflar.
   Burada her senaryodaki kullanıcı adımları ile Java kodu bağlanır.

- **src/test/java/utilities**: Projede kullanılan yardımcı sınıflar.
- `ConfigReader`: Konfigürasyon ayarlarını okuyan sınıf.
- `Hooks`: Her testden once Appium server'in acilmasini ,test sonrasinda kapanmasini saglar
- `Driver`: WebDriver veya Appium Driver örneğini yöneten sınıf.
- `OptionsMet`: Testler sırasında kullanılan seçeneklerle ilgili yardımcı metotları içerir.
- `Pages`: Tüm sayfa nesnelerinin ortak kullanımını sağlayan yapı.
- `ReusableMethods`: Testlerde tekrar kullanılabilir metotları içerir.

- **src/test/resources/Features**: Cucumber framework'ü tarafından kullanılan `feature` dosyalarını içerir.
- Her `feature` dosyası, test senaryolarını Gherkin dilinde tanımlar.

- **target/cucumber-reports**: Cucumber tarafından oluşturulan test raporlarını içerir.
- `cucumber.html`: Test sonuçlarını gösteren HTML formatında rapor.

- **pom.xml**: Maven yapılandırma dosyası. Proje bağımlılıklarını yönetir.

## Raporlama

Test sonuçları **Cucumber Reports** ile HTML formatında raporlanır. Bu raporlar,
testlerin detaylı bir şekilde incelenmesini sağlar ve `target/cucumber-reports/cucumber.html` dosyasında bulunur.

## Kurulum ve Çalıştırma

1. **Bağımlılıkları Yükleme:**
    - Maven aracılığıyla projenin bağımlılıklarını indirmek için aşağıdaki komutu çalıştırın:
      ```
       mvn clean install 
      ```

2. **Testleri Çalıştırma:**
    - Testleri çalıştırmak için aşağıdaki komutu kullanın:
      ```
      mvn test
      ```

3. **Konfigürasyon:**
    - `configuration.properties` dosyasında test ayarları ve diğer yapılandırma parametreleri yer alır.
    - `ConfigReader` sınıfı ile bu ayarlar okunur ve testler sırasında kullanılır.

## Kullanım Senaryoları

- **Appium ile Mobil Testler**: APK dosyası kullanılarak mobil cihazda otomasyon testleri yapılır.
- **Cucumber ile BDD**: Gherkin dili ile yazılmış senaryolar çalıştırılır ve doğrulama adımları `stepdefinitions` klasöründe tanımlıdır.

## Notlar

- Projede **Page Object Model (POM)** kullanılmıştır, bu da kodun yeniden kullanılabilirliğini ve sürdürülebilirliğini artırır.
- Testlerin **Appium** üzerinde çalışması için cihaz veya emülatör ayarlarının doğru yapılmış olması gerekir.
