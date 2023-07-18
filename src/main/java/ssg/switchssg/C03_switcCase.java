package ssg.switchssg;

import java.util.Scanner;

public class C03_switcCase {
    public static void main(String[] args) {

      //  kullanıcıdan  yapmak istedigini islemi alıp toplama cıkarma bolme carpma islemi
        //  yapan basıt bir hesap makinesi giriniz(/,*,-,+)
        Scanner scan = new Scanner(System.in);
        System.out.println("1. syıyı gırınız");
        int sayi = scan.nextInt();
        System.out.println("2.sayıyı giriniz..");
        int sayi1 = scan.nextInt();

        System.out.println("lutfen yamak istediginiz islemi seciniz..");
        char operator = scan.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("sayıların toplamı ="+ (sayi+sayi1));
                break;
            case '-':
                System.out.println("sayıların farkı ="+ (sayi-sayi1));
                break;
            case '/':
                System.out.println("sayıların bolumu ="+ (sayi/sayi1));
                break;
            case '*':
                System.out.println("sayıların carpımı ="+ (sayi*sayi1));
                break;
            default:
                System.out.println("gecerli islem giriniz..");

        }







    }
}
