package advancedpracticeSule.day04;


import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {
        start();


    }//main

    private static void start() {

        Scanner input = new Scanner(System.in);
        boolean isFail;//boolean ı default olarak olusturduk.bilgileri hatali girmesi durumu icin
        do {

            isFail=false;
            System.out.println("lutfen tarife donemini giriniz\n1==>haziran 2023\n2==>aralık 2023");
            int term = input.nextInt();

            if (term == 1 || term == 2) {

                Arac araba = new Arac();//arac objesi olusturduk
                //arac clasında bilgileri cagırmak icin

                System.out.println("lutfen arac tipini giriniz");
                araba.type = input.next().toLowerCase();
                araba.prim = araba.countPrim(term);

                int sellect;//tamamMı variable

                String termName = term == 1 ? "Haziran 2023" : "aralık 2023";//ternary

                if (araba.prim > 0) {
                    System.out.println("hesaplama basarıyla tamamlandı");
                    System.out.println("Arac tipi =" + araba.type);
                    System.out.println("Tarife donemi = " + termName);
                    System.out.println("aracınıxın sigorta prim odemesi =" + araba.prim);
                    System.out.println("yeni islem icin ===>1\n cıkmak icin==< 0 basınız");

                    sellect = input.nextInt();//tamam mi devam mi
                    if (sellect == 1) {
                        isFail = true;
                    } else { //sellect in else i
                        isFail = false;
                    }
                } else {//araba.prim if inin else i
                    System.out.println("Hesaplama basarısız");
                    System.out.println("yeni islem icin ===>1\n cıkmak icin==< 0 basınız");
                    sellect = input.nextInt();
                    if (sellect == 1) {
                        isFail = true;
                    }
                }

            } else {
                System.out.println("hatalı giris");
                isFail = true;//tekrar donembilmesi icin koyduk
            }

        }while (isFail);















    }
}
