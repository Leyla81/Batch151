package ssg.switchssg;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {

// ayı girdiginde mevsimi veren kod

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacıncı ay oldugunu giriniz" );
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkBahar");
                break;
            case 6:
            case  7:
            case  8:
                System.out.println("yaz" );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("invalid month number");

        }
      //  2.yol
        if (ayNo<1 ||ayNo>12){
            System.out.println("invalid month number");
        } else if (ayNo>8 && ayNo<12) {
            System.out.println("Sonbahar");

        } else if (ayNo<9 && ayNo>5) {
            System.out.println("Sonbahar");

        } else if (ayNo<6 && ayNo>2) {
            System.out.println("Sonbahar");

        } else if (ayNo<3 && ayNo>1) {
            System.out.println("Sonbahar");

        }


    }

}
