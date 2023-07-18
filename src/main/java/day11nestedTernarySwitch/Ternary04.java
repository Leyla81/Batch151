package day11nestedTernarySwitch;

import java.util.Scanner;

public class Ternary04 {

    public static void main(String[] args) {
       // kullanıcıdan aldıgınız sayı cift ise yarısını ekrana yazdırınız
        // tek sayı ise "bu sayi ikiye bölunmez" yazdiriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an Integer...");
        int num = input.nextInt();

        Object result=num%2==0? num/2 :"bu sayı ikiye bolunmez";
        System.out.println(result);
// note : ternary de true ve false durumlari icin size verilen data typeları
// farklı ise olusturdugunuz container in data type ini "Object" yapın
        // note 2: "object" java'da bir class'dır
        //"object" Javadaki butun classlar'ın "Parent"ıdır. yanı babasidir, hz. Adem gibi
        //"object class"ın Parent'ı yoktur
        //Javada Parent'i olmayan tek class object classdır










    }
}
