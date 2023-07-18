package ssg.forLoopssg;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir tamsayı giriniz");
        int sayi=input.nextInt();

        if (sayi<=100){
        for (int i = 1; i <=sayi ; i++) {
            if (i % 3 == 0) {
                System.out.print(i +" ");
            }
        }
        }else{
            System.out.println("100de kucuk sayı giriniz");
        }
    }
}
