package javaDers.day04MemoryKullanimiWrapperClass;

public class C04_MantıkOperatorleri {

    public static void main(String[] args) {

    /*    ***** javada islem yaptıran
    * ==     matematikteki esittir
    * !=      esit degildir
    * <       kucuktur
    * >       buyuktur
    * =       assignment operator
    * &&       and operator (perfectionist) true ya da false dondurur)
    * ||        or operator
    * */

        //cift && operatoru kodu tamamına bakmadan ilk gordügü False degerinde False dondurur
        // bu yuzden hızlı calısır.
        // tek & operatotu butun satırı taradıktan sonra ilk False gorse bile tum satırı tarar. bu yuzden calısması uzun zaman alır.
        System.out.println(5+2==8);

        boolean sonuc1 = 5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println("sonuc1 = " + sonuc1); //true

        int sayi1=15;
        System.out.println(10<sayi1||sayi1<20);

        int sayi2=5;
        System.out.println(sayi2<10||sayi2>20);

        short a=1000;
        System.out.println(a<15000|| a>28000||a<-23);


        System.out.println(a<=1000&&a==1000&&a<12);




    }

}
