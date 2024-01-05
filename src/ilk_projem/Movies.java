package ilk_projem;

public class Movies {
    String film_Adi;
    String tur;
    String yonetmen;
    int vizyonYili;
    double IMDB;
    String englishNameOfTheMovie;
    String kaynak;

    public Movies(String film_Adi,String tur,String yonetmen,String englishNameOfTheMovie,int vizyonYili,double IMDB,String kaynak){
        this.film_Adi=film_Adi;
        this.tur=tur;
        this.yonetmen=yonetmen;
        this.englishNameOfTheMovie=englishNameOfTheMovie;
        this.vizyonYili=vizyonYili;
        this.IMDB=IMDB;
        this.kaynak=kaynak;

        System.out.println("Film Adi              = " + film_Adi);
        System.out.println("Tur                   = " + tur);
        System.out.println("Yonetmen              = " + yonetmen);
        System.out.println("EnglishNameOfTheMovie = " + englishNameOfTheMovie);
        System.out.println("Vizyon Yili           = " + vizyonYili);
        System.out.println("IMDB                  = " + IMDB);
        System.out.println("Kaynak                = " + kaynak);
    }
}


