package courseProject.dataAccess.Hibernate;

import courseProject.dataAccess.Interfaces.ICourseDao;
import courseProject.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs, veritabanına kaydedildi..(HIBERNATE)");
		
	}


}
