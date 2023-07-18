package day16ArraysForEachLoop;

import java.util.Arrays;

public class Arrays04 {


    public static void main(String[] args) {


     // Size verilen bir cumlede kac kelime oldugunu gosteren kodu yazınız


     String s="Java is easy. Learn Java earn money";
     String words[]=s.split(" ");//koseli parantez array yapar

        System.out.println(Arrays.toString(words));//Java , is , easy., Learn,  Java,  earn,  money yazdırır.

        System.out.println(words.length);//kac kelime içerdiğini gosterir.

// sıze verilen bir cumlede kac harf oldugunu gostern kodu yazınız.

        String s1="Java is easy.Learn Java earn money";
        String letters[]=s1.replaceAll("[^a-zA-Z]","").split("");
        //ustte replaceAll() metodu ile bosluktan ve noktalardan kurtulduk.split methoduyla hiclikten kesip asagıda yazdıdık.


        System.out.println(Arrays.toString(letters));

        System.out.println(letters.length);














    }
}
