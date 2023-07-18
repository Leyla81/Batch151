package ssg.List01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_List {
    public static void main(String[] args) {
        /*
        icinde 200 tanw 100 den kucuk pozıtıf tamsayi olan bir list olusturun
        kullanıcıdan bir sayı isteyip listede var olup olmadıgını kullanıcıya yazın

         */

        Random randomSayilar = new Random();//rastgele sayi olusturan class
        int sayi =0;
        List<Integer>sayiListesi = new ArrayList<>();
        while(sayiListesi.size()<200){
            sayi =randomSayilar.nextInt(1000);
            if(!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }

        Scanner scan = new Scanner(System.in);

        int kalanTahmin =5;
        int tahminSayisi=0;
        do {
            System.out.println("lutfen sayi giriniz");
            sayi= scan.nextInt();
            tahminSayisi++;
            if(sayiListesi.contains(sayi)){
                System.out.println("tbrikler "+ tahminSayisi+" .tahminde dogru sayısına ulastınız");
            break;
            }
           kalanTahmin--;
            System.out.println("kalan tahmin sayiniz "+kalanTahmin);
        }while(kalanTahmin>0);

        if(tahminSayisi==0){
            System.out.println("maalesf bulamadınız");
        }





    }
}
