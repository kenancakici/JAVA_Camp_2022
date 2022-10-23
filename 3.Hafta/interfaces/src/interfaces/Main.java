package interfaces;
// Java Dersi 42 : Interfaceler ile Çalışmak
// https://www.youtube.com/watch?v=Cn2P_r_oLmk&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=43

// Java Dersi 43 : Interface ile Polymorphism
// https://www.youtube.com/watch?v=vJ3UkzENgHA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=44

/*
 ÖZET :
 ------
  Claslardaki yapı; Tüm operasyonların tamamlanmış olması gerekiyor. 
 Yani classlar içerisine konulan metodların tamamlanmış olması gerekiyor. 
 
 Abstract'larda; kimisi dolu, kimisi boş olabilir.
 Onu inherit edenin içini doldurması gerekir.
 
 Interface'lerde ise; Abstract metodlarda olduğu gibi imzası verilen metodların, inherit edildiği yerde 
 içlerinin doldurulması gerekmektedir.
 
 Tamamlanmamış operasyonlar içerir. Sadece imza vardır. Metod gövdesi yazılmaz.
 
 Interface'ler implement kabul edilir. Inheritance kabul edilmezler.
 Bir Class birden fazla interface'yi implemente edebilir.
 
 Interface'ler sadece referans tutucu görevi görürüler.
 Interface'ler'de abstractlar gibi new'lenemezler. İmza taşırlar.
 

 interface onu implement eden class'ın referansını tutabilir.
 
 İnterface nerede Kullanılır : Operasyonu implemente edilmesini istedğimiz durumlarda kullanılır.
 
  Bağımlılıkları önlemek için Katmanlar (DAL,BUSINESS,UI...)  arasındaki geçişler INTERFACE'lerle sağlanır.
 
 Extend ile Implement'in Farkı Nedir?
 -------------------------------------
  - Bir Class birden fazla Inteface'i implement edebilir.
  - Bir Class sadece bir tane Class'ı extend edebilir.
  - Aynı class hem bir class'ı extend ederken aynı zamanda birden .ok inteface'yi implement edebilir.
   */

public class Main {

	public static void main(String[] args) {
		
		// Alternatif 1. yol Bağımlılık var
//		ICustomerDal customerDal = new OracleCustomerDal();
//		customerDal.add();
		
		// Alternatif 2. yol
		
//		CustomerManager customerManager = new CustomerManager();
//		customerManager.customerDal = new MsSqlCustomerDal();
//		customerManager.add();
//		
		// Yukarıdaki yöntemlerden daha iyi, sağlıklı bir yöntem ise Constructor kullanımıdır. Bkz: CustomerManager
		
		CustomerManager customerManager = new CustomerManager(new MsSqlCustomerDal());
		customerManager.add();

	}

}
