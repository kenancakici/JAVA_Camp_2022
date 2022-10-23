package staticDemo;

public class ProductManager {

	void add(Product product) {

		// Bir metodu static yaptığımızda direkt olarak class ismiyle çağrılır.

		if (ProductValidator.isValid(product)) {
			System.out.println("Ürün Eklendi....");
		} else {
			System.out.println("Ürün bilgileri geçersiz....");
		}
	}
}

/*
 * - Product| Ürün - ProductValidator | Kontrol - ProductManager | Ürünün
 * veritabanına eklenmesi
 */