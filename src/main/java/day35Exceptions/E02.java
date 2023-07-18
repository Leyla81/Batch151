package day35Exceptions;

public class E02 {

    public static void main(String[] args) {

    String s="1234";
    convertStringToInt(s);

    String t ="1234a";
    convertStringToInt(t);//eger icinde rakamlar dısında character olan bir string  i sayıya cevirmek isterseniz java NumberFormatException atar


    }
    public  static void convertStringToInt(String s){
        try {
            int intS = Integer.valueOf(s);//yukarıdaki stringi asagıda String e cevirdik
            System.out.println(intS+1);

        }catch (NumberFormatException e){

            System.out.println("Bir stringin sayıya donusturulmesi için rakam dısı karakter icermemeli");
        }


    }



}
