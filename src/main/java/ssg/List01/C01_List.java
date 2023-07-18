package ssg.List01;

import java.util.ArrayList;
import java.util.List;

public class C01_List {


    public static void main(String[] args) {
        List<Integer>mylist = new ArrayList<>();
                mylist.add(15);
                mylist.add(30);
                mylist.add(40);
        System.out.println(mylist);

        mylist.add(2,27);//2. index e 27 ekledik
        System.out.println(mylist);




    }
}
