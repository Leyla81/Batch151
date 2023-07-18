package sulymanNightTime.day31collectionsMapsSuleyman;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        //Queue<String> line=new PriorityQueue<>();//Burada LinkedListed kullanmadik. Bankalar icin LinkedListed
        //uygundur. Cunku once gelen once sira alir.
        //PriorityQueue ise belirlenen oncelige gore sira verilirse uygundur.
        //Oncelik durumu, uzunluga, ismin son harfine gore belirlenebilir. Java kendi belirledigi kurala gore dizer.

        Queue<String>line =new PriorityQueue<>();//PriorityQueue==> onceliğe gore sıralama denır.
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Tomato");
        line.add("Orange");
        System.out.println(line);

        Deque<String> d = new LinkedList<>();//"Deque"====>"double ended" iki uclu demektir.golf topu cantası iki ucu da acık
         d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Tomato");
        d.add("Orange");
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur








    }
}
