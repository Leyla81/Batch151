package day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1) bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2) "Method Overloadin" javada "iyi organizasyon" icin onemlidir
    3) method overloading yaparken 3 sekide degiştirilebilir
    ---parametrelerin sayilari degistirilebilir
    ---parametrelerin data type ını degistırebilirsiniz.
    --- parametrelerin data type ları farklı ise yerleri degiştirilebilir
     */

    public static void main(String[] args) {
    }

 public static int add (int a, int b){
        return a+b;
 }
    public static int add (int a, int b, int c){
        return a+b+c;
    }

    public static double add (double a, int b){
        return a+b;
    }

    public static double add (int a, double b){
        return a+b;
    }






}
