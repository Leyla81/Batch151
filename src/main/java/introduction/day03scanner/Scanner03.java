package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {

    // kullanicidan adresini aliniz ve ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Lutfen Adresinizi giriniz....");
        // next() methodu kullanıcıdan tek kelimeyi almak için kullanılır
        //nextLine() methodu kullanıcıdan cok kelimeli Stringi almak icin kullanılır

        String address = input.nextLine();
        System.out.println(address);

    }







}
