package day_17Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    public static void main(String[] args) {


        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        // int arr[]={1,2,2,3,4,4,5};

        int arr[]={1,2,2,3,4,4,5};
        System.out.println(Arrays.toString(benzersizYap(arr)));


    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> tekrarsızSet = new TreeSet<>();
        //"Set" unique dır ve index yapısı yok for loop kullanamam ama forEach kullanırız

        for (int each :arr) {
            tekrarsızSet.add(each);
        }
        System.out.println(tekrarsızSet);


        int arr2[]=new  int[tekrarsızSet.size()];
        int idx=0;

        for (Integer each :tekrarsızSet) {
            arr2[idx]=each;
            idx++;

        }
        System.out.println(Arrays.toString(arr2));

             arr=arr2;

             return arr;
    }


}
