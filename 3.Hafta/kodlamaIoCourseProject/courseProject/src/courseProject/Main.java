package courseProject;

import java.util.ArrayList;
import java.util.List;

import courseProject.business.CategoryManager;
import courseProject.business.CourseManager;
import courseProject.business.TeacherManager;
import courseProject.core.logging.DatabaseLogger;
import courseProject.core.logging.FileLogger;
import courseProject.core.logging.Logger;
import courseProject.core.logging.MailLogger;
import courseProject.dataAccess.Hibernate.HibernateCategoryDao;
import courseProject.dataAccess.Hibernate.HibernateTeacherDao;
import courseProject.dataAccess.Jdbc.JdbcCourseDao;
import courseProject.entities.Category;
import courseProject.entities.Course;
import courseProject.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		// Loglama işlemleri
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
 		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		
		// Kategori kayıt
		System.out.println("\n--------------- KATEGORİ --------------------");
		Category category = new Category();
		category.setId(1);
		category.setName("Python Programlama");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category);

		System.out.println("\n----------------- EĞİTMEN ------------------");
		
		//Eğitmen Kayıt
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Engin DEMİROĞ");
		

			
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers );
		teacherManager.add(teacher);

		System.out.println("\n-------------- KURS -------------------");
		
		// Kurs Kayıt

		Course course = new Course();
		course.setId(1);
		course.setName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course.setPrice(1000);
		

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
			
		System.out.println("-----------------------------------");


		
	}

}
