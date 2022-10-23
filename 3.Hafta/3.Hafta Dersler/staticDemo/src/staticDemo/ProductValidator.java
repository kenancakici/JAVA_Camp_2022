package staticDemo;

public class ProductValidator {

	
	// static metodlar tanımlandığında çalışacak yapıcı blok
	
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		// Bu constructor; Class sadece new'lendiğinde çalışır. static'te çalışmaz
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}
}
