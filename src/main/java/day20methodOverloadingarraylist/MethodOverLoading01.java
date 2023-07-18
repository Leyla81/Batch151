package day20methodOverloadingarraylist;

public class MethodOverLoading01 {
    public static void main(String[] args) {


        //********1) method overloading nedir?****
        //overloading aynı isimle farklı işler yapabilmektir
        //2) ne icin kullanılır
        //daha derli toplu bir yapı olsun diye. her parametreye gore yeni method olusturmamak adına var
        // ornek substring methodu -----tek parametre ile de olusur cift parametre ile de kullanılır

              String s="Java";
              add(3,5);// boylece alttaki methodlarla mthod over loading yapmıs olduk

    }
    /*
    1) method overloading yaparken method ismi degiştirilmez
    2) method overloading yaparken parametreler degiştirilebilir
        a) parametre degiştirirken parametrelerin data typeları degistirilebilir
        b) parametreler degistirir ken parametrelerin data type ları farklı ise yerleri degiştirilebilir
        c)Parametre değiştirirken parametrelerin sayısı degistirilebilir
     3) Java icin ismi ve parametreleri aynı olan iki method tamamen aynıdır
     bu yuzden ismi ve parametre ==>"method signature " olarak adlandirılır
     4) method overloading olustururken return type"i degiştirmenin hic bir etkisi yoktur
      method overloading olustururken access modifier"i degiştirmenin hic bir etkisi yoktur
       method overloading olustururken static , non-static olmasının hic bir etkisi yoktur
        method overloading olustururken method body"i degiştirmenin hic bir etkisi yoktur
     5)"private" methodlar overload edilebilir.Cunku method overloadin sadece bir class in icinde olur.
     diger classlarda gorulmez
     6)Static methodlar overload edilebilirler
     */

//methodlar main in disinda olusturulur. yukarıda (add) goruldugu gibi içinde calısır
    public static void add (int a, int b){
        System.out.println(a+b);
    } //return type void oldugu icin return olmaz.soyhle olsaydı.
    // public int add(int a,int b)
    //return a+b;
    public static void add (double a, double b) {
        System.out.println(a + b);
    }
    public static void add (int a, double b) {
        System.out.println(a + b);
    }
    public void add (double a, int b) {
        System.out.println(a + b);
    }
    public static void add (int a, int b, int c) {
        System.out.println(a + b + c);
    }

//******onemli notlar***********

    //methodoverloading yaparken method ismi degismez. parantez ici parametreler degisebilir
    //java isim ve parametrelerden tanır.isim ve parametreye "method signature" denir




}
