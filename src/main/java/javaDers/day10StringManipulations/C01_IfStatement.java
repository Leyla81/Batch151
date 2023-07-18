package javaDers.day10StringManipulations;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        //ıf it rains I will cancel the picnic
        // Example:verilen karakter buyuk harf ise ekrana buyuk harf yazdıran kodu yazınız.
        // if statement da parentez içine sart yazılır curly braces icine yazdırılır
        char ch='A';
        if (ch>='A'&&ch<='Z');{
            System.out.println("buyuk harf");// ekranda buyuk harf yazdırır.
        }

// Example: verilen sayi cift sayi ise ekrana cift sayı yazdıran kodu yazınız

        byte sayi=24;// ikiye bolunebilen hersayi cift sayidir
        if (sayi %2==0){
            System.out.println("Cift sayi");
        }

     //Example:verilen bir say 300 den kucuk veya 1200 de buyuk ise "harika sayi " yazdıran kodu yazınız.

     int sayi1 =250;
        if (sayi1 <300 ||sayi1<100);{
            System.out.println("Harika sayi");
        }

     // Example: kullanıcıda alına datanın tek mi cift mş oldugunu yazdıran kodu yazınız.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz....");
        int number= input.nextInt();
       //******* 1. way*******
        if (number%2==0){
            System.out.println("cift sayı");
        }
        if (number%2!=0){
            System.out.println("tek sayi");
        }
        //2.Way
        if (number%2==0){
            System.out.println("cift sayı");
        } else{
            System.out.println("tek sayi");

        }

 // verilen bir sayının negatif mi pzitif mi yoksa notr mü oldugunu soyleyen kodu yazınız

        int num1 =-857;
        if(num1<0){
            System.out.println("negatif");
        }else if (num1 == 0){
            System.out.println("notr");
        }else {
            System.out.println("pozitif");
        }


    }//main

}//Class
