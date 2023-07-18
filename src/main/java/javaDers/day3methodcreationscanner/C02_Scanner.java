package javaDers.day3methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {


    public static void main(String[] args) {

        //kullanıcıdan data almak iicin Scanner classından scan/input/ scanner yardım alırız.
        //bu sekide kullanıcıyı yonlendirerek gerekli dataları elde edriz.

        // 1. adım obje olusturma
        Scanner input = new Scanner(System.in);

        //2. adım kullanıcıya ne yapacagını soyleyin
        System.out.println("Lutfen cinsiyetinizi K/E seklinde giiriniz");

        //3. adım kullanıcıdan alınına data yapısınabuyuklugune uygun bir varable nin icine koyuyoruz.
        char cinsiyet= input.next().charAt(0);

        // 4.adım ekranda görebilmesi icin ve kullanıcıdan verdiği bilgileri teyit etmesi için yazdırınız
        System.out.println("cinsiyet = " + cinsiyet);

       // kullanıcıya cinsiyetini adını memleketini yasını boyunu ulkesini sevip secmedigini maasini soran bir program yazın


       Scanner input2 =new Scanner(System.in);

        System.out.println("lutfen cinsiyetinizi kadın iseniz K erkek ise E harfi giriniz");
        char gender = input2.next().charAt(0);

        System.out.println("Lutfen isminizi giriniz");
        String isim = input2.next();

        System.out.println("Lutfen nerli oldugunuzu giriniz");
         String memleket= input2.next();

        System.out.println("lutfen yasinizi giriniz");
        byte yas =input2.nextByte();

        System.out.println("lutfen boyunuzu giriniz");
        short boy = input2.nextShort();

        System.out.println("Lutfen ulkenizi sevip sevmediğinizi giriniz");
         boolean seviyorMu=input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas=input2.nextLong();

        System.out.println("*********Gonul Hanım********");
        System.out.println("gender :"+gender+"\nisim : "+isim+"\nmemleket : "+memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu+"\nmaas : "+maas);





    }




}
