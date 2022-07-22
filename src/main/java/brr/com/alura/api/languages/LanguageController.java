package brr.com.alura.api.languages;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //mecanismo de anotação - meta dados - add extra information in java
public class LanguageController {
    
    private List<Language> languages = 
        List.of(
            new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/java/java_256x256.png", 1),
            new Language("C++", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/cpp/cpp_256x256.png", 2),
            new Language("JavaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/0.0.3/src/javascript/javascript_256x256.png", 3)
        );

    @GetMapping(value="/favorite-language")
    public String processFavoriteLanguage() {
        return "Hi, Java!";
    }

    @GetMapping(value="/languages")
    public List<Language> getLanguage() {
        List<language> languages = 
        return languages;
    }


}
