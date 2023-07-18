package day38Enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Qb_Deneme {
    public static void main(String args[]){

    List<String> list = new ArrayList<>();
    list.add("AB");
    list.add("CD");
    list.add("EF");
    ListIterator<String> it = list.listIterator();
    if(it.previousIndex()!=-1) {
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }else {
        System.out.println("Good Morning!");//Good Morning!
    }
        System.out.println("----------------------------");

        List<String> list1 = new ArrayList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
      int idx1= 0;
        for(String w : list1) {

             w= w + "!";
            System.out.print(w +" ");
            list1.set(idx1,w);
            idx1++;
        }
        System.out.println("list1 " +list1);
        System.out.println("------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(23);
        list2.add(24);
        ListIterator<Integer> it1 = list2.listIterator();
        while(it1.hasNext()) {
            it1.next();
        }
        while(it1.hasPrevious()) {
            Integer el = it1.previous();
            it1.set(el = el + 3);
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.add(12);
        list3.add(13);
        list3.add(14);
        list3.add(15);
        list3.add(16);
        System.out.println(list3);
        ListIterator<Integer> it2 = list3.listIterator();
        int idx = 0;
        while(it2.hasNext()) {
            Integer el = it2.next();
            if(idx>2) {
                break;
            }
            it2.set(el = el*2);
            System.out.print(el + " ");
            idx++;
        }


}
}
