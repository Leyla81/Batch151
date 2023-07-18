package day25varagsinheritance;

public class Vehicle {
    /*
    1)Javada object class tum java class"ların ortak parent"ıdır
    2)javada object class haric tum classların parentı vardır
    3)javadaparent tan child a olan iliskilere "Has a relationship" denir
      javada child olan parent a olan iliskilere "Is a relationship "denir.
    4)javada her classın 1 tane "default constructor" ı vardır bu "default constructor"
     class icinde gorunmez cunku default class object classın icindedir
     5) child classtan bir object olusturdugumuzda Constructor
     usteki parent class dan baslatılarak alta dogru calısır
     6) aynı class icindeki constructorları secmek icin "this" kullanılır.
     Aynı classda 1 den fazla constructor varsa istenilen constructor this()
     parantezinin icine yazılan parametreler yardımı ile secilir
     8)super() ifadesinin yazmak istege bglidır siz yazmasanız da java sanki super varmis gibi davranır.
      ama kodunuzu daha okunur kılmamız icin yazmamiz tavsiye edilir.
      9)this() ve super() ifadeleri constructor icinde her zaman ilk satırda olmalıdır
      bir konstructor icinde super() ve this() ifadeleri sadece biri kullanılabilir.
      10)Inhertance da variable"leri ve methodları cagırmak icin super kullanılır.
      this kendi classında=== super parent classtan variable ya da method cagirmayi saglar.

     */

    //constructor nasıl olusur.
    public Vehicle (){
        this(5);

        System.out.println("Vehicle1");
    }
    public  Vehicle (int price){

        System.out.println("Vehicle int parametreli");
    }
}
