package ssg.encapsulation01;

public class Okul {
    private String okulIsmi="TechPro";
    private String mudur="ahmet";
    int ogrenciSayisi=1500;
    private int sinifSayisi=100;

    public int getOgrenciSayisi() {

        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(
            int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getOgretmenSayisi() {

        return ogretmenSayisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {

        this.ogretmenSayisi = ogretmenSayisi;
    }

    public int getSinifSayisi() {

        return sinifSayisi;
    }

    int ogretmenSayisi=37;
    private int mudurYardimcisi=3;

    public String getOkulIsmi() {

        return okulIsmi;
    }

    public void setOkulIsmi(String okulIsmi) {

        this.okulIsmi = okulIsmi;
    }

    public String getMudur() {
        return mudur;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public int getMudurYardimcisi() {
        return mudurYardimcisi;
    }

    public void setMudurYardimcisi(int mudurYardimcisi) {
        this.mudurYardimcisi = mudurYardimcisi;
    }
}
