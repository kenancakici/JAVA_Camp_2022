package courseProject.dataAccess.Hibernate;

import courseProject.dataAccess.Interfaces.ITeacherDao;
import courseProject.entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitimci, veritabanına kaydedildi..(HIBERNATE)");
		
	}


}
