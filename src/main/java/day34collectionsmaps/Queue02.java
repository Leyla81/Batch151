package day34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {

        Queue<String>line =new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomato");
        System.out.println(line);

 //Queue bir interface'dir. Bu yuzden constructor'ı yoktur."New" key word'unden sonra "queue" gelmez.
        // Data type ı "Queue" olan bir object olusturmak icin new key word unden sonra "linkedList" veya "PriorityQueue"
        //classları kullanılır."priorityQueue" elemanları kendi koydugu sıraya gore belirler.
        //"LinkedList "sizin koydugunuz sıraya (insertion order)gore sıralar.

        //*****Deque****
        //deque ===>double ended queue== iki ucu acık kuyruk demek
        //Deque == daki add(),ge(),peek(),poll(),remove() methodları "first" ve "last" seklinde iki uclu olarak bulunur
        Deque<String> d=new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomato");
        System.out.println(d);















    }
}
