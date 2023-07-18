package javaDers.day05TypeCastingAsciiValuStringManipulations;

public class C03_TypeCasting {


    public static void main(String[] args) {

 //  numeric data typelarını birbirinr donusturulmesıne "data type casting" denir
 //numeric data type lari:
 //Kucuk data type ların  buyuk data typelarına donusturulmesine "AUTO WIDENING" denir.
 //kucuk kutunu buyuk kutuya yerlestirilmesidir.
 //buyk kutuyu kucuk kutuya donusturme sorumlulugunu almaz data kaybı olabilecegi icin code yazanlar bırakır.,
        // buna "Explicit Narrowing" denir

        byte age =13;
        int ageint=age; //auto widening

       // long data type inin shorta ceviriniz.
        long populationOfWorld = 850000000000000L;
        short newPopulation = (short)populationOfWorld;//"Explicit narrowing" cunku buyuk olanı kucuke aktarıyoruz


        // int data typenı floata ceviriniz.
        int boy =170;
        float boyFloat = boy;


        //short data type ının byte data type ceviriniz
        short numberShort = 115;
        byte numberbyte =(byte) numberShort;







    }


}
