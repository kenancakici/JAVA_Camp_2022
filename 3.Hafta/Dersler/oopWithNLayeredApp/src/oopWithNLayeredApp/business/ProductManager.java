package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

// iş kurallarımız BUSINESS bölümüne yazılır.

public class ProductManager {
	private ProductDao productDao;
	public Logger[] loggers;
	
	// ProductManager newlendiğinde bana bir ProductDao ver.
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// İş kurallarını buraya yazıyoruz.
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz!"); // Program burada kırılır
		}
		// Eğer program buraya gelirse iş kurallarına uygun demektir.
		// ==========================================================
		// Bu iki yöntem birbirinin alternatifidir. Hibernate ve JDBC
		// Bu durumda Interface kullanmalıyız.
		// KURAL : Bir katman başka bir katmanın class ını kullanıyorken sadece INTERFACE'ninden erişim kurmalıdır.
		
		productDao.add(product);
		//Loglama
		
		for (Logger logger : loggers) { // db[] , mail[]
			logger.log(product.getName());
		}
		
	}
}
