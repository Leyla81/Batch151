package day_05practice;

import java.util.Scanner;

public class C01_switch {

    public static void main(String[] args) {

         /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen  yıl numarası giriniz");
        int year = scan.nextInt();
        System.out.println("lutfen  ay numarası giriniz");
        int month = scan.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int gun =31;
                System.out.println("Girdiginix Ay  "+ gun+  "gun ceker");
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                gun=30;
                System.out.println("Girdiginix Ay  "+ gun+ "gun ceker");
                break;

            case 2:// 4 yılda bir 29 ceker dedigi icin
                if(year%4 == 0){
                    gun = 29;
                    System.out.println("Girdigınız Ay "+gun+ "gun ceker");
                }else{
                    gun= 28;
                    System.out.println("Girdigınız Ay "+gun+  "gun ceker");
                }
                break;
            default:
                System.out.println("Gecerli bir Ay numarası giriniz2");







        }




    }




}
