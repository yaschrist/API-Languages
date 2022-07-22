package brr.com.alura.api.languages;

public class Language {
    private String title;
    private String image;
    private int ranking;

    

    //source actions -> generate constructors

    public Language(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
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
