package day12SwitchLoops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Example:Ay numarasını soyleyince numarası verilen aydan
        // baslayıp 12. aya kadar tum aylarin isimlerini yazdıran kodu yazınız.
        //8--->august   september october november december

        Scanner input=new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz...");
        int numOfmonth=input.nextInt();

        switch (numOfmonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3 :
                System.out.println("March");
            case 4 :
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            break;
            default:
                System.out.println("Gecerli ay numarası giriniz...");

        }

        //Note:"switch"condition parantezi icinde 1)String  2) int  3) byte   4)short 5)char  kullanılır
        //Note:""switch"condition parantezi icinde 1)boolean   2)long     3)double    4)float






    }













}
