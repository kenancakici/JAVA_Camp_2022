package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//Bu sınıfı ProductDao dan implement ediyoruz.
//Sen ProductDao kurallarına uymak zorunda olan bir sınıfsın.

public class HibernateProductDao implements ProductDao{
	
	public void add(Product product) {
		// Bu katman sadece ve sadece DB erişim kodları buraya yazılır. Bunun için SQL bilinmesi gerekir.

		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
