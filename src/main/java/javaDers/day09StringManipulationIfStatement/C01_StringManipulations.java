package javaDers.day09StringManipulationIfStatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

       //ex: bir stringin hic karakter içermediğini kontrol eden kodu yazınız.

        String str ="";
      //1 WAY:    1. yol iki islemli oldugu icin daha yavas doner.
       boolean result1=str.length()==0;
        System.out.println("String bos mu="+result1);

        //2 WAY   ************isEmpty()****************//
        boolean result2=str.isEmpty();// bu method datayı daha hızlı dondurur.
        System.out.println("result2 = " + result2);

        //EX: bir string datanın space haric hic bir karakter içerip icermedigini içeren kodu yazınız.

        String t =" ";
       // 1. yol
        boolean isThere = t.replace(" "," ").length()==0;// 3 islem var yavas calsır
        System.out.println("isThere="+isThere);
          //2. yol
        boolean result3 = t.replace(" "," ").isEmpty();//2 islem yapıldı
        System.out.println("result3 = " + result3);
       //3.:Yol
        //****************isBlank************=/*
        //isBlank() ==> space + hiclik ise True dondurur
        //String bir datanin bosmu dolumu olduguna bakar
        //isEmpty'den farki space varsa yine true dondurur

        boolean result4 = t.isBlank();// tek islem yapıldı hızlı calısır.
        System.out.println("result4 = " + result4);
     //**************indexOf()********
        //verilen karakter veya karakterlerin ilk görünümünün indexini verir
        // integer bir deger dondurur.
        //Ex: bir string de a,i,e karakterlerini ilk gorunumunun indexleri toplamını ekrana yazdırın

        String s="Java is easy to learn";

         int aIndex=s.indexOf('a');//1 İNDEX VERİR
        System.out.println("aIndex = " + aIndex);
        int eIndex=s.indexOf('e');//8 İNDEX VERİR
        System.out.println("eIndex = " + eIndex);
        int iIndex=s.indexOf('i');//5 DONDURUR
        System.out.println("iIndex = " + iIndex);
        System.out.println(aIndex+eIndex+iIndex);//TOPLAMI 14 VERİR

     int pIndex = s.indexOf('p');
     System.out.println("pIndex = " + pIndex);// OLMAYAN BİR KARAKTER  İNDEX -1 VERİR.

        String s2="Java is easy to learn to easy to";
        int idx=s2.indexOf("to");
        System.out.println("idx = " + idx);//13 dondurur

 //Ex: bir stringde Java kelimesinin ilk olarak kacıncı indexte oldugunu gostern kodu yazınız
         String cumle ="Ah Java vah Java sen ne guzel bir seysin Java";
         int indxjava =cumle.indexOf("Java");
        System.out.println("indxjava = " + indxjava);
        int indexQYX=cumle.indexOf("QXY");// -1 dondurur icinde harf QXY yok

        //**************lastIndex******* Verilen Strin bir datada istenilen degerin son gorunumunu verir.



        // EX : Bir String'de a,i,e karakterlerinin son gorunumunun
//      indexleri toplamini ekrana yazdirini
        String c="Java is easy to learn";
        int alast=c.lastIndexOf('a');
        System.out.println("alast = " + alast);
        int ilast=c.lastIndexOf('i');
        System.out.println("ilast = " + ilast);
        int elast =c.lastIndexOf('e');
        System.out.println("elast = " + elast);

        System.out.println(alast+ilast+elast);





    }


}
