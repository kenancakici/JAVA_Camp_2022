package staticDemo;
// Java Dersi 45 : Composition - Inner Class ve Static
// https://www.youtube.com/watch?v=CRGYJ_kJpPk&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=46

/*
 
Bir metodu static yaptığımızda direkt olarak class ismiyle çağrılır.

 */

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id = 1;
		product.name = "Mouse";
		product.price = 0;
		
		ProductManager manager = new ProductManager();
		manager.add(product);

		// inner Class kullanım örneği. Bkz : DatabaseHelper
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.update();
		DatabaseHelper.Crud.delete();
	}

}
