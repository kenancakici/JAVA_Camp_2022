package multiDimensionalArrayDemo;

public class Main {

	// =================================
	// Çok Boyutlu (multi dimensional)  Dizilerle Çalışmak
	// =================================

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3]; // 3x3 boyutunda bir dizi oluşturduk

		sehirler[0][0] = "İstanbul"; // Marmara Bölgesi
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";

		sehirler[1][0] = "Ankara"; // İç Anadolu Bölgesi
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";

		sehirler[2][0] = "Diyarbakır"; // Güney Doğu Bölgesi
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		// Nested loops - İç içe döngüler

		for (int i = 0; i <= 2; i++) {
			System.out.println("----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
