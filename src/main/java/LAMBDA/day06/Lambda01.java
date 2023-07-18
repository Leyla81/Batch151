package LAMBDA.day06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.
        System.out.println("Ex 1) ");

        Files.
                lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                forEach(System.out::println);


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.
        System.out.println("Ex 2) ");

        Files.
                lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                map(String :: toUpperCase).
                forEach(System.out::println);


        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
        System.out.println("Ex 3) ");


        boolean doesContain =    Files.

                lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                anyMatch(line->line.contains("Java"));


        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.

        System.out.println("Ex 4)") ;

       List<String>uniqueWords = Files .lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                flatMap(t-> Arrays.stream(t.split(" "))).
                map(t->t.replaceAll("\\p{Punct}","")).
                distinct().
                collect(Collectors.toList());
        System.out.println(uniqueWords);

        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
        System.out.println("Ex 5) ");

       Long harfSayisi = Files.
                lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                flatMap(t->Arrays.stream(t.split(""))).
                count();
        System.out.println(harfSayisi);


        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");
        List<String> alfabeticlyReversed = Files.
                lines(Paths.get("src/main/java/LAMBDA/day06/Txt")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                flatMap(t->Arrays.stream(t.split(""))).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println("alfabeticlyReversed = " + alfabeticlyReversed);


    }
}

