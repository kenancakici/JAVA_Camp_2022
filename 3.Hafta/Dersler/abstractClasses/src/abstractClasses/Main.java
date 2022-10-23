package abstractClasses;
// Java Dersi 40 : Abstract Sınıflarla Çalışmak
// https://www.youtube.com/watch?v=7PJ6YCX52XA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=41

/*
 SENARYO
 ----------
Bir oyun yazıyoruz ve bu oyunda puan hesaplama işlemi yapacağız.
Puan hesaplamada belirli algoritma yazacağız.
3 tip kullanıcımız var. Erkek, Kadın, Çocuk 
Bu  kullanıcı tipleri için puan hesaplaması farklılık göstermektedir.
Bu nedenle hemen aklımıza Base bir nesne gelmelidir. İşi IF lerle yapmaya çalışmak spagetti koda sebep olur.
// İf erkekse, if Kadınsa, if Çocuksa.. .
 Bu nedenle temel nesmeizi oluşturuyoruz. GameCalculator
 
 */


public class Main {

	public static void main(String[] args) {

		/*
		KidsGameCalculator calculator = new KidsGameCalculator();
		calculator.hesapla();
		calculator.gameOver();
		*/
		
		// abstract'lar asla newlenemezler. Yani tekbaşlarına kullanılamazlar.
		
		GameCalculator gameCalculator = new WomanGameCalculator();		
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
		GameCalculator gameCalculator2 = new OlderGameCalculator();		
		gameCalculator2.hesapla();
		gameCalculator2.gameOver();
	}

}
