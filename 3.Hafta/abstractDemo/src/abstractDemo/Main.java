package abstractDemo;
// Java Dersi 41 : Demo - Abstract Sınıfları Pekiştirmek
// https://www.youtube.com/watch?v=U1sapsgPEvU&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=42

/*
SENARYO
------------------
Bir müşterinin veritabanın kaydedilmesi.
Veritabanına kaydederken farklı teknikler uygulamaya imkan vermelidir. MySQL, OEACLE, MSSQL gibi
Bunların kodları farklı olacağından farklı müşteri ihtiyaçlarına cevap verebilecek bir sistem olmalıdır.	

MSSQL'de farklı, ORACLE'de farklı, MySQL'de farklı Yani ortak kod yok. Onu implemente edenin kendine göre içini doldurması gerekmektedir.
Abstract tipinde Temel Class oluşturarak başlıyoruz. BaseDatabaseManager 




*/

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.databaseManager = new SqlServerDatabaseManager();
		//customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
