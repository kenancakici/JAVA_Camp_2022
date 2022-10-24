package courseProject.business;

import java.util.List;

import courseProject.core.logging.Logger;
import courseProject.dataAccess.Interfaces.ICategoryDao;
import courseProject.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories;
	
	
	
	public CategoryManager(ICategoryDao categoryDao,List<Logger> loggers,List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;	
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		for (Category cat : categories) {
			if(category.getName().equals(cat.getName())) {
				throw new Exception ("Bu kategori daha önce tanımlanmıştır! [" + category.getName() +"]");
			}
		}
		
		
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	
	public void list() {
		System.out.println("\n----------- Kayıtlı Kategoriler ---------");
		for (Category cat : categories) {
			System.out.println(cat.getName());
		}
	}
}
