package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

// İsteğin yapıldığı yer.Erişim noktası.
// İstek controller'a yapılıyor.İstek uygun bulunursa Business'a gidiyor. Diller listelenmeye çaışılıyor sen ne dersin ? :)
// Business katmanı iş kurallarına uyduğu takdirde DataAccess'ten verileir alıyor.
// 


// GET		: Veri görüntülemek istediğimiz zaman kullanıyoruz.					@GetMapping
// POST		: Veri kaydetmek istediğimiz zaman kullanıyoruz.					@PostMapping
// PUT		: Veri güncellemek istediğimzde kullanıyoruz.						@PutMapping
// PATCH	: Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz.	@PatchMapping
// 				Örn. Parola güncellemek gibi.
// DELETE	: Veri silmek istediğimiz zaman kullanıyoruz.						@DeleteMapping


@RestController // annotation
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired // Parametrelere bak. Uygulamayı tara. Kim bu servisi implemente ediyor onun newlenmiş halini bana ver.
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	// Bu metoda erişebilmek için @GetMapping annotation'ı kullanıyoruz.
	// localhost:8080/api/languages/getall

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getbyid/{langId}")
	public ProgrammingLanguage getById(@PathVariable("langId") int id) {
		return languageService.getById(id);
	}

	@DeleteMapping("/delete/{langId}")
	public List<ProgrammingLanguage> delete(@PathVariable("langId") int id){
		languageService.delete(id);
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public List<ProgrammingLanguage> add(@RequestBody ProgrammingLanguage newLanguage) throws Exception {
		languageService.add(newLanguage);
		return languageService.getAll();
	}
	
	@PutMapping("/update")
	public List<ProgrammingLanguage> update(@RequestBody ProgrammingLanguage newLanguage) {
		languageService.update(newLanguage);
		return languageService.getAll();
	}
}
