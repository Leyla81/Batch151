package day_18Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C02_Iterator {
    public static void main(String[] args) {
         /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */
        //set lerde index yapısı yoktur collections larda sadece Listlerde index vardır

        Set<Integer> st= new TreeSet<>(Arrays.asList(1,2,3,4,5));

        Iterator itr = st.iterator();//setlerde index yapısı yoktur bu sebeple iterator kullanılır
               //for loop olusturamadıgımızdan iterior objesi olusturduk

        while(itr.hasNext()){ //yanında eleman var mı

            Object sayi = itr.next();//bu methodla uzerinden gectigi elemanı bize dondurecek
            //int koydugumuzda kızarır bu yuzden object kullandık

            if((Integer)sayi%2==0){//sayı object oldugu icin Integer olarak cast ettik Integer koymazsak kızarır.
                itr.remove();//silmek icin bu method kullanılır.

            }

        }
        System.out.println(st);










    }
}
