package day_8Practice;

public class C02_IncrementDecrement {
    public static void main(String[] args) {


     int a =15;
     int b=a++;
        System.out.println(b);//15 verir
        System.out.println(a);//16 verir

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2=sayi1++;
        System.out.println(sayi2);//10 verir
        System.out.println(sayi1);//11 verir


        sayi3 =++sayi1;
        System.out.println(sayi3);//12 verir
        System.out.println(sayi1);//12 verir

        System.out.println(sayi3++);//12 verir "+"isareti sonda oldugu icin sonradan gorur gormeden yazdırır sonra artırır
        System.out.println(sayi3);//13 verir

        System.out.println(--sayi2);//9 verir

        sayi2++;
        System.out.println(sayi2);//10 verir

        System.out.println(sayi2--);//10 verir
        System.out.println(sayi2);//9 verir

       System.out.println(sayi3++);//13
       System.out.println(sayi3);//14

















    }
}
