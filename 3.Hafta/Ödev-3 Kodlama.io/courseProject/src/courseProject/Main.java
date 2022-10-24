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
// 		loggers.add(new DatabaseLogger());
//		loggers.add(new MailLogger());
		
		// Kategori kayıt
		System.out.println("\n--------------- KATEGORİ --------------------");
		
		List<Category> categoryList = new ArrayList<>();
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Dil Eğitimi");	
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Tasarım");	
		
		Category category4 = new Category();
		category4.setId(4);
		category4.setName("Tasarım");	
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categoryList);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		//categoryManager.add(category4);
		
		categoryManager.list();

		System.out.println("\n----------------- EĞİTMEN ------------------");
		
		//Eğitmen Kayıt
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Engin DEMİROĞ");
		

			
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers );
		teacherManager.add(teacher);

		System.out.println("\n-------------- KURS -------------------");
		
		// Kurs Kayıt

		List<Course> courseList = new ArrayList<>();
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course1.setPrice(1000);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Yazılım Geliştirici Yetiştirme Kampı - C#");
		course2.setPrice(1000);
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Yazılım Geliştirici Yetiştirme Kampı - REACT");
		course3.setPrice(1000);

		Course course4 = new Course();
		course4.setId(4);
		course4.setName("Yazılım Geliştirici Yetiştirme Kampı - C#");
		course4.setPrice(1000);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers,courseList);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		//courseManager.add(course4);
		
		courseManager.list();

		System.out.println("-----------------------------------");


		
	}

}
