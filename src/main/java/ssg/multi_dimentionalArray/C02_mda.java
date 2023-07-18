package ssg.multi_dimentionalArray;

public class C02_mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        String isimler[][]={{"Ali","Veli","Can","Ahmet"},{"Azra","Umut","Ayse","Zehra"},{"Ankara","Mardin"}};

        elementYazdir(isimler);//method olusturarak isim yazdırma.

    }

    public static void elementYazdir(String[][] isimler) {
        //1.yol
        for (String[]w:isimler) {

            for (String a:w) {
                System.out.println(a);
            }
            System.out.println("--------------------------------------");

        }

      //  2.yol
        for (int i = 0; i < isimler.length ; i++) {
            for (int j = 0; j <isimler[i].length ; j++) {
                System.out.println(isimler[i][j]);

            }

        }

    }
}
