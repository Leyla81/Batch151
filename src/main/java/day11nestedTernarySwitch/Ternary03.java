package day11nestedTernarySwitch;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {


        //Ex: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        //   1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        //   2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year.....");
        int year = input.nextInt();
        
        //1. WAAY: Nested ternary
        String yearResult=year%100==0?(year%400==0?"leap":"not Leap"):(year%4==0?"Leap":"Not Leap");
        System.out.println("yearResult = " + yearResult);

        //2. WAY:nested if
        if(year%100==0){
            if (year%400==0){
                System.out.println("Leap");
            }else{
                System.out.println("Not leap");
            }
        }




    }


}
