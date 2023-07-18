package javaDers.day04MemoryKullanimiWrapperClass;

import java.util.Scanner;

public class C01_Scanner {


    public static void main(String[] args) {

        // kullanıcıdan aldıgınız 5 basamaklaı sayıların ilk 2 ve son 2 rakamının toplamını yazdıran kodu yazınız

        Scanner input =new Scanner(System.in);

        System.out.println("Lutfen 5 basamaklı bir sayı giriniz......");
            //38671 sayısını verlim.
        int number= input.nextInt();

        int lastDigit=number%10;   //sayının son rakamını alır: 1
       number =number/10;           //sayıyı 10 boler 3867

       int lastSecondDigit =number%10; //kalan sayının son rakamını alır:7
       number = number/10;             //kalan sayıyı 10 a boler:386

       int lastThirdDigit = number%10; //kalan sayının son rakamını alır:6
       number = number/10;              //kalan sayıyı 10 a boler:38

       int lastFourthDigit = number%10;   //kalan sayının son rakamını alır:8
       number= number/10;                 //kalan sayıyı 10 a boler:3

       int lastfifthDigit = number%10; //kalan sayının son rakamını alır:3



        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastfifthDigit);



    }//main




}//class
