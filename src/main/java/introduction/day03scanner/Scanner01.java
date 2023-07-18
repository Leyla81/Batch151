package introduction.day03scanner;


// java'nın util kutuphanesindenscanner class import edildi.

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
//1. adım: scanner class dan bir obje olustur
        Scanner input = new Scanner(System.in);
        //obje ismi input cunku bu obje kullanıcıdan alan datayı benim kodlarımın icine koyacak

        // 2. adim: kullanıcıya ne istedigimize dair msj veriniz

        System.out.println("Lutfen yasinizi giriniz...");

// Uygun methodu kullanarak kullanıcının verdigi datayi memory e yerlestiriniz

       byte age= input.nextByte();
        System.out.println(age);

    }



}
