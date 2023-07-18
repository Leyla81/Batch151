package day20methodOverloadingarraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList01 {
    public static void main(String[] args) {

        //Arraylist nasıl olusturulur?

        ArrayList<Integer> ages =new ArrayList<Integer>();//ArrayList"ler primitive data icermezler
        // yani "int" girdigimde hata verir

        //ArrayList console nasıl yazdırılır?
        System.out.println(ages);//==>[]

        // Arraylistlere eleman nasıl eklenir
        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9,12,10]
        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]
        ages.add(88);
        System.out.println(ages);//[9, 656, 12, 777, 10, 88]


        // List e coklu eleman nasıl eklenir? veya Liste baska bir list nasıl eklenır

        ArrayList<Integer> newAges = new ArrayList<>();// coklu elaman eklemek icin ilk once Arraylist olusturulur
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
         ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 88, 8, 9, 10] sona ekledi.
        //eger 656 dan sonraya eklemek istersek index i yazarak hareket ederiz asgıdaki gibi
        ages.addAll(2,newAges);//[9,  656,8, 9, 10, 12, 777, 10, 88, 8, 9, 10]
        System.out.println(ages);

        //ArrayListe eleman sayısı nasıl bulunur?
        //Size () methodu bir listedeki eleman sayisini bize verir

         int numOfElement = ages.size();
        System.out.println(numOfElement);


        //ArrayList te specific bir eleman nasıl alınır
        //get() methodu index kullanarak istedigimiz elemanı almaya yarar.
       int el1 = ages.get(1);//ages sedpetindeli 1. indexi alir
        System.out.println(el1);//656

        //ArrayListte specific bir eleman nasıl degistirilir

        ages.set(2,213);
        System.out.println(ages);//[9, 656, 213, 9, 10, 12, 777, 10, 88, 8, 9, 10]
        ages.set(4,353);
        System.out.println(ages);//[9, 656, 213, 9, 353, 12, 777, 10, 88, 8, 9, 10]

        //bir ArrayListteki tum elemanlar nasıl silinir
        ages.clear();
        System.out.println(ages);//hic eleman kalmaz.

        //Arraylistte specific bir elemanın olup olmadıgını nasıl anlarız.true false dondurur
       boolean r = ages.contains(656);
        System.out.println(r);

        //bir ArrayList"in bos olup olmadıgını nasıl kontrol ederiz
        boolean r1 =ages.isEmpty();
        System.out.println(r1);


        //Example 1=bir list in bos olup olamadıgını kontrol eden kodu yazınız
        ArrayList<String> names = new ArrayList<>();
        names.add("Usame");
        names.add("Fatih");
        names.add("Ali");
        names.add("Ufuk");
        //1)WAY
        if(names.size()==0){
            System.out.println("list is empty");
        }else{
            System.out.println("list has at least 1 edlement");
        }
        names.clear();

         //2 WAY(recomended)

        if(names.isEmpty()){
            System.out.println("list is empty");// true oldugu icin burası yazdırılır
        }else{
            System.out.println("list has at least 1 edlement");
        }

       // bir listin baska bir list ile aynı olup olmadıgını nasıl kontrol edebiliriz.
        // iki list olusturulmalı kıyaslamak icin equals methodu kullanılmali

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ali");
        names2.add("ufuk");

        boolean s = names1.equals(names2);
        System.out.println(s);//true dondurur

        //verilen iki integer liste tamamıyla aynı elemanların  olup olmadıgını bulan kodu yazınız

        ArrayList<Integer> nums1 = new ArrayList<>();// coklu elaman eklemek icin ilk once Arraylist olusturulur
        nums1.add(8);
        nums1.add(9);
        nums1.add(10);
        ArrayList<Integer> nums2 = new ArrayList<>();// coklu elaman eklemek icin ilk once Arraylist olusturulur
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);











    }
}
