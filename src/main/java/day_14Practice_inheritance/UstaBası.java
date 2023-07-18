package day_14Practice_inheritance;

public class UstaBası extends Isci {

    @Override
    public String toString() {   //hepsini yazdırmak icin override ettik
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    public static void main(String[] args) {
        UstaBası ustabasi1 = new UstaBası();
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.saatUcreti=15;
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1.isim); // Murat
        System.out.println(ustabasi1.soyisim); // Gokcek
        System.out.println(ustabasi1.toString());
        ustabasi1.mesai(); // Isciler gunluk 8 saat ve haftada 5 gun calısır
    }
}
