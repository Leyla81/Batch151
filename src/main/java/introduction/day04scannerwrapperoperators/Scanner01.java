package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01{


    public static void main(String[]args){
      // kullanıcıdan alacaginiz alacaginiz 5 basamakli bir sayının ilk iki ve son iki basamagindaki
      //rakamların toplamini yazdiran kodu girini.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamaklı sayi giriniz");

        int number = input.nextInt();

        // Son rakami almak icin alabilmek icin o sayıyı 10 a bolup kalanı almalıyız
        //% ...modulus operator solunda bulunan sayini saginda bulunan sayiya bölümünden kalanı verir
        // dolayısıyla % 10 her zaman bize birler basamagindaki bulunan sayiyi verir.
        // bir tam sayiyi bir tam sayıya bolerseniz java sayıyı kesinlikle tam sayı yapar.
        // yuvarlama yapmaz ondalık kısmı iptal eder
        // dolayisiyla bir tam sayıyı 10 a bolersek birler basamagını silmis oluruz.


        int lastDigit = number%10;
        // sayı kucult
       number = number/10;

       // sondan 2. rakamı al
              int lastsecondDigit= number%10;
       // kucult
               number = number/10;

       //sondan 3.rakamı al
               int lastThirdDigit = number%10;
        //sayi kucult
              number = number/10;

        // sondan 4. rakamı al
                int lastFourthDigit = number%10;
        //kucult
                number = number/10;

       // sondan 5. rakamı al
              int lastfifthDigit=number%10;
        // kucult
            number = number/10;

        System.out.println(lastDigit+lastsecondDigit+lastFourthDigit+lastfifthDigit);








}


}










