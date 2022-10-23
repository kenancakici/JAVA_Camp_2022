package abstractClasses;

// Oyuncu tipine göre değişkenlik gösterecek.(Kadın,Erkek,Çocuk)

/*
 Bu sınıf ve meteodlar abstract olarak belirlendiğinde;
 	hesapla metodunun hiçbir zaman defaultu olmayacak. Kim implemente ediyorsa hesapla'yı içermek zorunda. 
 	Ve override etmek zorundadır. Kullanıcı türüne göre herkes override edecektir.
  	gameOver 'ı olduğu gibi kullanmak zorunda. Final olarak belirlendiğinde Hiçbir zaman değişmeyecektir.
 
 
 
 */


public abstract class GameCalculator {
	
	public abstract void hesapla(); // Kullanıldığı yerde (inherit/implement) override edilerek yeniden yazılacak. Kendi kodunu yazmak zorunda

	// Tüm oyuncular için aynı olacak.
	public final void gameOver() {
		System.out.println("Oyun bitti....");
	}
}
