package day_02_practice;

import introduction.day03scanner.Scanner01;

import java.util.Scanner;

public class C01_Scanner {


    public static void main(String[] args) {


// Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız


        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi, ikinci adinizi ve soyadinizi arasinda bosluk olacak sekilde giriniz");
        String str = scan.nextLine().toUpperCase().trim();//adın butun harflerini buyuk yapmalıyım cunku kullanıcı kucuk harf yapmıs olabilir

        char adIlkKrktr = str.charAt(0);

        char ikinciAdIlkKrktr = str.charAt(str.indexOf(" ")+1);//index of () methodu belirtilen boslugun indexini verir

        char soyadIlkKrktr = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println(" " + adIlkKrktr+ikinciAdIlkKrktr+soyadIlkKrktr);


    }
}
