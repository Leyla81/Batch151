package day_02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

/*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayı giriniz");
        int number=scan.nextInt();


        System.out.println(number%2==0 ? ("ciftsayi"):(number+3));


















    }
}
