package javaDers.day08StringManipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {


        //********replaceFirst************
        //replace methodu ile ayni isi yapar sadece ilk datayı degistirir
        String str="Hayirli olsunda";

        //ex. str stringindeki a sesini e sesi ile degistirınız
        
        System.out.println(str.replaceFirst("a","e"));
        // ya da soyle yapılır
        String str1=str.replaceFirst("a","e");
        System.out.println("str1 = " + str1);// javada makbul olan bu 2. yoldur.
        
        //**********trim************* bir stringdeki basındaki ve sonundaki space i siler.Aradaki spacelere dokunmaz.

      // ex str stringindeki bas ve sonda varsa space karakterlerini siliniz.

            String str2="    Ali Can     ";
        System.out.print(str2);
        String strtrim=str2.trim();
        System.out.print(strtrim);
        System.out.println("******");

        // asagıda fiyatları verilen urunlerin toplam fiyatını bulunuz:
        //String tv=500,99 $          String laptop =299.99$

        String tv="500,99$";
        String laptop="299.99$";
        
        //dolar isaretinden kurtulmak icin asagıdaki kod yazılır
        String tv2=tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        
        String laptop2=laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);

      //EKSİK VAR
// value of methodu strin olan datayı bize sayı haline getirir wrapper classlar sayesinde
        

        // verilen ismin ilk harfini ekrana yazdırınız.

        String tamIsim= "  mehmet Fatih   ";

        char first =tamIsim.trim().toUpperCase().charAt(0);
        char second =tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second);
        System.out.println("ilk harf son harf="+first+second);




    }

}
