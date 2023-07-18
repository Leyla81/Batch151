package introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {


        //object nasıl ousturulur
        //class ismi + object ismi  +atama operatoru + "new"  +Constructor

        Car  myCar = new Car ();

        //  "new" keywordu sifirdan yeni bir obje olusturmak icin kullanılır
        // constructor javada nesneleri olusturmak icin kullanılan bir methoddur
        // constructor olmazsa yeni obje uretilmez

        System.out.println(myCar. fiyat);

        System.out.println("myCar.model =" + myCar.model);

        myCar.hareket();
        myCar.dur();
        //car class ında  hareket ve dur u system out olarak yazdıgımız icin tekrar yapmaya gerek yok

        Student tomHanks = new Student();

        System.out.println("tomHanks.name= " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();




    }



}
