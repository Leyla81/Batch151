package day_02_practice;

import java.util.Scanner;

public class C06_Ternary {


    public static void main(String[] args) {

/*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci tam sayıyı giriniz");
        int number=scan.nextInt();

        System.out.println("lutfen ikinci tam sayıyı giriniz");
        int number1=scan.nextInt();

        System.out.println(number==number1 ?("sayılar birbirine esittir"):(number>number1 ?("buyuk sayı="+number):("buyuk sayı="+number1)));







    }
}
