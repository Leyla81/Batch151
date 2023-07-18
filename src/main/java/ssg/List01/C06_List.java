package ssg.List01;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    //bir listedeki ortalamanın ustunde olan element sayısını bulunuz.
    public static void main(String[] args) {

        List<Double> sayilar=new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(4.5);
        sayilar.add(5.4);
        sayilar.add(6.2);
        sayilar.add(10.5);
        sayilar.add(1.1);
        sayilar.add(5.6);

        double toplam =0.0;
        double ortalama = 0.0;
        for (int i = 0; i < sayilar.size() ; i++) {
            toplam+= sayilar.get(i);

        }
        System.out.println(toplam);
        ortalama= toplam/sayilar.size();
        System.out.println(ortalama);

        int counter=0;

        for (int i = 0; i <sayilar.size() ; i++) {
            if(sayilar.get(i)>ortalama){
                counter++;
            }

        }
        System.out.println(counter);










    }
}
