package day_01Practice;

import java.util.Scanner;

public class C05_scanner {

    public static void main(String[] args) {
          /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adınızı giriniz...");
        String name=input.nextLine();

        System.out.println("lutfen soyadınızı giriniz...");
        String surname=input.nextLine();

        System.out.println("lutfen yasınızı giriniz..");
        int age = input.nextInt();

        System.out.println("Lutfen bouynuzu giriniz...");
        int height=input.nextInt();

        System.out.println("lutfen kilonuzu giriniz..");
        int weight = input.nextInt();

        System.out.println("Name:"+name+"\n"+"Surname:"+surname+"\n"+"Age"+age+"\n"+"Height:"+height+"\n"+"Weight:"+weight);







    }




}
