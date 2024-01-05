package ilk_projem;

import java.util.Scanner;

public class Main extends Izlenenler {


    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        String gecerliId = "orhanr";

        String girilenId;
        do {
            System.out.println("Lutfen ID giriniz:");
            girilenId = scanner.nextLine();
            System.out.println("Girilen ID = " + girilenId);

            if (!girilenId.equals(gecerliId)) {
                System.out.println("MESAJ--> KOD GECERSIZ :(");
            }
        } while (!girilenId.equals(gecerliId));

        System.out.println("MESAJ--> KOD GECERLI :)");

        new Scanner(System.in);
        System.out.println("Lutfen film adi giriniz:");
        String girilenFilmAdi = scanner.nextLine();
        System.out.println("girilenFilmAdi = " + girilenFilmAdi);
        System.out.println();

        if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm1)) {
            System.out.println("bu filmi izledin,baska film sec!!");
            System.out.println();
            new Movies("Hirsizlar Sehri", "Suc ve Drama", "Ben Affleck", "The Town", 2010, 7.5, "https://www.imdb.com/title/tt0840361/?ref_=fn_al_tt_1");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm2)) {
            System.out.println("bu filmi  izledin!");
            System.out.println();
            new Movies("Ruh Kapani", "Aksiyon", "Daniel Markowicz", "Soulcatcher", 2023, 3.8, "https://www.imdb.com/find/?q=ruh%20kapani&ref_=nv_sr_sm");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm3)) {
            System.out.println("bu filmi  izledin,baska bir film sec!");
            System.out.println();
            new Movies("Guvenli Ev", "Aksiyon", "Daniel Espinosa", "Safe House", 2012, 6.7, "https://www.imdb.com/title/tt1599348/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_safe%2520ho");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm4)) {
            System.out.println("Batman filmini zaten izledin!!");
            System.out.println();
            new Movies("Batman Kara Sovalye", "Aksiyon,Polisiye ve Drama", "Christopher Nolan", "The Dark Night", 2008, 9.0, "https://www.imdb.com/title/tt0468569/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_the%2520dar");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm5)) {
            System.out.println("Joker filmini daha once izledin canim benim!!");
            System.out.println();
            new Movies("Joker", "Polisiye ve Dram", "Todd Phillips", "Joker", 2019, 8.4, "https://www.imdb.com/title/tt7286456/?ref_=nv_sr_srsg_0_tt_6_nm_2_q_joke");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm6)) {
            System.out.println("Evet bu filmi  izledin daha once!!");
            System.out.println();
            new Movies("Kanli Elmas", "Macera ve Dram", "Edward Zwick", "Blood Diamond", 2006, 8.0, "https://www.imdb.com/title/tt0450259/?ref_=tt_sims_tt_i_12");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm7)) {
            System.out.println("Newyork Ceteleri filmini  izledin!!");
            System.out.println();
            new Movies("Newyork Ceteleri", "Polisiye ve Dram", "Martin Scorsese", "Gangs of New York", 2002, 7.5, "https://www.imdb.com/title/tt0217505/?ref_=fn_al_tt_1");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm8)) {
            System.out.println("Mad max'i izlemistin daha once!!");
            System.out.println();
            new Movies("Mad Max: Fury Road", "Aksiyon,Macera ve Bilim Kurgu", "George Miller", "Mad Max: Fury Road", 2015, 8.1, "https://www.imdb.com/title/tt1392190/?ref_=tt_sims_tt_i_10");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm9)) {
            System.out.println("Polar filmini daha once izledin!!");
            System.out.println();
            new Movies("Polar", "Aksiyon", "Jonas Åkerlund", "Polar", 2019, 6.3, "https://www.imdb.com/title/tt4139588/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_polar");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm10)) {
            System.out.println("Hacivat ve Karagoz filmini daha once izledin!");
            System.out.println();
            new Movies("Hacivat ve Karagoz Neden Olduruldu?", "Komedi,Dram ve Tarihi", "Ezel Akay", "Why Hacivat and Karagoz Killed?", 2006, 7.5, "https://www.imdb.com/title/tt0485510/?ref_=nv_sr_srsg_0_tt_8_nm_0_q_hacivat");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm11)) {
            System.out.println("Av Mevsimi filmini daha once izledin!!");
            System.out.println();
            new Movies("Av Mevsimi", "Polisiye,Dram,Gizem ve Gerilim", "Yavuz Turgul", "Bilinmiyor", 2010, 7.4, "https://www.imdb.com/title/tt1668191/?ref_=tt_sims_tt_i_10");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm12)) {
            System.out.println("Spenser Kanunlari filmini daha once izledin!!");
            System.out.println();
            new Movies("Spenser Kanunlari", "Aksiyon,Komedi,Polisiye,Dram,Gizem ve Gerilim", "Peter Berg", "Spenser Confidential", 2020, 6.2, "https://www.imdb.com/title/tt8629748/");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm13)) {
            System.out.println("Snowden filmini izledin!!");
            System.out.println();
            new Movies("Snowden", "Biyografi,Polisiye,Dram,Gerilim", "Oliver Stone", "Snowden", 2016, 7.3, "https://www.imdb.com/title/tt3774114/?ref_=nv_sr_srsg_0_tt_4_nm_4_q_snowde");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm14)) {
            System.out.println("John wick 1. Bu filmi izledin! Harika bir aksiyon filmi!!");
            System.out.println();
            new Movies("John Wick 1", "Aksiyon,Polisiye,Gerilim", "Chad Stahelski ve David Leitch", "John Wick", 2014, 7.4, "https://www.imdb.com/title/tt2911666/?ref_=nv_sr_srsg_0_tt_7_nm_1_q_john%2520wick%2520");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm15)) {
            System.out.println("John Wick 2 filmini izledin!!");
            System.out.println();
            new Movies("John Wick 2", "Aksiyon,Polisiye,Gerilim", "Chad Stahelski", "John Wick", 2017, 7.4, "https://www.imdb.com/title/tt4425200/?ref_=tt_sims_tt_i_7");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm16)) {
            System.out.println("John Wick 3 filmini izledin!!");
            System.out.println();
            new Movies("John Wick 3", "Aksiyon,Polisiye,Gerilim", "Derek Kolstad,Shay Hatten,Chris Collins", "John Wick: Chapter 3 - Parabellum", 2019, 7.4, "https://www.imdb.com/title/tt6146586/?ref_=tt_sims_tt_i_2");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm17)) {
            System.out.println("John Wick 4 filmini izledin!!");
            System.out.println();
            new Movies("John Wick 4", "Aksiyon,Polisiye,Gerilim", "Shay Hatten,Michael Finch,Derek Kolstad", "John Wick: Chapter 4", 2023, 7.7, "https://www.imdb.com/title/tt10366206/?ref_=tt_sims_tt_i_3");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm18)) {
            System.out.println("Bu filmi izledin!!");
            System.out.println();
            new Movies("Tyler Rake: Extraction", "Aksiyon,Gerilim", "Sam Hargrave", "Tyler Rake: Extraction", 2020, 6.8, "https://www.imdb.com/title/tt8936646/?ref_=hm_tpks_tt_t_8_pd_tp1_pbr_ic");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm19)) {
            System.out.println("Bu filmi izledin!!");
            System.out.println();
            new Movies("Tyler Rake: Extraction 2", "Aksiyon,Gerilim", "Sam Hargrave", "Tyler Rake: Extraction 2", 2023, 7.0, "https://www.imdb.com/title/tt12263384/?ref_=tt_sims_tt_i_1");
        } else if (girilenFilmAdi.equalsIgnoreCase(Izlenenler.izlenenFilm20)) {
            System.out.println("Bu filmi izledin!!");
            System.out.println();
            new Movies("Thanksgiving", "Korku,Gizem,Gerilim", "Eli Roth", "Thanksgiving", 2023, 6.5, "https://www.imdb.com/title/tt1448754/?ref_=nv_sr_srsg_0_tt_4_nm_4_q_tha");
        } else {
            System.out.println("bu filmi izlemedin ,istersen bunu izleyebilirsin!!");
        }
    }
}
