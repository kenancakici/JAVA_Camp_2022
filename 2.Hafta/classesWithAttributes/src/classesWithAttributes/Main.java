package classesWithAttributes;

public class Main {
	// ====================================================
	// Java Dersi 31 : Field ve Attribute ile Çalışmak
	// KAYNAK : https://www.youtube.com/watch?v=EoXqaSX9nrc&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=32
	// Java Dersi 32 : Encapsulation İhtiyacını Anlamak
	// KAYNAK : https://www.youtube.com/watch?v=9qYgEaAaef8&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=33
	// Java Dersi 33 : Getter ve Setter ile Çalışmak
	// KAYNAK : https://www.youtube.com/watch?v=GDZmePf3Xmo&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=34
	// Java Dersi 34 : Constructor (Yapıcı Metodlar) ile Çalışmak
	// KAYNAK : https://www.youtube.com/watch?v=HDaM5aRjWvI&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=35
	// ====================================================
	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("ASUS Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println("Kod : " + product.getKod());
	}

}
