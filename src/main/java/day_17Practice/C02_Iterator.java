package day_17Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C02_Iterator {
    /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(st);

        Iterator itr = st.iterator();  // set'lerde index yapısı yoktur. Bu sebeple iterator kullanılır.
        // List haric hicbir collections uyesinde index yapısı yoktur.


        while (itr.hasNext()){ // yanında eleman var mı kontrol ediyorum
            // varsa true, yoksa false dondurecek
            // true oldugu muddetce while dongusu devam edecek


            Object sayi =itr.next();

            if((Integer) sayi%2==0){
                itr.remove();
            }


            System.out.println(st);



        }




    }


}
