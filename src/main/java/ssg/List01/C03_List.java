package ssg.List01;

import java.util.ArrayList;
import java.util.List;

public class C03_List {


    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(36);
        numbers.add(42);
        numbers.add(64);
        numbers.add(21);

        int sum = 0;

        for (Integer a :numbers) {
            sum += a;

        }
        System.out.println(sum);
















    }


}
