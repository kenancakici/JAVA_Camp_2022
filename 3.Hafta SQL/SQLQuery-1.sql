-- SELECT deyimi, bir veritabanından veri seçmek için kullanılır. 
-- Bu işleme sorgulama denir. SELECT komutunun döndürülen veriler sonuç kümesi adı verilen bir tabloda saklanır.
--ANSI Standardı kullanıyoruz.
Select ContactName [Yetkili Adi],CompanyName Sirket,City Sehir from Customers

Select * from Customers Where City = 'Berlin'

-- Case insensitive
-- Kategorisi 1 VEYA 3 olan ürünleri listele
select * from Products where categoryId=3 or CategoryID=3

-- Kategorisi 1 VE ürün fiyatı 10 ve daha büyük olan ürünleri listele
select * from Products where categoryId=1 and UnitPrice>=10


-- ORDER BY anahtar sözcüğü, verileri artan ya da azalan düzende sıralamak için kullanılır. 
-- Varsayılan olarak artan sırada sıralar. Ürünleri ürün adına göre sıralar.
select * from Products order by ProductName

-- Her kategorideki ürünleri ürün adına göre sıralar. 
-- (Önce Kategori ID ye göre sıralar, Aynı kategori içindekileri de Ürün adına göre sıralar
select * from Products order by CategoryID,ProductName


-- Ürünleri, fiyata göre sıralar
select * from Products order by UnitPrice asc

-- Alfabetik sıralama ascending(asc) : A-Z, Descending(desc): Z-A
-- Products tablosundaki kayıtları UnitPrice'ye göre A'dan Z'ye sıralar
select * from Products order by UnitPrice asc

-- Products tablosundaki kayıtları UnitPrice'ye göre Z'den A'ya sıralar
select * from Products order by UnitPrice desc

-- CategoryID=1 olanları (ProductId, ProductName, CategoryID, UnitPrice) filtrele
-- Fiyata göre artan sırada getir.
select ProductId, ProductName, CategoryID, UnitPrice from Products where CategoryID=1 order by UnitPrice,ProductName


-- COUNT (adet) fonksiyonu, belirtilen ölçütlerle eşleşen satır sayısını döndürür. 
-- Kısaca ; veritabanındaki kayıtları sayabilmek için yerleşik COUNT fonksiyonunu kullanırız.

-- Bütün Product tablosunda kaç tane ürün olduğunu listeler
Select COUNT(*) from Products

-- 2 numaralı kategorideki ürün sayısını verir. "Adet" etiketini alias olarak kullanır. Kolon Başlığını "Adet" olarak Gösterir
select COUNT(*) [Adet] from products where CategoryID=2

-- GROUP BY, 
-- Hangi kategoride kaç farklı ürünümüz var? 
-- CategoryID'ye göre gruplar ve her kategoride kaç ürün var onları sayar.
-- Select edilen kolon sadece ve sadece GROUP BY ifadesinde yazılan alan olmalıdır.
-- Bir GROUP BY yaptığımız zaman, her bir grup için arka planda bir tablo oluşturulduğunu düşünebiliriz.
select CategoryID, COUNT(*) [Adet] from products GROUP BY CategoryID

-- İçindeki Ürün sayısı 10'dan az olan kategorileri listele.
-- HAVING ifadesi GROUP BY'a konu olan sorgu ifadesindeki kümilatiflar (COUNT,SUM,MAX gibi) için geçerlidir.
select CategoryID, COUNT(*) [Adet] from products GROUP BY CategoryID HAVING COUNT(*) <10

-- Ama datayı filtrelemek için WHERE kullanılır. ÖNCE her zaman WHERE çalışır
-- Birim Fiyatı 20 den büyük ürünleri CategoryID ye göre grupla (Where ile filtrele), 
-- onlardan da sayısı 10 dan az olanların say.
select CategoryID, COUNT(*) [Adet] from products WHERE UnitPrice>20
GROUP BY CategoryID HAVING COUNT(*) <10

-- SQL'de Kendimizi tekrar etmemek için tablolarımızı ilişkilendiriyoruz.
-- JOIN : SQL de birbiri ile ilişkili tablolardan veri çekmek için JOIN komutlarını kullanırız.
-- INNER JOIN, LEFT JOIN, RIGHT JOIN komutları en sık kullanılan komutlardır.
-- JOIN birleştirmek demektir.


Select Products.CategoryID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
From Products INNER JOIN Categories					--> Hem Ürünlerin hemde kategorilerin bir araya getirilmiş (birleştirilmiş) hali
ON Products.CategoryID = Categories.CategoryID		-- ON : (Durumunda, Şartında demektir.) Yani Neye göre birleştireceğim koşulunu ON ile yazıyoruz.
WHERE Products.UnitPrice>10							-- WHERE, ORDER BY burada kullanılabilir.
													-- Fiyatı 10'dan büyük olan ürünleri kategori adı ile beraber getir.

-- DTO Data Transformation Object : C#'ta oluşturduğumuz Entities'lerin yanında ilişkiler için oluşturduğumuz Joinli yapılardır.

-- INNER JOIN, iki tabloda da eşleşen kayıtları biraraya getirir. Eşleşmeyen data varsa onu getirmez.
Select * 
From Products p INNER JOIN [Order Details] od
on p.ProductID = od.ProductID
-- Solda(ps) olup sağda(od) olmayanları da getirir.
-- Tüm ürünlerden satış yapılmış.


Select * 
From Customers c LEFT JOIN [Orders] o
on c.CustomerID = o.CustomerID
-- 832 Kayıt geldi.
-- Solda olup (müşterilerde), Siparişte olmayanlarıda getirdi. 


-- Hiç satış yapamadığımız ürünler nelerdir?
Select * 
From Customers c LEFT JOIN [Orders] o
on c.CustomerID = o.CustomerID
WHERE o.CustomerID is NULL -- JOIN işleminde tabloda bu PK yok.

-- Birden fazla INNER JOIN KULLANIMI
Select * 
From Products p 
INNER JOIN [Order Details] od
on p.ProductID = od.ProductID
INNER JOIN Orders o
ON o.OrderID = od.OrderID
