package javaDers.day10StringManipulations;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

     //kullanıcı gun ismini girsin kod gunu yazsın.
     //1. pazar 2.pazartsi  3.sali     4.carsamba    5 .persembe    6. cuma   7.c.tsi
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen gun numarasını giriniz\n1. pazar 2.pazartsi  " +
                "3.sali     4.carsamba    5 .persembe    6. cuma   7.cumartesi");
        byte numOfday = input.nextByte();
        if(numOfday==1){
            System.out.println("pazar");
        }else if(numOfday==2){
            System.out.println("pazartesi");
        }else if(numOfday==3){
            System.out.println("sali");
        }else if (numOfday==4){
            System.out.println("carsamba");
        }else if(numOfday==5){
            System.out.println("persembe");
        }else if(numOfday==6){
            System.out.println("cuma");
        }else if(numOfday==7){
            System.out.println("cumartesi");
        }else {
            System.out.println("lutfen gecerli bir rakam giriniz." +
                    "\"1 ==> Pazar " +
                    "2 ==>Pazartesi   +\n" +
                    "3 ==>Sali  4==>Carsamba\n +\n" +
                    "5==> Persembe  6 ==>Cuma  +\n" +
                    "7\" ==>Cumartesi");
        }










    }




}
