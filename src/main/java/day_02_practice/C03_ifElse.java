package day_02_practice;

import java.util.Scanner;

public class C03_ifElse {


    public static void main(String[] args) {

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz...");
        String word =scan.next();

        if( word.length()<=3){//ilk once kelime uzunlugunu almalıyızsonra kucuk esit yapmalıyız

            System.out.println("3 kararkterden daha uzun bir kelime girmelisiniz");
        }else{
            String sonUcHarf=word.substring(word.length()-3);//substring() methodu parantezin icinde belirtilen karakterden sonuna kadar verir

            System.out.println(""+sonUcHarf+word+sonUcHarf);
        }



    }
}
