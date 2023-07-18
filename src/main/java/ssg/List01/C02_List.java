package ssg.List01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        //bir list olusturun ve bu listeki elemanları alfabetik sıraya koyan kod

        List<String> cities = new ArrayList<>();
        cities.add("mersin");
        cities.add("amasya");
        cities.add("Ankara");
        cities.add("İzmir");

        System.out.println(cities);

        Collections.sort(cities);//list lerde collections metodu ile sıralayabiliriz







    }
}
