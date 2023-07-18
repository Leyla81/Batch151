package day38Enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {

      //  verilen listeyı ters cevirin

        List<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);//[1, 2, 3, 4, 5, 6]

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){
            itr.next();//imleci (iterator ) sona gondermek ve hasPrevious() methodunu kullanmak icin bu onemli
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous() + " ,");//6 ,5 ,4 ,3 ,2 ,1 ,
        }

    }
}
