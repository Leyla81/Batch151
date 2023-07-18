package ssg.ifEisessg;

import java.util.Scanner;

public class ifElse01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sabah derslerine kayılabiliyorsanız true katılamıyorsanız false giriniz");
        boolean dt =input.nextBoolean();
        System.out.println("Aksam derslerine kayılabiliyorsanız tru katılamıyorsanız false giriniz");
        boolean nt =input.nextBoolean();

        if(dt && nt){
            System.out.println(" ikisine  de katılabilirim" );
        }else if(nt){
            System.out.println("aksam derslerine katılabilirim");

        }else if(dt){
            System.out.println("gunduz derslerine katılabilirim");
        }else{
            System.out.println("ikisine de derslere katılamam");
        }










    }









}
