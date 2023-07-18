package day11nestedTernarySwitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //kullanıcıdan alınan iki sayidan kucuk olanını ekrana yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println(" please enter two integers ...");
// 1 WAY:use if else
        int first=input.nextInt();
        int second=input.nextInt();
        if (first<second){
            System.out.println("first");
        }else{
            System.out.println("second");
        }

      //2 Way:use ternary
      int result=  first<second ? first:second;
        System.out.println("result = " + result);


















    }
}
