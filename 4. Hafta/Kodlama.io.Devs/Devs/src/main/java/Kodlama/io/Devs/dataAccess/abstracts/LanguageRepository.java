package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

// Interfaceler mutlaka soyut oluşturulmalıdır.

// Repository : Veritabanı işlemlerini yapacak sınıflara verdiğimiz isimlerdir.
/*
	 Repository; temel olarak veritabanı sorgulama işlemlerinin bir merkezden yapılmasını sağlayarak 
	 iş katmanına taşınmasını önler ve bu şekilde sorgu ve kod tekrarına engel olmuş olur. 
	 Yani asıl amaç veri işlem ve sorgulamaların tekrarlardan kaçınılarak merkezi bir yapıya çekilmesidir. 
	 Bu sayede veritabanı işlemlerimizi tekrar ve tekrar iş katmanı içinde yazmak durumununda kalmamış oluruz.
	 Kaynak: https://medium.com/bili%C5%9Fim-hareketi/repository-ve-unit-of-work-tasar%C4%B1m-kal%C4%B1b%C4%B1-ve-uygulanmas%C4%B1-9d471d617a9d
 */


public interface LanguageRepository {
	
	public List<ProgrammingLanguage> getAll();		// Tümünü listeme
	public ProgrammingLanguage getById(int id); 	// verilen id'ye göre ProgrammingLanguage tipinde kayıt getirir.
	public void add(ProgrammingLanguage newLanguage); 		// Yeni Kayıt ekleme
	public void delete(int id);						// Kayıt silme
	public void update(ProgrammingLanguage language); 	// Kayıt güncelleme
	

}
