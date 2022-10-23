package courseProject.dataAccess.Hibernate;

import courseProject.dataAccess.Interfaces.ICategoryDao;
import courseProject.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori, veritabanına kaydedildi..(HIBERNATE)");
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}


}
