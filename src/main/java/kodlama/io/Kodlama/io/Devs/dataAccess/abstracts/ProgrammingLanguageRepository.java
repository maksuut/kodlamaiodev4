package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getID(int id);
	
	void add(ProgrammingLanguage programmingLanguage);
	
	void update(ProgrammingLanguage programmingLanguage);
	
	void delete (int id);
}
