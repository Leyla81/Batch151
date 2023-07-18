package day_05practice;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {



         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */
        Scanner scan = new Scanner(System.in);


        int toplam = 0;// 5 ile 10 arasındaki sayıların olmadan toplayacagımız bos konteynır

        for (int i = 0; i <5 ; i++) {     // 5 defa sorması icin kullanıcıdan 5adet sayı girmesini istedik
            System.out.println("lutfen 1 sayı giriniz");
            int number = scan.nextInt();

            if (number>0 && number<=10){ //5 ile 10 arasında olan sayıları almadık
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında oldugundan isleme alınmayacaktır");
            }else{ // degilse sayıları topladık
              toplam  =  toplam+number;
            }
        }
        System.out.println(toplam);








    }
}
