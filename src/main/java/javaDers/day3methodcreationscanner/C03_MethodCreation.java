package javaDers.day3methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

   //Dikdortgenin alanını hesaplayan bir method yazınız
   dikdortgenAlanı(10,20);

   //verlen datayı karenin alanını hesaplatan bir method olusturunuz

        System.out.println(kareninAlanı(6)+2);

    }//main

    private static int kareninAlanı(int x) {

        return x*x;

    }

    private static void dikdortgenAlanı(int a, int b) {

        System.out.println(a*b);




    }


}//class
