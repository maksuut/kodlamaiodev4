package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"C#"));
		languages.add(new ProgrammingLanguage(2,"Java"));
		languages.add(new ProgrammingLanguage(3,"C"));
		languages.add(new ProgrammingLanguage(4,"C++"));
		languages.add(new ProgrammingLanguage(5,"Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
