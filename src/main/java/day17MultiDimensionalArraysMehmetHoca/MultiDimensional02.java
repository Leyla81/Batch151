package day17MultiDimensionalArraysMehmetHoca;

import java.util.Arrays;

public class MultiDimensional02 {

    public static void main(String[] args) {

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }
        //1 step :ilk once 2 boyutlu array deki eleman sayısını dinamik olarak bulan kodu yazmalıyız

        int toplamElemanSayısı =0;
        for (int [] w: numbers) {  //int array kullanmalıyız.numbers sepetindekileri "w" sepetine assign ettik
           toplamElemanSayısı= toplamElemanSayısı+ w.length;

        }
        System.out.println("toplam Eleman Sayısı");

        // 2. Step tek boyutlu arrayı elde etttigimiz eleman sayısı kullanarak olusturalım
        int newArr [] =new int[toplamElemanSayısı];//===>[0,0,0,0,0] yeni bir array olusturduk ki sayıları tektek yukleyecegiz.

        //2 boyutlu  Arraydeki elemanları tek boyutlu Arra "e transfer edelim.
        int index = 0;
        for (int[] w:numbers) {// yukarıdaki number sepetindeki {5,4}'ü "w" sepetine koydu
            for (int k :w ) {   //burda ise "w" icindeki {5,4}'ü "k" sepetine aktarır
                newArr[index]=k;//burda "k" sepetindeki 5 ve 4 u newArr e aktarır.Asagı gidip bir artırıp diger sayıları almak icin dongu basa doner
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];//burda  15 var cunku onun indexi
        int big = ages[0][0];

        for (int[] w : ages ) { //1. duvarı yıkmak icin "ages arrayindeki ilk arrayi alıp "w" koyar {15,4}
            for (int k:  w ) {  //2. duvarı yıkmak icin
               small= Math.min(small,k); // sayının kucuk olanını verir==> 4
                big = Math.max(big,k); //buyuk olanı verir
            }
        }
        System.out.println(small+big);//toplamlarını verir









    }
}
