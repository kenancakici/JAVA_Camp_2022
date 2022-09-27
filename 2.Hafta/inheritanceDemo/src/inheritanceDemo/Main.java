package inheritanceDemo;

public class Main {

	// ===============================================
	// Java Dersi 37 : Önemli - Inheritance Demo (POLYMORPHISM)
	// KAYNAK : https://www.youtube.com/watch?v=N6Na8LLl-OQ&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=38
	// ===============================================
	
	public static void main(String[] args) {
		
		KrediUI  krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
