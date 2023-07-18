package javaDers.day07StringManipulation;

import java.util.Scanner;

public class C02_StringManipulations {


    public static void main(String[] args) {
        //Asagıdaki kurallara gore kullanıcının girdigi passwordu kontrol ediniz.
        //1. en az 8 karakterden olussun
        // 2. bosluk olmasın
        //3. en az bir buyuk harf olsun
        //4. en az 1 tane kucuk harf olsun
        //5.en az bir sembol
        //6.en az bir rakam olsun

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu " +
                "1. en az 8 karakterden olussun\n" +
                "  2. bosluk olmasın \n" +
                " 3. en az bir buyuk harf olsun\n" +
                " 4. en az 1 tane kucuk harf olsun\n" +
                " 5.en az bir sembol\n" +
                " 6.en az bir rakam olsun "+
                "giriniz");
        String pwd =input.nextLine();

        //1. en az 8 karakterden olussun
        boolean krktrsys =pwd.length()>7;
        boolean krktrsys2 =pwd.length()>8;// Makbul olanı buyuktur 7 olanıdır cunku
                                               //java cok is yapmayı sevmez
        // 2. bosluk olmasın
        boolean spcolmamali=!pwd.contains("");// space karakteri contains metodunu unlem yerlestirerek olumsuz yaptık

        //3. en az bir buyuk harf olsun
        boolean bykhrfolmali=pwd.replaceAll("[^A-z]","").length()>0;
       //methodları aynı satırda yan yana yazabiliriz buna METHOD CHAIN denir

       //4. en az 1 tane kucuk harf olsun
        boolean kckhrfolmali = pwd.replaceAll("[^a-z]","").length()>0;

        //5.en az bir sembol
        boolean sembololmali = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

        //6.en az bir rakam olsun
        boolean rakamolmali=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("password gecerli mi:"+ (krktrsys&&spcolmamali&&bykhrfolmali&&kckhrfolmali&&sembololmali&&rakamolmali));



    }


}
