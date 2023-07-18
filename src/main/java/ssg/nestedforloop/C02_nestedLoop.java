package ssg.nestedforloop;

import java.util.Scanner;

public class C02_nestedLoop {
    public static void main(String[] args) {
        /*
        1 den girilen sayıya kadar her satırda bir artırarak asagıdaki sekli olusturan java kodunu yazınız

        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
         */

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= i; j++) {    //bu kısımda "i" ye kadar gidecek
                System.out.print(j);//icinde yazdırmalıyımki herseferinde yazdırsın
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        //2.Yol
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ilerlemesini istediginiz sayyıyı giriniz");
      int result =  scan.nextInt();
        for (int i = 1; i <=result ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }









    }
}
