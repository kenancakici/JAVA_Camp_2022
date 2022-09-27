package miniProjeAsalSayi;

public class Main {
	
	// =======================================
	// Sayı Asal mı?
	// =======================================

	public static void main(String[] args) {
		// SORU : Verilen sayının asal olup olmadığını bulan program.
		// ASAL SAYI : kendisi ve 1 dışındaki sayılara kalansız olarak bölünemeyen tam sayıdır. 
		// Yani, Bir sayısının asal olması için sadece 1'e ve kendisine bölünebilmesi gerekmektedir.
		// En küçük asal sayı 2 dir.
		// Kalan (mod) operatörü: %

		int number = 25;
		//int remainder = number % 2; // remainder 25'in 2'ye bölümünden kalan değerdir.
		// System.out.println("Kalan : " + remainder);

		boolean isPrime = true;


		if (number == 1) {
			System.out.println("Sayı Asal Değildir!");
			return; // bağlı bulunan bloktan çıkılır.
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayı!");
			return;
		}
		
		// Girilen sayının Kendisine kadar olan sayılara kalansız olarak bölünüp bölünmediğini bulmak için for dögüsü kullanıyoruz
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(i + " Kalansız Böler....");
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı Asaldır!");
		} else {
			System.out.println("Sayı Asal Değildir!");
		}
	}

}
