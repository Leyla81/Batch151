package ssg.inheritance;

public class C05_UstaBasi extends C03_Isci{
    public static void main(String[] args) {

        C05_UstaBasi ustaBasi = new C05_UstaBasi();
        ustaBasi.calismaSaati=18;
        ustaBasi.maasHesapla();
        System.out.println(ustaBasi.maas);


    }
    protected int maasHesapla(){
        kacGunCalisti=30;
        saatUcreti=50;
        maas=calismaSaati*kacGunCalisti*saatUcreti;
        return maas;
    }
}
