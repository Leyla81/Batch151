package ssg.encapsulation01;

public class Araba {
    private String marka="Honda";
    String model="model belirtilmedi";
    private String yakitturu="benzin";

    public String getYakitturu() {

        return yakitturu;
    }

    public void setYakitturu(String yakitturu) {

        this.yakitturu = yakitturu;
    }

    public String getMarka() {
        return marka;
    }
}
