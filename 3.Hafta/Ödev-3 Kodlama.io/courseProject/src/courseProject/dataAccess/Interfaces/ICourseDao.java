package courseProject.dataAccess.Interfaces;

import java.util.List;

import courseProject.entities.Course;

public interface ICourseDao {	
	void add(Course course);	
	void list(List<Course> courseList);
}
