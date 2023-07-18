package day_01Practice;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {

          /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen hizmet yılınızı giriniz...");
        int year= input.nextInt();
        System.out.println("Lutfen maasınızı giriniz...");
        int salary= input.nextInt();

        if(year>=5){
            System.out.println("zamlı maas="+(salary+(salary*10/100)));
        }else{
            System.out.println("Zam alabilmek icin="+(5-year));
        }












    }
}
