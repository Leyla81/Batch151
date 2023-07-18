package ssg.multi_dimentionalArray;

import java.util.Arrays;

public class C05_mda {
    public static void main(String[] args) {

        /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
                int sayilar1[] = {1, 2, 4, 5, 7, 8};
                System.out.println(sayilar1[sayilar1.length - 1]);//yukarıdaki array in son elemanını yazdırır ==8

                int sayilar[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
                System.out.println(Arrays.toString(sayilar[sayilar.length - 1]));//dıs array in son indexini alırım [6, 7, 8]
                System.out.println(sayilar[sayilar.length - 1][2]);//dıs arraydeki son indexin icindeki ikin ci indexteki elemanı verir===8

                int carpim = 1;

                for (int i = 0; i < sayilar.length; i++) {
                    for (int j = 0; j < sayilar[i].length; j++) {
                        if (j == sayilar[i].length - 1) {
                            carpim *= sayilar[i][j];
                        }
                    }
                }
                System.out.println(carpim);
            }
        }
