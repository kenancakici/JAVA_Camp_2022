package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}


	public int topla(int... sayi) {
		int toplam = 0;
		for (int i = 0; i < sayi.length; i++) {
			toplam += sayi[i];
		}		
		return toplam;
	}

	
	
}
