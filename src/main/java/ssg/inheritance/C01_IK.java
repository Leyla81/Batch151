package ssg.inheritance;

public class C01_IK {
    public static int sayac=100;
    protected int id;
    protected String isim;
    protected String soyIsim;
    protected String adres;
    protected String tel;

    public int idAtama(){
        id=sayac;
        sayac++;
        return id;
    }
}
