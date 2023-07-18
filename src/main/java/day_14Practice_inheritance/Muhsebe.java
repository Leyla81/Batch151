package day_14Practice_inheritance;

public class  Muhsebe extends Personel {

    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected int maasHesapla(){ //maas hesaplamak icin method olusturuldu
        int maas = saatUcreti*8*30;
        return maas;
    }

}
