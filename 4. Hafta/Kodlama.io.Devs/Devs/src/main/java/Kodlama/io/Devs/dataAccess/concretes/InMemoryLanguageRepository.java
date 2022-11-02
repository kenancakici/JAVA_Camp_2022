package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository // Bu sınıf bir veritabanı nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "JAVA"));
		languages.add(new ProgrammingLanguage(3, "PYTHON"));
		languages.add(new ProgrammingLanguage(4, "JAVA SCRIPT"));
		languages.add(new ProgrammingLanguage(5, "VB.NET"));
		languages.add(new ProgrammingLanguage(6, "KOTLIN"));
		languages.add(new ProgrammingLanguage(7, "HTML"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : languages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	@Override
	public void delete(int id) {
		// languages.remove(id);
		for (ProgrammingLanguage programmingLanguage : languages) {
			if (programmingLanguage.getId() == id) {
				languages.remove(programmingLanguage);
			}
		}

	}

	@Override
	public void add(ProgrammingLanguage newLanguage) {
		languages.add(newLanguage);
	}

	@Override
	public void update(ProgrammingLanguage language) {
		for (int i = 0; i < languages.size(); i++) {
			{
				if (languages.get(i).getId() == language.getId()) {
					languages.set(i, language);
				}
			}
		}
	}

}
