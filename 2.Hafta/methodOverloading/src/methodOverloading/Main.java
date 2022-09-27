package methodOverloading;

public class Main {

		// ==================================================
		// Java Dersi 35 : Method Overloading ile Çalışmak
		// KAYNAK : https://www.youtube.com/watch?v=X1UnM4W4-_w&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=36
		// =================================================
	
	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();		
		System.out.println(dortIslem.Topla(5, 4));
		System.out.println(dortIslem.Topla(10,5,9));		
	}

}
