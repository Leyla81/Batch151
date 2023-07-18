package day36Exceptions;

public class E03 {
    public static void main(String[] args) {

      Object obj =13;
      try {
          String str =(String) obj;
          System.out.println(str);
      }catch (ClassCastException e){
          System.err.println("her data type ı her data type ına cevrilmez");

      }//System.err.println(); mesaji kirmizi olarak consola yazdirir ve hata mesaji vermek icin kullanilabilir

        //birbirine donustrulemeyecek data type larıni donusturmekte java ClassCast Exception atar


    }
}
