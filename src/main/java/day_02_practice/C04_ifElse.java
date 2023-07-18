package day_02_practice;

import java.util.Scanner;

public class C04_ifElse {

    public static void main(String[] args) {


 /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci kelimeyi giriniz");
        String word1=scan.next();

        System.out.println("lutfen ikinci kelimeyi giriniz");
        String word2=scan.next();

        if(word1.length()%2==0){

            String halfOfWord1=word1.substring(0,word1.length()/2);//kelimenin ortasını bulmak icin substring methodunu kullandık baslayacagı be bitecegi noktayı belirtiyoruz

            String secondhalfOfWord1 =word1.substring(word1.length()/2);//burda da 2.yarısını bulduk.Substring kullandık cunku parantez icind verilen cumlenın sonuna kadar gider.
            System.out.println(""+halfOfWord1+word2+secondhalfOfWord1);

        } else {
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }




















    }
}
