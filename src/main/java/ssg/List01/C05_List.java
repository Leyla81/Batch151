package ssg.List01;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
        //verilen bir string de  tekrar eden sayıları sadece 1 tane yapan bir method olusturun
        //orn; [1,3,5,3,5,6,1,7]===>[1,3,5,6,7]


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(tekrarsızListOlusturma(sayilar));

    }


    public  static  List<Integer> tekrarsızListOlusturma (List<Integer>sayilar){
       List<Integer> tekrarsızlist = new ArrayList<>();
        for (int i = 0; i < sayilar.size() ; i++) {
            if(!tekrarsızlist.contains(sayilar.get(i))){
                tekrarsızlist.add(sayilar.get(i));
            }

        }
        return tekrarsızlist;
    }
}
