package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgramminLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgramminLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}
	@Override
	public ProgrammingLanguage getID(int id) {
		return programmingLanguageRepository.getID(id);
	}
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getName().isEmpty()) {
			for (ProgrammingLanguage l:programmingLanguageRepository.getAll()) {
				if (l.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					System.out.println("Aynı dili tekrar yazamazsınız");
				}else {
					System.out.println("Dilin adını boş yazamazsınız");
				}
			}
		}
	}
	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		if (!programmingLanguage.getName().equals("")) {
			System.out.println("Dilin adını boş yazamazsınız");
		}
	}
	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
	}
	
}
