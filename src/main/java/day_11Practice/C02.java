package day_11Practice;

public class C02 {

    String name ;
    int age;
    String telefon ;

    public C02(String name, int age ,String telefon){
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {


      C02 obj1 = new C02("burak",32,"0246") ;
        System.out.println(obj1.name+ " , " +obj1.age+ " , " + obj1.telefon);//burak, 32 ,null
        // "this" ile telefon  atama yapmadıgımız icin null verdi



    }





}
