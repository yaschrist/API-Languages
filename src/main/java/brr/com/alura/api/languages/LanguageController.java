package brr.com.alura.api.languages;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController //mecanismo de anotação - meta dados - add extra information in java
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> getLanguages() {
         List<Language> languages = repository.findAll();
        return languages;
    }

    //@PostMapping("/languages")
    
    
    //private List<Language> languages = repository.findAll();
    //    List.of(
    //      new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/java/java_256x256.png", 1),
     //       new Language("C++", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/cpp/cpp_256x256.png", 2),
      //      new Language("JavaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/javascript/javascript_256x256.png", 3)
       // );

    //@GetMapping(value="/favorite-language")
    //public String processFavoriteLanguage() {
    //    return "Hi, Java!";
    //}

   // @GetMapping(value="/languages")
    //public List<Language> getLanguage() {
    //    List<language> languages = 
    //    return languages;
    //}


}
