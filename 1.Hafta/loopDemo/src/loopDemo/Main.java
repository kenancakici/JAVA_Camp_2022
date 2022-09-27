package loopDemo;

public class Main {

	// ====================================
	// For Döngüsüyle Çalışmak
	// ====================================

	public static void main(String[] args) {

		// Aralıktaki tüm sayıları yazdıran algoritma
		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }
		// System.out.println("For Döngüsü Bitti!");

		// Aralıktaki Çift sayıları yazdıran algoritma
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti!");

		// ====================================
		// While Döngüsüyle Çalışmak
		// ====================================
		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti!");

		// ====================================
		// Do While Döngüsüyle Çalışmak
		// ====================================
		int j = 100; // Şart uymasa bile Do döngüsü 1 kere çalışır
		do {
			System.out.println(j);
			j += 2;
		} while (j <= 10);
		System.out.println("Do-While Döngüsü Bitti!");
	}

}
