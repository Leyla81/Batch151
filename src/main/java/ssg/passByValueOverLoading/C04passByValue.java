package ssg.passByValueOverLoading;

import java.util.ArrayList;
import java.util.List;

public class C04passByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim iki ayri method'dan
        birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra
        kendi listemizi main method icerisinde kontrol edelim
        */
        //PASSBYVOLUE LİSTLER İLE KULLANILMAZ
        List<Integer>myList=new ArrayList<>();
        myList.add(57);
        myList.add(19);
        myList.add(34);
        System.out.println("methoddan once list : "+myList);//57,19,34
        //elemanDegistir(myList);//40,21,44,88
        // System.out.println("methoddan sonra list : "+myList);//40,21,44,88
        listDegistir(myList);
        System.out.println("methoddan sonra list : "+myList);
    }

    private static void listDegistir(List<Integer> myList) {
        List<Integer> newList=new ArrayList<>();
        newList.add(10);
        newList.add(12);
        System.out.println(newList);

    }
    private static void elemanDegistir(List<Integer> myList) {
        myList.set(0,40);
        myList.set(1,21);
        myList.set(2,44);
        myList.add(88);
        System.out.println("methodun icinde list : "+myList);

    }
        /*
birden fazla eleman iceren array ve arraylist gibi yapilarda passByValue gecerli
eger method'da array veya arrayList'in kendisi degistirilirse
passByValue ozelligi sebebiyle java degisen degeri degil array ve list'teki orjinal degeri alioydu
​
array ve list degistirilmeden icindeki degerler degistilirse java obje degismedigi icin (referans ayni)
ayni array ve listteki elemanlari bize dondurur ancak elemanlar degismis olur.
 */
}

