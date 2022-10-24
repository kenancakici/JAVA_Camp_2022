package courseProject.dataAccess.Jdbc;

import java.util.List;

import courseProject.dataAccess.Interfaces.ICourseDao;
import courseProject.entities.Course;

public class JdbcCourseDao implements ICourseDao  {

	@Override
	public void add(Course course) {
		System.out.println("Kurs veritabanına kaydedildi..(JDBC)");
		
	}

	@Override
	public void list(List<Course> courses) {
		System.out.println("\n---------- Kayıtlı Kurslar --------------");
		for (Course course : courses) {
			System.out.println(course.getName());
		}
		
	}


}
