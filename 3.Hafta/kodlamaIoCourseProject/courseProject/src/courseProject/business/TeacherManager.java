package courseProject.business;

import java.util.List;

import courseProject.core.logging.Logger;
import courseProject.dataAccess.Interfaces.ITeacherDao;
import courseProject.entities.Teacher;

// İş kuralları / Business rules

public class TeacherManager {

	private ITeacherDao iTeacherDao;
	private List<Logger> loggers; // Loglama sistemleri dizi içerisinde tutuluyor.

	// constructor
	public TeacherManager(ITeacherDao iTeacherDao, List<Logger> loggers) {
		this.iTeacherDao = iTeacherDao;
		this.loggers = loggers;
	}

	// Add method
	public void add(Teacher teacher) throws Exception {
		
		if (teacher.getName().isEmpty()) {
			throw new Exception("Eğitimci adı boş olamaz!");
		}
		
		iTeacherDao.add(teacher);
		
		// Çoklu loglama yapısının simule edilmesi
		for (Logger logger : loggers) {
			logger.log(teacher.getName());
		}
	}
	
//	// Delete method
//	
//	public void delete(Teacher teacher) throws Exception {
//		if(teacher.getId() <= 0) {
//			throw new Exception ("Silinecek eğitimcinin ID'si verilmelidir!");
//		}
//		
//		iTeacherDao.delete(teacher);
//		
//		// Çoklu loglama yapısının simule edilmesi
//		for (Logger logger : loggers) {
//			logger.log(teacher.getTeacherName() + " <SİLİNDİ>");
//		}
//		
//		
//	}
}
