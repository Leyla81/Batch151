package day11nestedTernarySwitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        //Ex:Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin,
        // degilse ekrana "Pozitif degil" yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer...");

        int number1= input.nextInt();

        String result =number1>0 ?"positive":"not positive";

        System.out.println(result);










    }










}
