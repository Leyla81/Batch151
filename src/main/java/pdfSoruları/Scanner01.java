package pdfSoruları;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        //1)kullanıcıdan 2 tam sayi alıp bu sayıların toplam fark ve carpımlarını yazınız
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen 2 tamsayı giriniz...");
        int number =input.nextInt();
        int number1 = input.nextInt();
        System.out.println(number*number1);
        System.out.println(number+number1);
        System.out.println(number-number1);

        //2)kullanıcıdan karenin bir kenar uzunlu alın ve karenin cevtresini ve alanını hesaplayan kodu yazıp konsole yazdırın
        System.out.println("lutfen karenin kenar uzunlugunu giriniz");
        int a =input.nextInt();
        System.out.println("alan" + a*a);
        System.out.println("cevre" + 4*a);

        //3)kullanıcıdan yarı cap isteyip cemberin cevresını ve dairenin alanını hesaplayıp yazdırın
        System.out.println("lutfen cemberin yarı capını giriniz...");
        int b = input.nextInt();
        System.out.println("cevre daire ="+ 2*3.14*b);
        System.out.println(b*b*3.14);
        //4)kullanıcıdan dikdortgenler prizmasının uzun , kısa kenarlarını ve yuksekligini girmesini
        //prizmanın hacmini hesaplayıp yazdırın




    }

}
