package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {

    //kullanıcıdan ilk ismini ve soy ismini ekrana yazdırınız.

    public static void main(String[] args) {
        // 1.adım Scanner class da obje ismini olustur

        Scanner input =new Scanner(System.in);

        // 2. adim kullanıcıya ne istediğimize dair msj veriniz

        System.out.println("Ilk isminizi giriniz");
       String firstName= input.next();

        System.out.println("soy isminizi giriniz");
       String lastName =input.next();

        System.out.println(firstName + lastName);

    }



}
