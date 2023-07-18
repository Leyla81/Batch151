package Day_10Practice;

public class C01_Instance {



    int sayi;
    String name ;
    boolean IsStudent;


    public static void main(String[] args) {



   /* sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım
*/
        //note: instace variable main methodun dısında olusur
        //instace variable lar objeye baglidır.obje olusturularak cagırılırlar

        C01_Instance obj1= new C01_Instance();
        System.out.println(obj1.sayi);
        System.out.println(obj1.name);
        System.out.println(obj1.IsStudent);

        C01_Instance obj2 =new C01_Instance();
        obj1.name= "Hasan";
        obj2.name = "Huseyin";
        System.out.println(obj1.name);//hasan

        obj1.sayi =20;
        obj2.sayi =25;

        System.out.println(obj2.sayi);//25


    }










}
