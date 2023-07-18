package day34collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        Queue<String> wareHouse =new LinkedList<>(); //warehouse ambar demek
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Cheese");

        System.out.println(wareHouse);

        wareHouse.remove();
        System.out.println(wareHouse);

        wareHouse.peek();
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());
        System.out.println(wareHouse);

        wareHouse.clear();
        System.out.println(wareHouse);


    }

}
