package day_05practice;

import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {



        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int number = scan.nextInt();

        while (number%10!=0){ // 10 katı degilse yazdır diyecegiz.
            System.out.print(number + " ");//sayıyı artırmam lazım cunku soru ardısık istiyor
            number++;
        }





    }
}
