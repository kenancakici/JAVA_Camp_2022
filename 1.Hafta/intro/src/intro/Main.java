package intro;

public class Main {
	// Javaya giriş
	// Veriler, değişken tipleri, şart blokları, döngüler
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// Java'da değişken isimleri camelCase standardında yazılır.
		
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		// Tam sayı : integer
		int vade = 12;
		
		// Ondalık sayı : double
		double dolarDun = 18.30;
		double dolarBugun = 18.20;
		
		// mantıksal değişken : true veya false
		
		boolean dolarDustumu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);			
		}
		
		// diziler (Array)
		String[] krediler = {"Hızlı Kredi",
				"Maaşını Halkbanktan",
				"Mutlu Emekli",
				"Ev Kredisi",
				"Otomobil Kredisi"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
}
}
