package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //kullanıcıdan bir dikdortgenın iki kenar uzunlugunu isteyiniz
        // Alanını hesaplayınız kısa kenar * uzun kenar
        // cevresini hesaplayınız....2* kısa kenar + 2* uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dikdortgen kisa ve uzun kenarını giriniz");
        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();
        System.out.println(uzunKenar*kisaKenar);
        System.out.println(2*kisaKenar +2*uzunKenar);



    }




}
