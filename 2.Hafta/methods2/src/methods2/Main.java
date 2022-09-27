package methods2;

public class Main {
	// ======================================
	// Java Dersi 25 : Parametreli Metodları Anlamak
	// Java Dersi 26 : Variable Arguments ile Çalışmak
	// Kaynak :
	// https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25
	// https://www.youtube.com/watch?v=VszZhqQ-jTM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=26
	// https://www.youtube.com/watch?v=f4r1T72OyTA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=27
	// ======================================
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0, 2); // 2 dahil değildir.
		// yeniMesaj = ekle();// void methodlar bir değişkene atanamazlar.
		yeniMesaj = sehirVer(); // String bir değer geri döndürdü
		System.out.println("Şehir : " + yeniMesaj);

		int sayi = topla(15, 7); // topla methodu/fonsiyonu int tipinde 2 adet parametre istiyor. 15 ve 7 veriyoruz
		System.out.println("Sayı1 : " + sayi);
		
		int sayi2 = topla2(25,5,10,12,6,8); // int array
		System.out.println("Sayı2 : " + sayi2);
	}

	// void methodlar geriye değer döndürmezler. Sadece method içerisinde
	public static void ekle() {
		System.out.println("Eklendi...");
	}

	public static void sil() {
		System.out.println("Silindi...");
	}

	public static void guncelle() {
		System.out.println("Güncellendi...");
	}

	// Topla fonksiyonu integer tipinde 2 adet parametre alıyor.
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "ANKARA";
	}

	// Bir fonksiyona istediğimiz kadar değer gönderebilmek için 
	// Variable Arguments kullanılır.
	// Örnekte "sayilar" degiskeni bir dizi gibi int[] davranır, Variable Arguments'tir. birden fazla parametre girişine imkan verir.
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
