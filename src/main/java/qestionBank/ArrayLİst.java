package qestionBank;

import java.util.ArrayList;

public class ArrayLİst {

//1.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "A" );
        list.add( "B" );
        list.add( "F" );
        list.add( "D" );

/*
Which one is true for the given code snippet?
A) list.set( 2, "C" );
System.out.println(list);
Prints [A, B, C, D] on the console
B) list.add(1,"*");
System.out.println(list);
Prints [*, A, B, C, D] on the console
C) System.out.println(list.contains("F"));
Prints false on the console
D) System.out.println(list.isEmpty());
Prints true on the console
 */
        ArrayList<String> list1 = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));

//question 7
        ArrayList<Character> list2 = new ArrayList<Character>();
        for (char i = 'a'; i <= 'e' ; i++) {
            list.clear();
            list.add(String.valueOf(i));
        }
        System.out.println("list" +list);

//question 4
        ArrayList<String> list3 = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }











    }



}
