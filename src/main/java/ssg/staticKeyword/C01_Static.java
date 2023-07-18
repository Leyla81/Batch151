package ssg.staticKeyword;

public class C01_Static {
    /*
     soru 1)bir static birde non-static(instance) variable olusturun
     ve arasindaki farklari inceleyin
     */
    static int sayi=15;
    int rakam=8;
    public static void main(String[] args) {

        System.out.println(sayi);//15   sayi static oldugu icin direkt cagırdık

        C01_Static obj1=new C01_Static();
        System.out.println(obj1.rakam);//8
        obj1.rakam=3;
        obj1.sayi=28;
        System.out.println(obj1.rakam);//3
        System.out.println(obj1.sayi);//28
        C01_Static obj2=new C01_Static();
        System.out.println(obj2.rakam);//8
        System.out.println(obj2.sayi);//28

    }

}

