package ssg.inheritance;

public class C04_memur extends C02_Muhasebe {

    public static void main(String[] args) {

        C04_memur memur1=new C04_memur();
        memur1.calismaSaati=12;
        memur1.saatUcreti=30;
        memur1.kacGunCalisti=15;
        memur1.maasHesapla();
        System.out.println(memur1.maas);

    }
}
