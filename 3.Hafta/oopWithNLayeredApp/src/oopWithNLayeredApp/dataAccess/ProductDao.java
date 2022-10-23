package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// Burası INTERFACE'dir

public interface ProductDao {
	// Interface'ler sadece metod imzasını barındırabilirler
	// Buradaki Metodlar Gövdesizdir.
	
	void add(Product product);
}
