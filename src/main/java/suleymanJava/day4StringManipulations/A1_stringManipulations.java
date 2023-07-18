package suleymanJava.day4StringManipulations;

import java.util.Scanner;

public class A1_stringManipulations {

    public static void main(String[] args) {
        // ex1: get the initials of a name which contains firstname and last name
        // Tom Hanks==> TH
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name and last name...");
        String fullname =input.nextLine();

        char first=fullname.charAt(0);
       char last =fullname.split(" ")[1].charAt(0);
        System.out.println(first+  " " + last);

                 //interview Questions
        // ex 2: type to swap the integer a=12 and b=5 after code a=5 b=12
         //temporary bir variable olusur.1. WAY
        int a= 12;
        int b =5;
        System.out.println(a+" "+ b);

        int temp=0;

        //1. step
        temp=a;//temp =12 a=0
        //2. step
        a=b; // a=5 b=0
        //3.step
        b=temp;// b=12 temp=0
        System.out.println(a+" " +b);
        //2 Way
        int x=12;
        int y= 5;
        System.out.println(x+" "+y);
        x=x+y;
        y= x-y;
        x=x-y;
        System.out.println(x+" " + y);






    }




}
