package arraysDemo;

public class Main {

	// ==================================
	// Dizilerle Çalışmaya Başlamak
	// ==================================
	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------1-------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------2-------------");
		
		// Farklı bir yaklaşım
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("-----------3-------------");
	}

}
