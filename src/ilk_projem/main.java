package ilk_projem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String izlenenFilm1 = "Hirsizlar Sehri";
        String izlenenFilm2 = "Ruh Kapani";
        String izlenenFilm3 = "Guvenli Ev";
        String izlenenFilm4 = "Batman Kara Sovalye";
        String izlenenFilm5 = "Joker";
        String izlenenFilm6 = "Kanli Elmas";
        String izlenenFilm7 = "Newyork Ceteleri";
        String izlenenFilm8 = "Mad Max:Fury Road";
        String izlenenFilm9 = "Polar";
        String izlenenFilm10 = "Hacivat ve Karagoz Neden Olduruldu?";
        String izlenenFilm11 = "Av Mevsimi";
        String izlenenFilm12 = "Spenser Kanunlari";
        Scanner scanner = new Scanner(System.in);
        String id = "orhanr";

        String girilenId;
        do {
            System.out.println("Lutfen ID giriniz:");
            girilenId = scanner.nextLine();
            System.out.println("girilenID = " + girilenId);
        } while (!girilenId.equals("orhanr"));

        if (!girilenId.equals("orhanr")) {
            System.out.println("Kod Durumu:Gecersiz!!");
        } else {
            System.out.println("Kod Durumu:Gecerli!");
        }

        new Scanner(System.in);
        System.out.println("Lutfen film adi giriniz:");
        String girilenFilmAdi = scanner.nextLine();
        System.out.println("girilenFilmAdi = " + girilenFilmAdi);
        if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm1)) {
            System.out.println("bu filmi izledin,baska film sec!!");
            System.out.println();
            new Movies("Hirsizlar Sehri", "Suc ve Drama", "Ben Affleck", "The Town", 2010, 7.5, "https://www.imdb.com/title/tt0840361/?ref_=fn_al_tt_1");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm2)) {
            System.out.println("bu filmi  izledin!");
            System.out.println();
            new Movies("Ruh Kapani", "Aksiyon", "Daniel Markowicz", "Soulcatcher", 2023, 3.8, "https://www.imdb.com/find/?q=ruh%20kapani&ref_=nv_sr_sm");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm3)) {
            System.out.println("bu filmi  izledin,baska bir film sec!");
            System.out.println();
            new Movies("Guvenli Ev", "Aksiyon", "Daniel Espinosa", "Safe House", 2012, 6.7, "https://www.imdb.com/title/tt1599348/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_safe%2520ho");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm4)) {
            System.out.println("Batman filmini zaten izledin!!");
            System.out.println();
            new Movies("Batman Kara Sovalye", "Aksiyon,Polisiye ve Drama", "Christopher Nolan", "The Dark Night", 2008, 9.0, "https://www.imdb.com/title/tt0468569/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_the%2520dar");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm5)) {
            System.out.println("Joker filmini daha once izledin canim benim!!");
            System.out.println();
            new Movies("Joker", "Polisiye ve Dram", "Todd Phillips", "Joker", 2019, 8.4, "https://www.imdb.com/title/tt7286456/?ref_=nv_sr_srsg_0_tt_6_nm_2_q_joke");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm6)) {
            System.out.println("Evet bu filmi  izledin daha once!!");
            System.out.println();
            new Movies("Kanli Elmas", "Macera ve Dram", "Edward Zwick", "Blood Diamond", 2006, 8.0, "https://www.imdb.com/title/tt0450259/?ref_=tt_sims_tt_i_12");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm7)) {
            System.out.println("Newyork Ceteleri filmini  izledin!!");
            System.out.println();
            new Movies("Newyork Ceteleri", "Polisiye ve Dram", "Martin Scorsese", "Gangs of New York", 2002, 7.5, "https://www.imdb.com/title/tt0217505/?ref_=fn_al_tt_1");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm8)) {
            System.out.println("Mad max'i izlemistin daha once!!");
            System.out.println();
            new Movies("Mad Max: Fury Road", "Aksiyon,Macera ve Bilim Kurgu", "George Miller", "Mad Max: Fury Road", 2015, 8.1, "https://www.imdb.com/title/tt1392190/?ref_=tt_sims_tt_i_10");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm9)) {
            System.out.println("Polar filmini daha once izledin!!");
            System.out.println();
            new Movies("Polar", "Aksiyon", "Jonas Åkerlund", "Polar", 2019, 6.3, "https://www.imdb.com/title/tt4139588/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_polar");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm10)) {
            System.out.println("Hacivat ve Karagoz filmini daha once izledin!");
            System.out.println();
            new Movies("Hacivat ve Karagoz Neden Olduruldu?", "Komedi,Dram ve Tarihi", "Ezel Akay", "Why Hacivat and Karagoz Killed?", 2006, 7.5, "https://www.imdb.com/title/tt0485510/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_hacivat");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm11)) {
            System.out.println("Av Mevsimi filmini daha once izledin!!");
            System.out.println();
            new Movies("Av Mevsimi", "Polisiye,Dram,Gizem ve Gerilim", "Yavuz Turgul", "Bilinmiyor", 2010, 7.4, "https://www.imdb.com/title/tt1668191/?ref_=tt_sims_tt_i_10");
        } else if (girilenFilmAdi.equalsIgnoreCase(izlenenFilm12)) {
            System.out.println("Spenser Kanunlari filmini daha once izledin!!");
            System.out.println();
            new Movies("Spenser Kanunlari", "Aksiyon,Komedi,Polisiye,Dram,Gizem ve Gerilim", "Peter Berg", "Spenser Confidential", 2020, 6.2, "https://www.imdb.com/title/tt8629748/");
        } else {
            System.out.println("bu filmi izlemedin ,istersen bunu izleyebilirsin!!");
        }
    }
}
