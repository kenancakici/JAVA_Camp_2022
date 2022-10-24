package courseProject.dataAccess.Hibernate;

import java.util.List;

import courseProject.dataAccess.Interfaces.ICourseDao;
import courseProject.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs, veritabanına kaydedildi..(HIBERNATE)");
		
	}

	@Override
	public void list(List<Course>courses) {
		System.out.println("---------- Kayıtlı Kurslar --------------");
		for (Course course : courses) {
			System.out.println(course.getName());
		}
	}


}
