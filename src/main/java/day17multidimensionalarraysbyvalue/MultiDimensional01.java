package day17multidimensionalarraysbyvalue;

import java.util.Arrays;

public class MultiDimensional01 {


    public static void main(String[] args) {


        // bazen arrray in icine Array koyarlar.
        //[     [5,2] , [ 11,23 ] , [38,41 ]     ]

//1)bir arrayin elemanları da array olursa bu tarz array"lere "multidimensial Array denir

        //multidimensional Array nasıl olusturulur.
        String names [][]=new String[3][2];
        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        //"multidimensial Array" leri console yazdirmak icin "toStrin()methodu degil "deepToString () methodu kullanırız.
        System.out.println(Arrays.deepToString(names));//[[A;K][P,M][C,Z]]

        //multidimensional Array içinden specific bir eleman nasıl yazdırılır.
        System.out.println(names[1][1]);

        //multidimensional Array içinden bir array"i yazdırmak
        System.out.println(Arrays.toString(names[0]));//[A,K]
        System.out.println(Arrays.toString(names[1]));//[P,M]




    }
}
