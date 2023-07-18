package day12SwitchLoops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

       //Example 1: kullanıcıdan iki sayi ve yapılacak işlemi yapan toplama(+) cıkarma(-)
        // carpma(*) bolme(/) yuzde% islemlerini yapan kodu yazınız


        Scanner input =new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz..." );
        double a=input.nextDouble();// iki sayi dedigimiz icin ik conteyner aldik
        double b= input.nextByte();

        System.out.println("Yapilacal islemi giriniz.+,-,*,/,%");
        char opr =input.next().charAt(0);

        switch(opr){
            case'+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case'-':
                System.out.println(a+"+"+b+"="+(a-b));
                break;
            case'*':
                System.out.println(a+"+"+b+"="+(a*b));
                 break;
            case '/':
                System.out.println(a+"+"+b+"="+(a/b));
                break;
            case '%':
                System.out.println(a+"+"+b+"="+(a*b/100));
                break;
            default :
                System.out.println("boyle bir islem tanımlanmamıstır");





        }




    }
}
