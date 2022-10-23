package inheritanceDemo;
// Java Dersi 37 : Önemli - Inheritance Demo
// https://www.youtube.com/watch?v=N6Na8LLl-OQ&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=38

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI = new KrediUI();
		//krediUI.kredihesapla(new OgretmenKrediManager());
		//krediUI.kredihesapla(new TarimKrediManager());
		krediUI.kredihesapla(new AskerKrediManager());
	}

}
