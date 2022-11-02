package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface LanguageService {
	
	// iş kurallarını yazacağımız yapıyı tasarlıyoruz.
	// Request–response pattern kullanacağız. İstek-Yanıt patterni.
	// Biz bir istekte bulunuruz. Sunucu ise bu isteği değerlendirir ve cevap döner.
	
	List<ProgrammingLanguage> getAll();	
	void add(ProgrammingLanguage language) throws Exception;
	ProgrammingLanguage getById(int id);
	void delete(int id);
	void update(ProgrammingLanguage language);
}
