package LAMBDA.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {



    public static void main(String[] args) {
        List<String > iller = new ArrayList<>(Arrays.asList("Van","Gumushane","MUS","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));
artnSıradaUzunluklarınaGoretekrarsızYazdır(iller);
        System.out.println();
        buykHrfGoreAtnSıraTkrrsızYazdır(iller);
        System.out.println();
        TumElAtnSıraTkrrsızYazdırUzunlukAynıAlfbtkYazdır(iller);


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
   public static void artnSıradaUzunluklarınaGoretekrarsızYazdır(List<String>iller){
        iller.stream().distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
   }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void buykHrfGoreAtnSıraTkrrsızYazdır(List<String>iller){
        iller.stream().distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));

    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void TumElAtnSıraTkrrsızYazdırUzunlukAynıAlfbtkYazdır(List<String>iller) {
        iller.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(t -> System.out.print(t + " "));
/*
 "map(t->t.toUpperCase()").Lmbda bu yapıyı sevmez bunun yerine  "String::toUpperCase)"
 "sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))" bunu da sevmez yerine
 (String::length).thenComparing(Comparator.naturalOrder() kullanır.
 */
    }
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz



    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.





}
