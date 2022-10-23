package courseProject.business;

import java.util.List;

import courseProject.core.logging.Logger;
import courseProject.dataAccess.Interfaces.ICategoryDao;
import courseProject.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private List<Logger> loggers;
	
	
	
	public CategoryManager(ICategoryDao categoryDao,List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;	

	}
	
	public void add(Category category) throws Exception {
		if(category.getName().isEmpty()) {
			throw new Exception ("Kategori adı boş olamaz!");
		}
		
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
	}
}
