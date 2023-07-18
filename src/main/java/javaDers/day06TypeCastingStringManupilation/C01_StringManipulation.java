package javaDers.day06TypeCastingStringManupilation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        
                      //******toUpperCase()*************
        String a = "Benim Tek Rakibim Dunku Ben...";
       String aUpper= a.toUpperCase();
        System.out.println("aUpper = " + aUpper);// buyuk harfe donusturur "TEK RAKİBİM DUNKU BEN"
        
       String aLower=a.toLowerCase();
        System.out.println("aLower = " + aLower);   //tüm harfleri kucuk yapar

                      //************charAt()****************
        System.out.println("ilk karakter ="+a.charAt(0)); // T verir
        System.out.println(a.charAt(10)); // m char ı verir.


          // a String indeki bastan 2. ve sondan2. karakteri  karakteri aliniz ve yan yana yazdırınız
              char firstChar =a.charAt(1);
              char lastSecondChar=a.charAt(20);
        System.out.println("firstChar+lastSecondChar = " + firstChar+lastSecondChar);

                    //**************length********
        // a String inde bulunan karakter sayısını bulunuz
        int slenght =a.length();//23  bir data daki karakter sayısını bize dondurur
                                //int bir deger dondurur.

                        //*********substring*******
        //a String indeki ilk dort karakteri aliniz
        String substr1 =a.substring(0,4);
        System.out.println("substr1 = " + substr1);
// a String de 4.index dahil ve 7.index haric yazdırın
        System.out.println(a.substring(4,7));

     // a stringindeki Rakib kelimesini aliniz.
        System.out.println (a.substring(10,15));

        // eger tek index yazarsak orda sonuna kadar alır
        System.out.println(a.substring(10));
        
        
                     //***********contain**********
         //a stringinde bim kelimesini olup olmadıgını kontrol ediniz.
        //cevap olara boolean dondurur.
        boolean isthere =a.contains("bim");
        System.out.println("isthere = " + isthere);

       // **********startsWith()*****
        // a string ini T harfi ile baslayıp baslamadıgını kontol ediniz
        System.out.println(a.startsWith("T"));

        System.out.println(a.startsWith("tek",6));
        //  yukarıdakı kod ilk altı karakteri at ; sonrası tek kelimesi ile basliyor mu.
        //bu kod da boolean yanı true false dondurur

        // universite numamraları yıl bolum kodu giris sirası olarak duzenlenen okulda
        // ogrenci umranın hukuk fakultesinde okuyup okumadıgını gosteren kodu yazınız
          // kodlar: sınıf 22 hukuk33 bilgisayar 44 eczacılık 55 maliye 66 kimya 77 olsun


    String str = "201005501";
        System.out.println(str.startsWith("33",4));



    }
    
    
}
