package ssg.encapsulation01;

public class Tasıt {
    private String tasitTuru;
    private boolean muayinesiVarMi;
    private String vitesTuru;
    private int kacVites;

    public boolean isMuayinesiVarMi() {
        return muayinesiVarMi;
    }
    public void setMuayinesiVarMi(boolean muayinesiVarMi) {

        this.muayinesiVarMi = muayinesiVarMi;
    }
    public String getVitesTuru() {

        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {

        this.vitesTuru = vitesTuru;
    }

    public int getKacVites() {

        return kacVites;
    }

    public void setKacVites(int kacVites) {

        this.kacVites = kacVites;
    }

    public String getTasitTuru() {

        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {

        this.tasitTuru = tasitTuru;
    }
}
