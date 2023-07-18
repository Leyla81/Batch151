package suleymanJava.day4StringManipulations;

import java.util.Scanner;

public class Ses1_StringManipulation {

    public static void main(String[] args) {

       // Ex:  get the full name of the user and make alL THE CHARACTERS in upper case
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name and last name");
        String fullName = input.nextLine().toUpperCase();// butun harfleri buyuk yapar
        System.out.println(fullName);

        //Ex=  get the full name of the user, make alL THE CHARACTERS in upper case and
        // remove the spaces from the beginning to the end
        System.out.println("Enter your first name and last name");
        String name = input.nextLine().toUpperCase().trim();//bastaki ve sondaki boslukları giderir
        System.out.println(name);


        // get a strıng from user ,count the number of characters in the string
        System.out.println("Enter a String...");
        String s= input.nextLine();

       int numOfChars= s.length();// karakter sayisini verir
        System.out.println(numOfChars);


    }



}
