package methods;

public class Main {

	// ======================================
	// Java Dersi 24 : Metodları (Fonksiyonlar) Anlamak
	// Kaynak :
	// https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25
	// ======================================

	public static void main(String[] args) {

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 15;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break; // döngüyü bitir
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur: " + aranacak);
		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
