package day17MultiDimensionalArraysMehmetHoca;

import java.util.Arrays;

public class MultiDimensionalArra01 {

    public static void main(String[] args) {

//MultiDimensionalArray de 2 koseli parantez konur==>"a[][] seklinde
       // "a" ya en yakın parentez outer Array index'ini 2. parentez inner array'in indexini gosterir
        //mesela ==>a[][] [ [5,12][51,45][123,0] ]
                 //==> a[0][1] ==> 12 yi verir a[1][1]===>45 verir

        //multidimensional array nasıl olusturulur.
        int a[][]=new int [3][2];

        //multidimensional array'lere eleman nasıl eklenir

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[1][0]=81;
        a[2][1]=0;
        a[0][1]=12;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]
        //toString methodu tek duvarı astıgından
        // multidimensiomal Arrayde deepToStrin ()methodunu kullanırız
        //multidimensional array'leri console yazdırmak icin deepToString()methodunu kullanırız

      //multidimensional arrayde specific bir eleman nasıl yazdırılır
        System.out.println(a[1][1]);//45

//multidimensional Array icinden array nasıl alınıp yazdırılır
        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(Arrays.toString(a[1]));//[81,45]

        //kısa yolda multidimensional Array nasıl olusur

        String students [][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};//data type string Array yaniString[]
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum =0;//bos kutu

        for(String[] w :students){

            sum=sum +w.length;

        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

      //{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}}NESTED LOOP
        for(String[] w : students){
            for(String k: w){

                if (k.contains("m")){

                    System.out.println(k);
                }
            }
        }
















    }
}
