package javaDers.day05TypeCastingAsciiValuStringManipulations;

public class C01_MatematiselIslemler {


    //Javada farkli data typeları arasında ıslem yapılıyorsa sonuc buyuk olan data typeının turunde olur
    //karsılastırma operatorlerınde sonuc hep boolean doner.
    // karsılastırma operatorleri:
    //< :kücüktür     <:buyuktur    == : esittir    !0 :esit degildir
    //  <= ucuk Esittir     >= Buyuk Esittir
    // && : and operatoru    ||: or veya operatoru

    public static void main(String[] args) {

        System.out.println(4*(5+2)/3); // sonuc 9matematikte islem onceliği uslu ifade parantee carpma ve bolme ve toplama cıkarma.

        System.out.println(6*16/8); // sonuc 12
        double sonuc = 4*(5+2)/3;

        System.out.println("sonuc"+ sonuc);
        double sonuc2 = (4.0*(5+2)/3);

        System.out.println("sonuc2 = " + sonuc2);
        System.out.println(4*(1+5)/3);

     int sayi1 = 5;
     int sayi2 =2;
     double sayi3= 2;
        System.out.println(sayi1/sayi2);
        System.out.println(sayi1/sayi3);
        System.out.println(sayi1+sayi3/sayi2);

      boolean first= 2<4;
      boolean second=2+6!=8;
      boolean third= 2+3*5<20;
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);

        System.out.println(first &&second);
        System.out.println(first || second ||third);

    }//main

}//class
