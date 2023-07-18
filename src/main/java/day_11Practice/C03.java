package day_11Practice;

public class C03 {
    int price =300000;
    int year=2023;
    String make = "opel";

    public C03(int price, int year, String make) {
        this.price=price;
        this.year=year;
        this.make=make;

    }

    public C03() {

    }

    //yukarıdakı instance variable obje ile cagırılabilirler
    public static void main(String[] args) {

        C03 obj1 = new C03();
        System.out.println(obj1.price);
        System.out.println(obj1.year-3);
        System.out.println(obj1.make.replace("opel","mercedes"));

        C03 obj2 = new C03(500000,2021,"citroen");
        System.out.println(obj2.price+" , " + obj2.year +" , "+obj2.make);


    }



}
