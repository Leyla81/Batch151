package ssg.forLoopssg;

import java.util.Scanner;

public class C06_forLoop {
    public static void main(String[] args) {
        // kullanıcıda 100 den kucuk bir tamsayı girmeini isteyin
        // 1 den baslayarak girilen sayiya kadar 3 un veya 5 in katı olan sayıları yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir tamsayı giriniz");
        int sayi = input.nextInt();

        if (sayi < 100 && sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
                }
            }else System.out.println("lutfen 100 den kucuk 0 dan buyuk sayi giriniz");
        }
    }
