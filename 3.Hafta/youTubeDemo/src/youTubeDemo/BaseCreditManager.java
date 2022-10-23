package youTubeDemo;

// ABSTRACT CLASS
// DRY : Don't repeat yourself.. Kendini tekrar etme.
 abstract class BaseCreditManager implements ICreditManager {

	// Calculate metodu ortak değil her yerde değişkendir. 
	// Abstract olarak belirleniyor.Sadece imzası yazılıyor. Yani tamamlanmamış operasyondur.
	
	
	public abstract void Calculate() ;

	//Save metodu her yerde ortaktır.
	public void Save() {
		System.out.println("Kaydedildi...");
		
	}

}
