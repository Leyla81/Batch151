package javaDers.day08StringManipulations;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C01_StringManipulations {


    public static void main(String[] args) {

                    /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi  \n" +
                " i)mail adresi \"@gmail\" icermeli\n" +
                " ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali \n seklinde veriniz");
String mail=input.nextLine();
        //i)mail adresi "@gmail" icermeli
        boolean first =mail.contains("@gmail");
        System.out.println("@gmail="+first);

        //ii)Space characteri mail'de olmamali unlem ile olumsuz yapıyoruz.
        boolean second= !mail.contains("");
        System.out.println("second = " + second)
        ;
        //iii)mail adresinde buyuk harf olmamali contain metodu burada calısmaz.
       // boolean third =!mail.contains("[^A-Z]");//
       // System.out.println("third = " + third);

       boolean third=mail.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]","").replace(  " ","").length()==0;
        System.out.println("third" + third);

        // iv)En az bir tane noktalama isareti bulunmali

        boolean fourth=mail.replaceAll("[a-zA-Z]","").length()>0;
        System.out.println("fourth" + fourth);

        boolean fourth2=mail.replaceAll("[^\\p{Punct}]","").length()>0;
        System.out.println("first&&second&third&&fourth");

        String str="burada bir gariplik var.?!";
        System.out.println(str.replaceAll("[^\\p{Punct}]",""));


}
}





