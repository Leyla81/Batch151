package ssg.ifEisessg;

import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args) {

            // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
            // yas:18 ve uzeri olmali
            // kilo : 50 dan ust olmali
            Scanner input=new Scanner(System.in);

            System.out.println("kan vermek icin annenden izin aldin mi(true ve false giriniz)");
            boolean izinVerdiMi=input.nextBoolean();
            if (izinVerdiMi) {
                System.out.println("lutfen yasinizi giriniz");
                int yas=input.nextInt();
                if (yas >= 18) {
                    System.out.println("lutfen kilonuzu giriniz");
                    double kilo = input.nextDouble();
                    if (kilo > 50) {
                        System.out.println("kan bagisinda bulunabilirsiniz");
                    } else System.out.println("kilo al gel");
                } else System.out.println("buyude gel");
            }else System.out.println("lutfen izniniz olmadigi icin izin alip gelin");
    }
}
