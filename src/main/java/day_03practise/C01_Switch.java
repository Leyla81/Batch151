package day_03practise;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("0-4 arası puanınızı giriniz");
        double puan = scan.nextDouble();

        String seviye ="";

        if(puan >=0 && puan >1){
            seviye ="Kaldı";
        } else if (puan >= 1 && puan <2) {
            seviye= "Gecti";
        } else if ((puan >= 2 && puan <2.5)) {
            seviye = "İyi";

        } else if ((puan >= 2.5 && puan <3.5)) {
            seviye = "Ust";

        } else if ((puan >= 3.5 && puan <=4)) {
            seviye = "Harika";

        }

       switch (seviye){
           case "Kaldi":
               System.out.println("F");
               break;

           case "Gecti":
               System.out.println("D");
               break;
           case "İyi":
               System.out.println("C");
               break;
           case "ust":
               System.out.println("B");
               break;
           case "Harika":
                   System.out.println("A");
                   break;
           default:
               System.out.println("sınav puanını dogru giriniz");

        }











    }
}
