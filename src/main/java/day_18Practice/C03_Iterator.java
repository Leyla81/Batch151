package day_18Practice;

import java.util.*;

public class C03_Iterator {


    public static void main(String[] args) {

 /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */
        List<Integer> dq =new LinkedList<>(Arrays.asList(1,8,3,6,7));
        //Deque bir interface oldugu icin LinkedList kulllanacagiz

        System.out.println(dq);


        ListIterator itr =dq.listIterator();//deque larda index yapısı yoktur bu yuzden iterator kullanılır.

        while (itr.hasNext()){

            Object sayi= itr.next();

            if ((Integer)sayi>5){
                System.out.println(sayi+"  ");
            }
        }







    }


}
