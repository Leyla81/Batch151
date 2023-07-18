package qestionBank;

import java.util.Scanner;

public class WrapperPractice {

    public static void main(String[] args) {

//kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini kontrol edin

        /*Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        String str=input.next().toUpperCase();
        int strInt =str.charAt(0);
        if(strInt>=65 && strInt<=90){
            System.out.println("girilen karakter bir harftir");
        }else System.out.println("girilen karakter bir harf degildir");*/

        /*Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
                */

       /*Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch=scan.next().charAt(0);// next string de kullanırız charat() metodu ile duzeltıyoruz*/

//bir karakterin harf olup ılmadıgını karakteri "a" ile "z" arasında olup olmadıgına bakarız
       // System.out.println((ch>='a'&&ch<'z') ||  ?(ch>='A'&& ch<'Z'?"Buyuk harf":"Kucuk harf"):("Harf degil"));


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir sayı giriniz");
        int num = scan.nextInt();
        /*
        Kullanıcıdan 4 basamaklı bir sayı girmesini isteyin. Girdiği sayı;
        5'e bölünüyorsa son rakamını kontrol edin==>
                        Son rakam 0 ise, ekrana "5'e bölünebilen çift sayı"
                        Son rakamı 0 değil ise "5'e bölünebilen tek sayı"
       Girdiği sayı 5'e bölünmüyorsa ekrana "Tekrar Deneyin" yazdırın.
    */

      if(num%5==0){
          System.out.println("cift sayi");
      } else if(num%5==1){
          System.out.println("tek sayi");

        }else{
          System.out.println("tekrar deneyin");
      }





    }
}













