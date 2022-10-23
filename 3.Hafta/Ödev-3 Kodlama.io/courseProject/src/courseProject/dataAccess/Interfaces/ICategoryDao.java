package courseProject.dataAccess.Interfaces;

import courseProject.entities.Category;

public interface ICategoryDao {
	void add(Category category);
	void list();
}
