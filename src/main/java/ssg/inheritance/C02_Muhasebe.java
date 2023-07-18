package ssg.inheritance;

public class C02_Muhasebe extends C01_IK {
    protected int saatUcreti;
    protected int calismaSaati;
    protected int kacGunCalisti;
    protected int maas;
    protected int maasHesapla(){
        maas=saatUcreti*calismaSaati*kacGunCalisti;
        return maas;
    }
}
