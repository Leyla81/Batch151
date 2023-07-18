package day38Enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {

        //Verilen listedeki her elemanı 3 artıran methodu yazınız

        List<Integer> list =new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);

        ListIterator itr =list.listIterator();//iterator objesiyle imlec list in basına gelir
        while(itr.hasNext()){
            Object sayi =itr.next();
            itr.set((Integer)sayi+3);//degişiklik varsa set() methodu kullanılır.
        }
        System.out.println(list);//[8, 12, 5, 4, 20, 6]

    }
}
