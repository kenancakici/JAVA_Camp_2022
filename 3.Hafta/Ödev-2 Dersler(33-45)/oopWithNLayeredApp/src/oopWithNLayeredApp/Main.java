package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.core.logging.SmsLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// ===========================================
		// JAVA Kampı 3.Gün 05.10.2022 21:00
		// N Layered App , Çok katmanlı Mimari
		//
		// ============================================

		Logger[] loggers = { new FileLogger(), new DatabaseLogger(), new MailLogger(), new SmsLogger() };
		Product product1 = new Product(1, "IPhone Xr", 9000);
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}
}