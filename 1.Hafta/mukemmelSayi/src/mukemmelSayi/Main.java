package mukemmelSayi;

public class Main {

	// =====================================
	// Mini Proje 3 - Mükemmel Sayılar
	// =====================================

	// Mükemmel Sayı : Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdır.

	public static void main(String[] args) {

		// 6 => 1,2,3
		// 28 => 1,2,4,7,14
		
		int number = 28;
		int total = 0 ;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i ;
			}
		}
		
		if(total == number ) {
			System.out.println(number + " Mükemmel bir sayıdır.");
		}else {
			System.out.println(number + " Mükemmel bir sayı değildir.");
		}
		
		
	}

}
