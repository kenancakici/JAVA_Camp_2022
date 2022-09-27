package oop1;

public class Main {

	public static void main(String[] args) {

		// ===================================
		// OOP GİRİŞ
		// OOP : Object Oriented Programming (Nesne Güdümlü/Yönelimli Programlama)
		// ===================================

		/*
		 * Class (Sınıf) :Bir nesnenin özelliklerini tutar. Yani Class, nesnelerin
		 * durumları ile ilgili işlemleri ve özellikleri tanımlar.
		 * 
		 * 2 Tür class vardır. 1. Özellik tutucu 2. Operasyon tutucu olanlar Class
		 * isimlendirmelerinde "PascalCase" standardı kullanılır. Kelimelerin ilk harfi
		 * büyüktür. (örn. Product)
		 */

		String mesaj = "Vade oranı";

		Product product1 = new Product(); // Product tipinde yeni bir nesne tanımlıyoruz ve değer ataması yapıyoruz.
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jpg");
				
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			// Get value for products
			System.out.println("Product Name : " + product.getName());
			System.out.println("-----------------------------------------");
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05321654456");
		corporateCustomer.setTaxNumber("34212345678");
		corporateCustomer.setCustomerNumber("54321");

		// Farklı türleri bir arada tutabiliyoruz.
		// individualCustomer ve corporateCustomer birer Customer'dir.
		// Burada da oların referansları tutulmaktadır.
		// Değer ve referans tipler gündeme gelmektedir.
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
