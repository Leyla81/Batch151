package ssg.ifEisessg;

import java.util.Scanner;

public class ifelse03 {
    public static void main(String[] args) {

 // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir not giriniz");

        double not =input.nextDouble();
        if(not<0||not>100){
            System.out.println("Gecersiz not girdiniz");
        }else if(not< 50){
            System.out.println("notunuz D");
        } else if(not< 60){
        System.out.println("notunuz C");
        }else if(not< 80){
            System.out.println("notunuz B");
        }else{
            System.out.println("notunuz A");
        }

        System.out.println("bizi tercih ettiğini icin tesekkurler");






    }
}
