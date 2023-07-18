package javaDers.day05TypeCastingAsciiValuStringManipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {
        
        // A karakterini ascii degerini yazdıran kodu yazınız
        // ascii table degerlerini int konteynerına yazarız cunku sayısal degeri verir.
        // javada char data type ını matematiksel işlemlerde
        // kullanırsanız ascii table daki sayısal degerleri alır

        int asciiA='A';
        System.out.println(asciiA);
        
        int asciia='a';
        System.out.println(asciia);
        
        int asciiunlem= '!';
        System.out.println("asciiunlem = " + asciiunlem);
        
        int asciiSpace =' ';
        System.out.println("asciiSpace = " + asciiSpace);
        
        int asciisymbol='*';
        System.out.println("asciisymbol = " + asciisymbol);

        int deger =20;
        char symbol='$';
        System.out.println(deger+symbol);

        int deger2=0;
        char symbol2='+';
        System.out.println("deger2+symbol2 = " +(deger2+symbol2));


        String name = "sezen";
        int number =998;
        System.out.println(name+number);//cancatination yan yana yazdırma

        String str1="java";
        String str2 ="guzel";
        int sayi1 = 5;
        System.out.println(str1+str2+sayi1);// yan yana yazdırır. java guzel 5

        String str11="java";
        char ch3 ='G';
        int sayi11 = 5;
        System.out.println(str11+ch3+sayi11);//yanyana yazdırır.javaG5
        System.out.println(str11+(ch3 +sayi11)); //parantez toplatır
        System.out.println(ch3+sayi11+str11); //bu da toplayarak yazdırırcünkü strin basta degidir.

      char rakam1 ='1';
        System.out.println("rakam1 = " + rakam1);
      char rakam2='2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3= '3';
        System.out.println("rakam3 = " + rakam3);
        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4);// char oldugu icin yanyana yazdırır.1234
        System.out.println("rakam1+rakam2+rakam3+rakam4="+(rakam1+rakam2+rakam3+rakam4));// parantez olddugu icin toplama islemi yapar ascii tabledaki degeri toplar
        //char boylece karakteri resim olarak da görür sayi olarak da.

        byte b= 5;
        char ch4='h';
        System.out.println("b>ch4 = " + (b>ch4));

        long l = 542168784578L;
        System.out.println("ch4>l="+(ch4>l));

        float f = 2.45648f;
        double d = 2.1966658;
        System.out.println("f>d" +(f>d));
        System.out.println("b<f:" + (b<f));

        int sayiint =100;
        long sayilong = 100L;
        System.out.println("sayiint<sayilong :" + (sayiint<sayilong));

        int sayiint3=9;
        char sayichar='9';
        System.out.println("sayiint3>=sayichar = " +(sayiint3>= sayichar));

         //numeric degeri olmayan string data typenı kıyaslamaz.

    }//main
    
    
}//class
