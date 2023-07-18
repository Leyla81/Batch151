package ssg.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
//list yapılma sekillleri
        LinkedList<Integer>ll1= new LinkedList<>();
        List<Integer>ll2= new LinkedList<>();
        Queue<Integer> ll3= new LinkedList<>();
        Deque<Integer> ll4= new LinkedList<>();
       //list elemanı istedigimiz yere ekler 2 tane add mthodu vardır
        ll2.add(57);
        ll2.add(19);
        ll2.add(28);
        ll2.add(1,3);
       //tek add metodu vardır sadece sona ekler
        ll3.add(57);
        ll3.add(18);
        ll3.add(29);
        ll3.add(3);
    }
}
