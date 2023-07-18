package day_02_practice;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

/*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch=scan.next().charAt(0);// next string de kullanırız charat() metodu ile duzeltıyoruz

//bir karakterin harf olup ılmadıgını karakteri "a" ile "z" arasında olup olmadıgına bakarız
        System.out.println((ch>='a'&&ch<'z') || (ch>='A'&& ch>='Z') ?(ch>='A'&& ch<'Z'?"Buyuk harf":"Kucuk harf"):("Harf degil"));

    }
}
