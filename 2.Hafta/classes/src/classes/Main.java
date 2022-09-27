package classes;

public class Main {

	// ==============================================
	// Java Dersi 27 : Class Nedir? - Doğru Anlamak
	// KAYNAK :
	// https://www.youtube.com/watch?v=zfIt6x-guc0&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=28

	// Java Dersi 28 : Bir Class Nasıl Çalışır ?
	// KAYNAK :
	// https://www.youtube.com/watch?v=v8JMot51Uqk&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=29

	// Java Dersi 29 : Çok Önemli - Değer ve Referans Tipleri Anlamak
	// https://www.youtube.com/watch?v=y9vmseRAMiU&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=30
	// ==============================================

	// Sürdürülebilir Yazılım : İnsanların sürekli değişen ve artan isteklerine
	// direnmeyen yazılımlardır.
	// Java'da iş yapan her şey bir class/nesnedir.
	// Sınıf, nesne yönelimli programlama dillerinde nesnelerin özelliklerini,
	// davranışlarını ve başlangıç durumlarını tanımlamak için kullanılan şablonlara
	// verilen addır.

	// Class'ların özellikleri
	// Class'ların ilk ve temel özelliği, gruplama yapmaktır.

	public static void main(String[] args) {
		// Class'lar referans tiptir. STACK ve HEAP'ta oluşurlar
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// Değişkenler değer tiptir. (Value type) HEAP'ta yer amazlar
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // Sonuç : 10

		// Diziler referans tiptir. STACK ve HEAP'ta oluşurlar
		int[] sayilar1  = new int[] {1,2,3};
		int[] sayilar2  = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // Sonuç : 10
		
	}

}
