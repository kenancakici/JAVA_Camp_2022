package courseProject.dataAccess.Interfaces;

import courseProject.entities.Course;

public interface ICourseDao {	
	void add(Course course);	
	void list();
}
