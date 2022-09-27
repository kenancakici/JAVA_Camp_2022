package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC : Java Database Connection ile veri tabanına yazılacak
		System.out.println("Ürün Eklendi. " + product.getName());
	}

}
