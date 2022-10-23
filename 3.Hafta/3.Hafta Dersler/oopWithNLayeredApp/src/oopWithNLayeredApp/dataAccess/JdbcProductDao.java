package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// Bu sınıfı ProductDao dan implement ediyoruz.
// Sen ProductDao kurallarına uymak zorunda olan bir sınıfsın.

public class JdbcProductDao implements ProductDao{
	
	// DAO : Data Access Object
	// veri tabanına erişim işlemleri yapacağız.

	public void add(Product product) {
		// Bu katman sadece ve sadece DB erişim kodları buraya yazılır. Bunun için SQL bilinmesi gerekir.

		System.out.println("JDBC ile veritabanına eklendi");
	}
}
