package javaDers.day06TypeCastingStringManupilation;

public class TypeCasting {
    public static void main(String[] args) {
        
        //short data tipinde bir variable olusturup short data tipine ceviren kod yazınız 
       
        short num =260;
        byte numByte =(byte) num;
        System.out.println("numByte = " + numByte);         
        // explicit narrowing
        
        short num2=1023;
        byte num2Byte=(byte)num2;
        System.out.println("num2Byte = " + num2Byte);
        
        
        short num3=1000;
        byte num3Byte=(byte)num3;
        System.out.println("num3Byte = " + num3Byte);
        
        int intsayi=8880;
        short shortsayi=(short)intsayi;
        System.out.println("shortsayi = " + shortsayi);
        //short data type aralıgında oldugu iicin veri kaybı olmaz aynı degeri verir.
        // expilicit narrowing yaparken dikkat edilmeli .Cunku cok ciddi data kaybı olabilri hatta datayı degiştire debilir.
        //Eger donusturmeye calıstıgımız variable ın sınırları dısında ise java sayıyı mod islemine alir ve
        //kalanı yazdirir.kalan bölenini yarısında fazlaysa kalan sayıyı java kucultmek ister.
        
    }
    

    
}
