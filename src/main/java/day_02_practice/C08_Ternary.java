package day_02_practice;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {
/*
        Kullanıcıdan 100 üzerinden notunu sisteme girmesini isteyiniz.
        Girilen not;
        not>100 ise konsola "100 den buyuk not giremezsiniz" yazdırın
        not>89 ise konsola "A" yazdırın
        not>79 ise konsola "B" yazdırın
        not>69 ise konsola "C" yazdırın
        not>59 ise konsola "D" yazdırın
        not>49 ise konsola "E" yazdırın
        not>-1 ise konsola "F" yazdırın
        degilse " negatif not giremezsiniz" yazdırın

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ogrencinin notunu giriniz");
        int grade=scan.nextInt();

      String harf= grade>100 ? "100 den buyuk not giremezsiniz" :grade>89 ? "A": grade>79 ? "B": grade>69 ? "C": grade>59 ? "D":grade>49 ? "E":grade>-1 ? "F":"negatif not giremezsiniz";




      System.out.println(harf);



















    }
}
