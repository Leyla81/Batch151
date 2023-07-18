package day22stringbuilder;

public class StrinBuilderTekrar {
    public static void main(String[] args) {

        //"StringBuilder" String ureten bir Class"dır.
        //String Class kullanarak String uretiriz. Java nicin "StringBuilder" Class da olusturmustur?
        //String ===> immutable       StringBuilder ===> mutable
      //immutable olma sayesinde birinin degisimi digerlerini etkilemez

        String s ="Java";//pozitıf yonu orjinal data hep kalır
        //s+"!"; //atama yaparak orjinal deger degisir yani extra kod yazarız

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        u= u+"!";

        // StringBuilder nasıl olusturulur? Birkac yolu var
        //1.WAY
        StringBuilder t = new StringBuilder("Pyton");// var olanı tamamen degiştirir.
        System.out.println(t);
        t.append("!");
        System.out.println(t);

        //2.WAY
        StringBuilder r = new StringBuilder();
        System.out.println(r);
        r.append('t');//char da ekleyebiliriz.
        System.out.println(r);

       // StringBuilder lara ekleme yapma islemi
        t.append("!"); //yukarıda string de s operatorune atamıstık atamazsak degismezdi orjinali.
        // Ama burda atma yapmadan degistirebildik
        System.out.println(t);//"pyton!" olur
      //objeyle olusan methodların hepsi non static'tir

        t.append("..").append("?");//method Chain


        //"capacity" ve "lenght" arasındaki fark nedir?
        // yapabileceginiz max is capacity  ===> yapılan is lenght

        //"capacity" Javanın size verilen data depolama yer bolumudur
        //"lenght" ise size verilen data depolama yerinin kullanılan kısmıdır.
        // java baslangıc olarak size capacity i 16 olararak verir.

        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();//21
        System.out.println(capacity);

        int lenght = sb1.length();//5
        System.out.println(lenght);

        sb1.append("!").append(".................");
        int a = sb1.capacity();
        System.out.println(a);

        sb1.trimToSize();//lenght ile capacity i esitler




        //Default Capacity i degistirebiliriz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());// kapasıteyi 2 verir

        sb2.append("...");
        System.out.println(sb2.capacity());// kapasiteyi 6 verir. Var olanın kapasitesini ikiye katlar ve 2 ekler


        StringBuilder sb1a =new StringBuilder("java is easy");
        System.out.println(sb1a);


        sb1a.reverse();//Stringi ters cevirir.Stringin ters cevrilmesi looplar ile de yapılır. bu kısa yoldur
        System.out.println(sb1a);//ysae si avaj

        sb1a.deleteCharAt(6);//index 6 yı siler
        System.out.println(sb1a);//ysae s avaj   i"yi siler

        sb1a.delete(4,7);//baslangıc indexinden bitis indexine kadar olan bolumu sile 7 haric
        System.out.println(sb1a);//ysaeavaj yazdırır.


        sb1a.replace(2,5,"X");// verilen 3 karakteri "X" e cevirir.
        System.out.println(sb1a);//ysXvaj

        sb1a.insert(3,"2023");//ilk 3 karakteri gec sonrasına 2023 ekle
        System.out.println(sb1a);

        StringBuilder sb2a = new StringBuilder("Demet");
        StringBuilder sb3 = new StringBuilder("Deniz");
        int r1 = sb2a.compareTo(sb3);
        System.out.println(r1);






        //==>0 verir arada fark yok demektir
        //compareTo()methodu alfabetik sıraya koyar
        //sonuc  mesaela -3 ise alfabetik olarak 3 onde demektir
        //sonuc  mesaela 3 ise alfabetik olarak 3 sonra demektir.






    }
}
