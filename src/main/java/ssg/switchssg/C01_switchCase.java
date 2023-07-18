package ssg.switchssg;

import java.util.Scanner;

public class C01_switchCase {

    public static void main(String[] args) {

     //kullanıcıda sayı olarak kacıncı ay oldugunu alıp istenen ayın ismini yazdıran bir program yazın
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacıncı ay oldugunu giriniz.");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:
                    System.out.println("ınvalid month number...");

        }






    }

}
