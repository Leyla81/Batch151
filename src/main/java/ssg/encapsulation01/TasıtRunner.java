package ssg.encapsulation01;

public class TasıtRunner {
    public static void main(String[] args) {
    Tasıt tst1=new Tasıt();

    tst1.setTasitTuru("otomobil");
    System.out.println(tst1.getTasitTuru());

    tst1.setVitesTuru("manuel");
    tst1.setKacVites(6);
    tst1.setMuayinesiVarMi(false);

    System.out.println(tst1.getKacVites());
    System.out.println(tst1.getVitesTuru());
    System.out.println(tst1.isMuayinesiVarMi());

}

}
