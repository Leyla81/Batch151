package sulymanNightTime.day34Exceptions;

public class Exception03{

    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars("Money"));//5
        System.out.println(getNumOfChars(""));

        System.out.println(getNumOfChars(null));//hata verir duzeltmek icin (handle )"Try-catch" blocku yapılır

    }

    //Bir String'deki character sayisini veren method olusturunuz.
    public static int getNumOfChars(String s){//character sayısını alma methodu

        int result = 0;

        try{
            result = s.length();
        }catch(NullPointerException e){//"NullPointerException" String class'da "null" ile uyumlu olmayan method'lar kullanildiginda atilir.
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java'nin Exception icin urettigi teknik mesaji varsa verir.
        }
        return result;
    }
}

