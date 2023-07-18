package javaDers.day3methodcreationscanner;

import java.util.Scanner;

public class C01_KullanıcıdanDataAlma {

    public static void main(String[] args) {

         //Kullanicidan aldiginiz
        // character ile asagidaki gibi bir gorunum olusturunuz
         /*
          A
         A A
        A A A
       */

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen bir karekter veriniz...");

        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+"  ");
        System.out.println(ch+" "+ch+" "+ch);
// sadece char datatype icin next char diye bir method olmadıgı icin kullanıcıdan data alip
// ch konteynırına yerlestirmek icin next().charAt(0) methodunukullanırız.


//  Aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" + "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);




    }//main


}//class
