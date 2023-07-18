package day21arraylists;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]
          //*******remove*************
        //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
        //remove() methodu bir elemanın ilk gorunumunu siler
        cities.remove("Miami");
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat] ilk miami yi sildi

        cities.remove(2);//Belirtilen indexleri siler. Barcelona yı siler.
        System.out.println(cities);

        //Example 1 = Bir Integer List olusturun ve 12 elamanını silinız
        //Arraylist olustururken sag tarafa (constructor) Arraylist yazmak zorundasınız

        ArrayList<Integer>ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //1. yol
        Integer nonPrimitive =12;
        ages.remove(nonPrimitive);
        System.out.println(ages);

        //2. yol recommended autoboxing
        ages.remove((Integer)12);
        System.out.println(ages);
                 //**********list .of()**************
       //Kisa yoldan bir list olusturmak icin List.of() methodunun kullanabiliriz
        //List.of methodu degistirilemez bir liste olusturmak icin kullanilir
        //bu method ile olusturulan list degistirmeye yonelik methodlari desteklemez

        List<Character> initials = List.of('a','b','a','c','d','a');
        System.out.println(initials);//[a, b, c, d]
        // initials.add('e');
        //initials.remove(0);
        //initials.set(0,'u');
        System.out.println(initials);//[a, b, c, d]

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun indexini verir
        int r1= initials.indexOf('c');
        System.out.println(r1);

        //lastIndexOf() methodu aranan karakterin son gorunumunun indexini verir.
        int r2 =initials.lastIndexOf('a');
        System.out.println(r2);

        // Example= bir listteki tekrarsız elemanları console yazdırınız


       List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for (Double w: prices) {
            if(prices.indexOf(w)==prices.lastIndexOf(w)){

                System.out.println(w+" ");//3.75,4.0
            }
        }

       //Example = bir list te tekrarlı eleman olup plmadıgını gosteren kodu yazınız.

       List<Integer> heights = List.of(3,13,3);

        int counter=0;

        for (Integer w :heights) {
            if(prices.indexOf(w)!=prices.lastIndexOf(w)) {
            counter++;

            System.out.println(w + " ");
        }
        }
      if (counter==0){
          System.out.println("All elements are unique in the list");
      }else{
          System.out.println("At least one element is not unique in the list");
      }












    }


}
