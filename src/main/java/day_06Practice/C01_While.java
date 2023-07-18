package day_06Practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

// Kullanıcıdan sisteme bir rakam girmesini isteyiniz
// kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int rakam = scan.nextInt();

        int num = 1;// 1 den baslayarak carpma yapılacagı icin
        int faktoriyel =1;

        while(num <=rakam){
           faktoriyel = faktoriyel*num;
           num++;
        }
        System.out.println(rakam + "!=" + faktoriyel);









    }
}
