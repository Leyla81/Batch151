package ssg.passByValueOverLoading;

import java.util.Scanner;

public class C01_passByValue {
    public static void main(String[] args) {
         /*
        kullanicidan bir int deger alalim ve
        bu degeri 3 katina cikaran bir method olusturalim
        olusturdugumuz degeri method icinde
        ve main method icinde ayri ayri yazdiralim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("methoddan once sayi : "+sayi);//4
        carpim(sayi);//12
        System.out.println("methoddan sonra sayi : "+sayi);//4
//sadece method icinde degisir
    }

    private static void carpim(int sayilar) {
        sayilar=sayilar*3;
        System.out.println("methodun icinde sayi : "+sayilar);//12

    }
}

