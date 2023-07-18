package day_04loopArrays;

import java.util.Locale;
import java.util.Scanner;

public class C01_cdenoncekia {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen icinde 'c' ve 'a' karakteri iceren bir kelime girin...");
        String str = input.next().toLowerCase();
        //Toplama ve cikarma islemlerinde default deger sifirdir.(0)  Carpma ya da bolme islemlerinde default deger birdir (1)
        //String datalar icin ""; (hiclik)

          //***1 WAY***
        int counter=0;
        for (int i = 0; i <str.indexOf("c") ; i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("c'den once  "+ counter +" 'a' vardır" );

        //***2 WAY**
        int sayac =0;
        if(str.contains("c") &&str.contains("a")){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='a'){
                    sayac++;
                } else if (str.charAt(i)=='c') {
                  break;
                }
            }
            System.out.println("'c' den onceki 'a'sayısı  "+sayac);

        }else{
            System.out.println("Lutfen icinde 'c' ve 'a' karakteri iceren bir kelime girin...");
        }











    }
}
