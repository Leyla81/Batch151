package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp dort islem yapan ve islemlerin sonuclarını ekrana yazdıran kodu yazınız


        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen iki sayı giriniz....");
               double firstNumber = input.nextDouble();
               double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
    }
