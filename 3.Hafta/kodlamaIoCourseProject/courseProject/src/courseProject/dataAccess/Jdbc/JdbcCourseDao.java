package courseProject.dataAccess.Jdbc;

import courseProject.dataAccess.Interfaces.ICourseDao;
import courseProject.entities.Course;

public class JdbcCourseDao implements ICourseDao  {

	@Override
	public void add(Course course) {
		System.out.println("Kurs veritabanına kaydedildi..(JDBC)");
		
	}


}
