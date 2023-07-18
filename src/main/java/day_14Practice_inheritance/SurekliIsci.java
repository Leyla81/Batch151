package day_14Practice_inheritance;

public class SurekliIsci extends Isci{
    @Override
    public String toString() {
        return "SurekliIsci{" +
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
        SurekliIsci surIc1 = new SurekliIsci();
        surIc1.persNo=5001; // personel classından aldı
        surIc1.isim="Cem";  // personel classından aldı
        surIc1.soyisim="Oz"; // personel classından aldı
        surIc1.statu="Isci"; // muhasebe classından aldı
        surIc1.saatUcreti=11; // muhasebe classından aldı
        surIc1.maas=surIc1.maasHesapla(); // muhasebe classından aldı
        System.out.println(surIc1.persNo); // 5001
        System.out.println(surIc1.isim); // Cem
        System.out.println(surIc1.toString());//tamamını yazdırmak icin toString ()metodu generate yaparak kullanılır
    }
}
