package ssg.ifEisessg;

import java.util.Locale;
import java.util.Scanner;

public class ifElse02 {
    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
        boolean kontrol=karakter>='a'&&karakter<='z'||karakter>='A'&&karakter<='Z';
        if (kontrol){
            System.out.println("girdiginiz karakter bir harf");
        }else System.out.println("giridiginiz karakter bir harf degil");


    }
}












