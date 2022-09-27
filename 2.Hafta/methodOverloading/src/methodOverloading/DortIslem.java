package methodOverloading;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;		
	}
	
	public int Topla(int sayi1, int sayi2,int sayi3) {;
		return sayi1 + sayi2 + sayi3;		
	}
	
	
//	public int Topla(int...sayi1) {
//		System.out.println("Variable arguments...");;
//		int toplam = 0;
//		for (int i : sayi1) {
//			toplam += i;
//		}
//		
//		return toplam;		
//	}
	
}
