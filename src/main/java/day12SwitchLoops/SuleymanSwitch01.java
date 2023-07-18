package day12SwitchLoops;

import java.util.Scanner;

public class SuleymanSwitch01 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a letter...");
        char letter =input.next().charAt(0);
        //1. WAY
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

                //2. WAY
                System.out.println("please enter a letter");
                String letter2 = input.next().substring(0, 1).toLowerCase();
                switch (letter2) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        System.out.println("It is a vowel");
                        break;
                    default:
                        System.out.println("It is not a vowel");

                }


                //3. Way
                System.out.println("please enter a letter");
                String letter3 = input.next().substring(0, 1);
                switch (letter3) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                        System.out.println(letter3+="is a vowel");
                        break;
                    default:
                        System.out.println(letter3+="is not a vowel");

                }
        }











    }
}
