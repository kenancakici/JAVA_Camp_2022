package classesWithAttributes;
// Java Dersi 31 : Field ve Attribute ile Çalışmak
// https://www.youtube.com/watch?v=EoXqaSX9nrc&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=32

// Java Dersi 32 : Encapsulation İhtiyacını Anlamak
// https://www.youtube.com/watch?v=9qYgEaAaef8&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=33

// Java Dersi 33 : Getter ve Setter ile Çalışmak
// https://www.youtube.com/watch?v=GDZmePf3Xmo&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=34

public class Main {

	public static void main(String[] args) {
		
		//Product product = new Product(1, "Laptop", "ASUS NOTEBOOK", 3, 5000,"Siyah");
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("ASUS LAPTOP");
		product.setStockAmount(3); 
		product.setPrice(5000); 
		product.setColor("Siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println("Kod :" + product.getCode());

				
		

	}

}
