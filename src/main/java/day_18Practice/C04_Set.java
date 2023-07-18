package day_18Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,4,5};
        benzersizYap(arr);
    }

    private static void benzersizYap(int[]arr) {

        Set<Integer> tekrarsızSet = new TreeSet<>();

        //setlerde index olmadıgı icin forEach kullandık
        for (int each :arr) {
            tekrarsızSet.add(each);//set zaten tekrarsız oldugu icin tüm elemanları direk yazdırdık
        }
        System.out.println(tekrarsızSet);

        int arr2[] =new  int[tekrarsızSet.size()];//ikinci bir array olusturup tekrarsız setteki elemanları aktarmamız gerekiyor

        int idx =0;//index belirtmek gerektiğinden kendimiz bir index assign ettik
        for (Integer each:tekrarsızSet) {
            arr2[idx] = each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));

        }

    }



