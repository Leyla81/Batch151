package day16arraysforeachloopMehmetHoca;

import java.util.Arrays;

public class Arrays04 {


    public static void main(String[] args) {
        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.


        String s="Java is easy. Learn java earn money";
        //once split()methodu ile kelimeleri ayyırmalıyız.
       String words[]= s.split(" ");//s spetini bosluktan bol demek.
        System.out.println(Arrays.toString(words));//Arrays oldugu icin Array de yazdırmamız gerekır[Java, is, easy. ,Learn, java, eran, money]
        System.out.println(words.length);//kac kelime oldugunu yazdırır

     //Example 2= sıze verilen cumlede kac hrf oldugunu gosteren kodu yazınız
        String s1 ="Java is easy. Learn java earn money";
        String letter[]= s1.replaceAll("[^a-zA-Z]","").split("");
            //replaceAll() medodu "JavaiseasyLearnjavaearnmoney"bu hale getirir.split()methodu ile hicliklerden boler

        System.out.println(Arrays.toString(letter));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, j, a, v, a, e, a, r, n, m, o, n, e, y] verir
        System.out.println(letter.length);//28

















    }
}
