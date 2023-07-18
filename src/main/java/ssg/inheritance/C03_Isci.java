package ssg.inheritance;

public class C03_Isci extends C02_Muhasebe {
    public static void main(String[] args) {
        C03_Isci isci=new C03_Isci();

        C03_Isci isci2=new C03_Isci();
        isci.isim="alican";
        isci.soyIsim="yılmaz";
        isci.adres="Istanbul";

        isci.maasHesapla();
        System.out.println(isci.maas);
        isci.idAtama();
        System.out.println(isci.id);
        isci2.maasHesapla();
        System.out.println(isci2.maas);
    }
    protected int maasHesapla(){

        saatUcreti=20;
        calismaSaati=8;
        kacGunCalisti=26;
        maas=calismaSaati*kacGunCalisti*saatUcreti;
        return maas;
    }

}
