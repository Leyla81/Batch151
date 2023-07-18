package day22stringbuilder;

public class Sb001 {
    public static void main(String[] args) {

       //"StringBuilder" String ureten bir Class"dır.
       //String Class kullanarak String uretiriz. Java nicin "StringBuilder" Class da olusturmustur
       //"String" Classs imutable (degistirilemez)String uretir "StringBuilder" Class "mutable "(degistirilebilir) String uretir.
        // "immutable" olmak demek orginal degerin korunması degistirilemez olması demektir.
        // "mutable " olmak demek orginal degeri degistirilebilir olmak demektir

        //"capacity" Javanın size verilen data depolama yer bolumudur
        //"lenght" ise size verilen data depolama yerinin kullanılan kısmıdır.
        // java baslangıc olarak size capacity i 16 olararak verir.


        String s ="Java";//degistirmez  Heap memoryde yeni bir yer acar
        s = s+"!";//yukarıdaki  s yi degistirmis olduk===> "Java!"


        String u = "Apex";
        String v = "Apex";
        String y = "C++";

// StringBuilder nasıl olusturulur? Birkac yolu var
        StringBuilder t = new StringBuilder("Pyton");// var olanı tamamen degiştirir.
        System.out.println(t);

      t.append("!"); //yukarıda string de s operatorune atamıstık atamazsak degismezdi orjinali.
                     // Ama burda atma yapmadan degistirebildik
        System.out.println(t);//"pyton!" olur

        //"capacity" ve "lenght" arasındaki fark nedir?

        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity);

        int lenght = sb1.length();
        System.out.println(lenght);

      //Default Capacity i degistirebiliriz?
      StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());// kapasıteyi 2 verir

        sb2.append("...");
        System.out.println(sb2.capacity());// kapasiteyi 6 verir. Var olanın kapasitesini ikiye katlar ve 2 ekler












    }

}
