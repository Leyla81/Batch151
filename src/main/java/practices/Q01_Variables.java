package practices;

public class Q01_Variables {
    public static void main(String[] args) {
        int age = 32;
        int number = 55;
        String isim ="Ali";

        System.out.println(age);
        System.out.println("number ="+number);

        int hisAge =age;
        System.out.println("hisAge="+hisAge);

        String onunIsmi = isim;
        System.out.println("onunIsmi="+onunIsmi);

        int year = 2022, mount=3, day =15;
        System.out.println("day =" + day);
        System.out.println("year ="+ year);

        year =2023;
        System.out.println("year = " + year);

        year = year+5;
        System.out.println("year =" + year);


        // bir variable deklere et:x
        double x;
        //bir variable başlat: y
        double y =100.543;
        //başka bir variable başlat:z
        double z = 43;
        //x degişkeni y degiskeni ile baslat
        x = y ;
        // variable guncelle
         x= 3.14;
         // degişkenleri yazdır
        System.out.println("x =" + x);
        System.out.println("y ="+ y);
        System.out.println("z ="+ z);
    }






}
