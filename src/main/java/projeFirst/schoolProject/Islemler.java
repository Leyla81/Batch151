package projeFirst.schoolProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler { static List<Kisi> ogretmenList = new ArrayList<>();
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    //static yazmamizin sebebi tum methodlardan ulasmak icin... gokteki ay
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println("====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     0- ÇIKIŞ");


        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "0":
                cikis();
                break;
            default:
                System.out.println("Hatali giris :(");
                girisPaneli();
                break;
        }


    }

    private static void islemMenusu() {
        System.out.println(kisiTuru);
        System.out.println(" ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("Islem tercihinizi giriniz");

        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {

            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani anamenu

                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("otede oyna");
                islemMenusu();
                break;


        }


    }

    private static void cikis() {
        System.out.println("***** YINE BEKLERIZ *****");

    }

    private static void silme() {
        System.out.println("***** " + kisiTuru + " ***** SILME sayfasina hosgeldiniz");
        System.out.println("Silmek istediginiz kisinin kimlik no sunu giriniz");
        String kimlikNo = scan.next();

        if (kisiTuru.equals("OGRENCI")) {

            String sonuc = "";
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (ogrenciList.get(i).getKimlikNo().contains(kimlikNo)) {



                    sonuc="Silmis oldugunuz kisi = \n "+ogrenciList.remove(i);


                    break;


                } else {
                    sonuc ="Kimlik numarasini girdiginiz kisi listede yok";

                }
            }

            System.out.println(sonuc);

        } else {

            String sonuc = "";

            for (int i = 0; i < ogretmenList.size(); i++) {
                if (ogretmenList.get(i).getKimlikNo().contains(kimlikNo)) {


                    sonuc="Silmis oldugunuz kisi = \n "+ogretmenList.remove(i);


                    break;


                } else {
                    sonuc ="Kimlik numarasini girdiginiz ogretmen listede yok";

                }
            }

            System.out.println(sonuc);
        }
    }


    private static void listeleme() {
        System.out.println("***** " + kisiTuru + " ***** LISTELEME sayfasina hosgeldiniz");

        if (kisiTuru.equals("OGRENCI")) {
            System.out.println(ogrenciList);
        } else {
            System.out.println(ogretmenList);
        }


    }

    private static void arama() {

        System.out.println("***** " + kisiTuru + " ***** ARAMA sayfasina hosgeldiniz");
        System.out.println("Aramak istediginiz kisinin no sunu giriniz");
        String kimlikNo = scan.next();

        if (kisiTuru.equals("OGRENCI")) {

            String sonuc = "";
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (ogrenciList.get(i).getKimlikNo().contains(kimlikNo)) {

                    sonuc = "Bu kisi ogrenci listesinde var \n"+ogrenciList.get(i);


                    break;
                } else {
                    sonuc = "Bu kisi ogrenci listesinde yok";
                }
            }
            System.out.println(sonuc);

        } else {

            String sonuc = "";

            for (int i = 0; i < ogretmenList.size(); i++) {
                if (ogretmenList.get(i).getKimlikNo().contains(kimlikNo)) {
                    sonuc = "Bu kisi Ogretmen listesinde var";

                    System.out.println(ogretmenList.get(i));
                    break;
                } else {
                    sonuc = "Bu kisi Ogretmen listesinde yok";
                }
            }
            System.out.println(sonuc);
        }
    }


    private static void ekle() {// method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("*****" + kisiTuru + " ekleme sayfasina hosgeldin");

        System.out.println("Isim, soyisim gir");
        scan.nextLine();
        String adSoyad = scan.nextLine();


        System.out.println("Kimlik No gir");
        String kimlikNo = scan.nextLine();

        System.out.println("Yas gir");
        int yas = scan.nextInt();


        if (kisiTuru.equals("OGRENCI")) {//todo sonra doldur

            System.out.println("Ogrenci no giriniz");


            String ogrenciNo = scan.next();


            System.out.println("Sinif giriniz");
            String sinif = scan.next();


            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);

            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);


        } else {
            System.out.println("Bolum gir");
            scan.nextLine();//dummy code hata almamak icin
            String bolum = scan.nextLine();


            System.out.println("Sicil no gir");

            String sicilNo = scan.next();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);

            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);

        }

    }
}

