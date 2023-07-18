package LAMBDA.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {


    public static void main(String[] args) {

        /*
         * lambda method create etmede mevcut methodları library den cagırıp kullanmaktır
         * Java 8 ile eklenmistir
         * Functional Programming dir .mimariye onem vermez
         * Hiz, clean code ve okunabilirlik acısındaönemlidir
         *
         *
         * */
        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Edirne", "Ordu", "Van", "İzmir", "Eskisehir", "Safranbolu", "İzmir", "Mus"));
       printElements(iller);
        System.out.println();
        printEl(iller);
        System.out.println();
        EHaricElYazdir(iller);
        System.out.println();
        characterSayısıDortenAzOlanElYazdir(iller);
        System.out.println();
        characterSayısıDortencokOlanBuyukHarfElYazdir(iller);
        System.out.println();
        characterSayısıDortencokOlanTekrarsızKucukHarfElYazdir(iller);
        System.out.println();
        tkrszBuyukHrfAlfabetikSiraYazdir(iller);
        System.out.println();
        tekrarsızlarıuzunluklarınagoreSırala(iller);
        System.out.println();
        TumElIlkHrfBuyukYazdır(iller);
        System.out.println();
        IlkHarfSveEIseYazdır(iller);

    }
        //Arrays.asList ile elemanları add yerine bu method la da ekleyebiliriz

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
     public static void printElements(List<String>iller){//printElements bu isimle main icinden cagırırız
         for (String w :iller) {
             System.out.print(w +" ");
         }
     }
    //2.Yol:LAMBDA
    public static void printEl(List<String>iller){//stream() methodu dataları tek tek selale gibi akısa alır
        iller.
                stream().
                forEach(t-> System.out.print(t+" "));
    }



    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void EHaricElYazdir(List<String>iller){
        iller.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));//Van Ordu Van İzmir Safranbolu İzmir Mus

    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void characterSayısıDortenAzOlanElYazdir(List<String>iller) {
        iller.
                stream().
                filter(t -> t.length()<4).
                forEach(t -> System.out.print(t + " "));

    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void characterSayısıDortencokOlanBuyukHarfElYazdir(List<String>iller) {
        iller.
                stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).//map degisiklik yapmak icin kullanıyoruz
                forEach((t -> System.out.print(t + " ")));
    }


    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void characterSayısıDortencokOlanTekrarsızKucukHarfElYazdir(List<String>iller) { iller.
            stream().
            distinct().//tekrarlı elemanları eler.
            filter(t->t.length()>4).
            map(t->t.toLowerCase()).
            forEach((t -> System.out.print(t + " ")));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void tkrszBuyukHrfAlfabetikSiraYazdir(List<String >iller) {
        iller.
                stream().
                distinct().//tekrarsiz
                map(t->t.toUpperCase()).//yapisi gegisir buyuk harfe cevirdi
                sorted().//siralama yapar
                forEach(t-> System.out.print(t+" "));

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
   public static void tekrarsızlarıuzunluklarınagoreSırala(List<String>iller){
       iller.
               stream().
               distinct().//tekrarlı elemanları eler
               filter(t -> t.length() > 4).
               map(t -> t.toLowerCase()).//map yapıyı degistirip buyuk harfe donusturdum
               sorted(Comparator.comparing(t->t.length())).//sıralama yapar
               forEach((t -> System.out.print(t + " ")));
   }




    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    public static void TumElIlkHrfBuyukYazdır(List<String>iller){
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach((t -> System.out.print(t + " ")));
    }


    //Example 9= ilk harfi "S" veya "E" olanları bir liste icerisindec yazdıran methodu olusturunuz
    public static void IlkHarfSveEIseYazdır(List<String>iller){
        iller.
                stream().
                filter(t->t.startsWith("S")||t.startsWith("E")).
                collect(Collectors.toList()).//dataları liste icinde toparlayarak yazdırır
                forEach((t -> System.out.print(t + " ")));

    }



}
