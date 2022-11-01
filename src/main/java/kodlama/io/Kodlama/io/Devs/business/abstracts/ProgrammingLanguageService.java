package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	void delete(int id);

	void update(ProgrammingLanguage programmingLanguage);

	void add(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage getID(int id);
}
