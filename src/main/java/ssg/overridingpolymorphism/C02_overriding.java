package ssg.overridingpolymorphism;

public class C02_overriding extends C01_overriding {
    public String str="childdaki String calisti";
    public void yazdir(){
        System.out.println("childdaki method calisti");
    }

    public static void main(String[] args) {
        C02_overriding obje=new C02_overriding();
        System.out.println(obje.str);//childdaki String calisti
        obje.yazdir();//childdaki method calisti
        C01_overriding obje1=new C02_overriding();
        System.out.println(obje1.str);//parenttaki String
        obje1.yazdir();//childdaki method calisti
        C01_overriding obje2=new C01_overriding();
        System.out.println(obje2.str);//parenttaki String
        obje2.yazdir();//parenttaki method calisti

    }
}
