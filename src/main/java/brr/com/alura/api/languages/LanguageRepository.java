package brr.com.alura.api.languages;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language, String> {
    
}
    

