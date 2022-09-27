package recapDemo1;

public class Main {

	// ======================================
	// ReCap Demo 1 En Büyük Sayı Hangisi
	// ======================================
	
	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 =  26;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		} 

		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		} 
		
		System.out.println("En büyük sayı : "  + enBuyuk);
		
		
	}

}
