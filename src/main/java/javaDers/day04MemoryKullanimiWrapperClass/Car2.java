package javaDers.day04MemoryKullanimiWrapperClass;

import java.util.Scanner;

public class Car2 {

    public String model ="v60";
    public String color ="white";
    public int cost = 1500000;

    public static void main(String[] args) {

/*class== variable pasif ozellikler
       == methodlar aktif ozellikler
*/
        Scanner input = new Scanner(System.in);
        Car2 volvo = new Car2();
        dur();
        hareket();
        yakit();
        System.out.println(volvo.color);
        System.out.println(volvo.cost);
        System.out.println(volvo.model);


    }//main

    private static void yakit( ) {
        System.out.println("Volvo az yakit tuketir");
    }

    static void dur() {
        System.out.println("Volvo guvenle durur");
    }

    private static void hareket() {
        System.out.println("volvo hızlı gider");

    }

}//class
