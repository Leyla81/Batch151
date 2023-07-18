package day_01Practice;

public class BasamaklaraAyirma {

    public static void main(String[] args) {


     // 12345 sayısını rakamları toplamını bulunuz
        int x =12345;

        int birler=x%10;// x sayısının birler basamagını verir.
        int onlar=(x/10)%10;//x=12345 bolu 10--sonuc :1234 olur modulus ile de 4 alırım
        int yuzler=(x/100)%10;//x=12345 bolu 100----sonuc:123 olur modulus ile de 3 alınır
        int binler=(x/1000)%10;//
        int onBinler=(x/10000)%10;
        System.out.println(birler+onlar+yuzler+binler+onBinler);






    }

}
