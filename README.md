Personel Kayıt Uygulaması Projesi

Merhaba,

Java Servletlerini kullanarak basit bir personel kayıt uygulaması geliştirdim. İşte projenin detayları:


1. Proje Yapısı:

index.html: Ana sayfa.
addPersonnel.html: Personel ekleme formu.
listPersonnel.html: Personel listeleme sayfası.
Personnel.java: Personel model sınıfı.
PersonnelServlet.java: HttpServlet sınıfı.


2. Sayfa Tasarımları:

Tüm sayfalarda CSS, Bootstrap ve JavaScript/jQuery kullanarak düzgün tasarımlar oluşturdum.
Her sayfada, diğer sayfalara geçiş için menü yapıları bulunuyor.


3. Personel Modeli:

Personnel adında bir Java sınıfı tanımladım.
Her personel için Adı, Soyadı, Sicil Numarası, Departmanı, Telefonu, İşe Giriş Tarihi, Maaş Tutarı ve Aktiflik bilgisi gibi özellikler bulunmaktadır.


4. Personel Ekleme:

addPersonnel.html sayfasında, Adı, Soyadı, İşe Giriş Tarihi ve Maaş Tutarı alanlarının doldurulması zorunlu olacak şekilde düzenledim.
Form doldurulmadan önce boş geçilen alanlar için kullanıcıya uyarı mesajları gösteriyorum.
Ekleme işlemi tamamlandığında kullanıcıya bilgi mesajı gösteriyorum.


5. Personel Listeleme:

listPersonnel.html sayfasında, eklenen personeller tablo şeklinde listeleniyor.
Tablonun altında toplam personel sayısı ve tüm personelin toplam maaş tutarı bilgileri görüntüleniyor.
Bu işlem, PersonnelServlet.java üzerinden gerçekleştiriliyor.


6. Servlet Kullanımı:

PersonnelServlet.java sınıfı, HttpServlet sınıfını extend ederek oluşturuldu.
doPost metodu personel ekleme işlemi için, doGet metodu ise personel listeleme işlemi için kullanıldı.
Gerekli veri işlemleri bu sınıf içinde gerçekleştirildi.
Bu proje sayesinde temel bir personel kayıt uygulaması oluşturmuş oldum. Hem Servletlerin hem de temel web teknolojilerinin kullanımını pekiştirdim.
