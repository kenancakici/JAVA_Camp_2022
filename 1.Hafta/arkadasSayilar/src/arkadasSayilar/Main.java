package arkadasSayilar;

public class Main {
	// ====================================
	// Mini Proje 4 - Arkadaş Sayılar
	// ====================================

	// Arkadaş sayı : bilinen en küçük 2 arkadaş sayı 220 ve 284'tür.
	// Kendileri haric pozitif tam bölenleri toplamı birbirine eşit olan sayılardır
	// Yani; 1 den başlayıp 220'ye kadar, 220'yi bölen tüm sayıların toplamı 284
	// iken,
	// 1 den başlayıp 284'e kadar, 284'ü bölen tüm sayıların toplamı 220 olan
	// sayılardaır.

	public static void main(String[] args) {

		int sayi1 = 220;
		int sayi2 = 284;

		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir!");
		}
		
		

	}

}
