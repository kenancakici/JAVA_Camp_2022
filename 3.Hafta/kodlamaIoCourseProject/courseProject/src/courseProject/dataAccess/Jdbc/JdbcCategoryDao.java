package courseProject.dataAccess.Jdbc;

import courseProject.dataAccess.Interfaces.ICategoryDao;
import courseProject.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori veritabanına kaydedildi..(JDBC)");
		
	}


}
