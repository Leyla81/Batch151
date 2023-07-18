package day18constructorsstatickeyword;

/*
*1) constructer nasıl olusturulur
* Access Modifier +  Class İsmi + () + {}
* 2) METHOD ile CONSTRUCTOR arasındaki farklar
* ---"methot" da "return type" var "contructor"larda olmaz.
* ---Methodlar yaptıkları ise gore isimlendirilirle "constructorlar ise her zaman "class ismi" ile isimlendirilir.
* ---"method" lar bir aksiyon icin olusturulurlar "constructor" lar ise obje olusturmak icindir.
* ----"methodlar kucuk harfle baslar constructorla buyuk harfle baslar
* 3) parametreli constructor"lar olustrarak aynı class dan farklı ozelliklere sahip object"ler olusturabiliriz
* */




public class Car {//
    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
 //custom constructer

    public Car() {

    }
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //custom constructer


    public Car(String make) {
        this.make = make;
    }




    }


