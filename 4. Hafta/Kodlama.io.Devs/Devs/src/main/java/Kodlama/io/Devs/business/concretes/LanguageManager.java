package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service 				// Bu sınıf bir Business nesnesidir.
public class LanguageManager implements LanguageService {
	
	// injection yapıyoruz.
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	// iş kuralları.

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}


	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage language = languageRepository.getById(id);
		return language;
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

	@Override
	public void add(ProgrammingLanguage language) throws Exception {
		
		if(!language.getName().isEmpty()) {
			for (int i = 0; i < languageRepository.getAll().size(); i++) {
				if(languageRepository.getAll().get(i).getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Bu programlama dili kayıtlıdır.");
				}
			}
			
			languageRepository.add(language);
		}
		else {
			throw new Exception("Programlama dili boş olamaz!");
		}
		
		
	}

	@Override
	public void update(ProgrammingLanguage language) {
		languageRepository.update(language);
		
	}







}
