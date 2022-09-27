
public class Main {

	// =================================================
	// Mini Proje 2 - Kalın Sesli ve İnce Sesli Harfler
	// =================================================

	public static void main(String[] args) {

		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf + " Kalın sesli harftir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println(harf + " İnce sesli harftir.");
			break;
			
		default:
			System.out.println(harf + " Sesli harf değildir.");
		}

	}

}
