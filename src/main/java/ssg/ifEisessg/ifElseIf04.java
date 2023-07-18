package ssg.ifEisessg;

import java.util.Scanner;

public class ifElseIf04 {

    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin,
        //sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        //sayilarin ikisi farkli isaretlere sahipse
        //“farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        if (sayi1>0&&sayi2>0){
            System.out.println("girdiginiz iki sayida pozitif oldugu icin toplamalari : "+(sayi1+sayi2));
        } else if (sayi1<0&&sayi2<0) {
            System.out.println("girdiginiz iki sayi negatif oldugu icin carpimlari : "+sayi1*sayi2);
        } else if (sayi1*sayi2<0) {
            System.out.println("farkli isaretlere sahip oldugu icin islem yapamazsiniz");
        }else System.out.println("sifir carpmaya gore yutan elemandir");







    }










}
