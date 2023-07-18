package LAMBDA.day04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistictUpperInLisyyt(names));
        System.out.println(sortWithLenghtReversesameLenghtLowerInLisyyt(names));
        System.out.println(islenghtMereThan2(names));
        System.out.println(noneLenghtlessThanThree(names));


    }

        //Example 1 = List elemenalrını son harflerine gore natural order a tekrarsız olarak buyuk harfle bir list'in icine return ediniz

        public static  List<String>sortWithLastCharDistictUpperInLisyyt(List<String>names) {
          return   names.
                    stream().
                    distinct().
                    map(String::toUpperCase).
                    sorted(Comparator.comparing(t -> t.length() - 1)).
                    collect(Collectors.toList());//[TOM, JİM, ALEX, MARY, MİCHAEL, ALEXANDER]

    }
//Example 2 = List elemenalrınıkarakter sayılarına gore ters sırada  kucuk harfle bir list'in icine return ediniz
    //Aynı character sayısına sahip elemanlar kendi icinde alfabetik

    public static List<String>sortWithLenghtReversesameLenghtLowerInLisyyt(List<String>names) {
        return  names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(t->t.charAt(0))).
                collect(Collectors.toList());//[alex, alexander, alex, jim, michael, mary, tom]
    }


//Example 3 = List elemenalrını karakter sayısının 2 den buyuk olup olmaddıgınıkontrol eden methodu yazınız.
    public static boolean islenghtMereThan2(List<String>names){
        return  names.
                stream().
                allMatch(t->t.length()>2);//parantezin icindeki kuralla eslesirse true yada false verir.
    }

//Example 4= List elemenalrının hicbirinin karakter sayısı  3 den kucuk olup olmaddıgını kontrol eden methodu yazınız.
    public static boolean noneLenghtlessThanThree(List<String>names){
        return    names.
                stream().
                noneMatch(t->t.length()<3);

    }

//Example 4= List elemenalrının hicbirinin en az birinin karakter sayısı  4 den kucuk olup olmaddıgını kontrol eden methodu yazınız.

public static boolean atLeastLessThan4 (List<String>names){
        return   names.
                stream().
                anyMatch(t->t.length()<4);
}




    }

