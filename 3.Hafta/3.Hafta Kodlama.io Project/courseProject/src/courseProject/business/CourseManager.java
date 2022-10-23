package courseProject.business;

import java.util.List;

import courseProject.core.logging.Logger;
import courseProject.dataAccess.Interfaces.ICourseDao;
import courseProject.entities.Course;

public class CourseManager {

	private ICourseDao iCourseDao;
	List<Logger> loggers;
	List<Course> courses;
	
	public CourseManager(ICourseDao iCourseDao,List<Logger> loggers) {
		this.iCourseDao = iCourseDao;
		this.loggers = loggers;	
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice()<=0) {
			throw new Exception ("Kurs fiyatı 0 dan küçük olamaz!");
		}
		
		iCourseDao.add(course);
		

		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
}
