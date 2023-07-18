package ssg.scope;

public class C01_Scope {
    int yas=15;// main dısında olusturuldugu icin instance variable main icinden cagırılabilir
    static String isim="Ahmet Furkan";//statik olanlar her yerde cagırılırlarStatic olmayanlar obje ile cagrılır

    public static void main(String[] args) {
        C01_Scope obje=new C01_Scope();//class ismiyle obje olusturduk
        int sira=5;
        System.out.println(obje.yas);
        System.out.println(sira);
        System.out.println(isim);
        obje.yazdir();
        {
            int x=20;
            System.out.println(x);
            System.out.println(sira);
        }

    }
    public void yazdir(){
        System.out.println(yas);
        System.out.println(isim);
    }
}















