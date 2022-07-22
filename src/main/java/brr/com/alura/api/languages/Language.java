package brr.com.alura.api.languages;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mainLanguages")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    

    //source actions -> generate constructors

    public Language() {
        
    }

    public Language(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }


    public String getId() {
        return id;
    }

    //source actions -> generate getters
    
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }
    

    
}
