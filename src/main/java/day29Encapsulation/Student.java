package day29Encapsulation;

public class Student {

    //Encapsulation ===> kelime anlamı itibari ie kapsulleme demektir
    //encapsulation data hiding (==>veri saklamak)
    //data nasıl saklanır
    //access modifier i private yaparak datayı diger classlardan gorunmez hale getiririm . boylece datayi saklarım
    //String stdId ="AC2023102T";
    private String stdId ="Ac2023102T";//yukarıdaki strıngi private yaparak encapsulation yapmıs olduk

    public int age =19;

    private double notOrt = 3.53;
    private  boolean succesful = false ;

    //Encapsulation yaptıgımız datayı istersek diger classlarda okuya biliriz n
    //*****Nasıl okuruz????*******
    //"get methodu" olusturarak encapsulate edilmis datanın degerini okuyabiliriz
   //"get method"lar "public" olur
    //"get methodun return yype i okudugu variable i return typr ile aynı olur


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
    //"get methodu" boolean ile kullanılırsa basına get gelmez "is succesful"

    /*
    Encaapsulatıon yaptıgımız datayı istersek diger classlardan degistirebiliriz
    *****Nasıl degistirebiliriz?
    "set method "olusturarak Encapsulate ettigimiz datanın degerini degistirebiliriz
     a)set methodlar her zaman "public" olur
     b)set method lerın "return type"i her zaman "void" olur cunku veri return etmez
     c)set method parametre kullanır parametrenin data type i variable ile aynı olmak zorundadır

      ====>  set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir
        object'mis gibi kullanabliriz

        get methodlarin diger adi "getter", set methodlarin diger adi "setter" dir.



     */
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
