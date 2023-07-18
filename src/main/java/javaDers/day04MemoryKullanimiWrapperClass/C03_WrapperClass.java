package javaDers.day04MemoryKullanimiWrapperClass;

public class C03_WrapperClass {


    public static void main(String[] args) {


    /*primitiveler normalde method icermezler. Method icermesi icin developerlar
    primitveleri non primitve cevirmisler.yani primitveleri class a cevirmisler.
    buna wrapper class demisler.
    PRIMITIVE                  NON-PRIMITIVE
    byte         ==>              Byte
    short        ==>              Short
    int          ==>              Integer
    long         ==>              Long
    float        ==>              Float
    double       ==>              Double
    char         ==>              Char
    boolean      ==>              Boolean
    */
        // ****************primitive Data Type larını wrapper classlara nasıl ceviririz*************

        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat;// buna AUTOBOXING denir kucuk kutuyu buyuk kutuya java kendisi koyar


        //***********wrapper class ları primitve data type laına nasıl ceviririz****************
        //buyuk kutudan kucuk kutuya koyar

        Character wrapperChar = 'a';
        char primitvechar = wrapperChar;// buna UNBOXING denir.

        // example 1: Verilen iki sstrin datanın toplamını veren kodu.
        String str1 ="12345";
        String str2="987";
        System.out.println("str1+str2 = " + str1 +str2);//12345987

        // String bir datayi toplamaz resim olarak gorur ve yan yana yazdırır buna CONCATINATION denir
        //yukarıdaki kodu toplayabilmem icin Integer bir konteynı almam gerekır.
         // javada "+" sembolu iki int icin matematikteki gibi toplama işlemi yapar.
        //eger iki String data arsında ya da bir strin ve bir int i yan yana yazdrırır.(CONCATINATION)

        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));
        //VALUEOF methodu String bir datayı Wrapper Class olan INteger e donusturur.

        String harf="A";
        int sayi=7;
        //yazdırıp toplarsak A7 olur

        // "K" +3*5/2 islemini yazdirınız
        String a= "K";
        int b=3,c=5,d=2;
        System.out.println(a+b*c/d);//K7 yazdırır int bir data oldugu icin virgüden sonrasını almaz.










    }

}
