package courseProject.dataAccess.Jdbc;

import courseProject.dataAccess.Interfaces.ITeacherDao;
import courseProject.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitimci veritabanına kaydedildi..(JDBC)");
	}

}
