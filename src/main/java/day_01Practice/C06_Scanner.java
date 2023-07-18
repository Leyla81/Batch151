package day_01Practice;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

// Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.




        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adınızı ve soyadinizi giriniz...");
        String nameAndSurname=input.nextLine().toUpperCase();

    char firstCharOfName=nameAndSurname.charAt(0);
    char firstCharofSurname=nameAndSurname.charAt(nameAndSurname.indexOf(" ")+1);


        System.out.println(" "+firstCharOfName+firstCharofSurname);



    }



}
