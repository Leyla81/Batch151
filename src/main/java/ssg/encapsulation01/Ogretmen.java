package ssg.encapsulation01;

public class Ogretmen {
    /*encapsulation yapilan isin daha anlasilir olmasi icinde kullanilir
     */
    private String isim;
    private String brans;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    private String soyIsim;

}
