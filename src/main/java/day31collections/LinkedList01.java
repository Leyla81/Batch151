package day31collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayListler eleman silmede ve eklemede index kullandıkları icin basarısızdırlar
//ArrayListler eleman "search" etmede basarılıdırlar.cunku indexe bakılarak bulunur.
        /*Bu yuzden****
        LinkedListe elemana"node" denir
        1)linkedllist index kullanmazlar ve eleman sılme ve ekleme icin yapılmıstır.
        2)"LinkedList"ler node silme ve eklemede cok basarılı oldukları icin ekleme
           ve silme islemlerini coklukla yapacagınız zamanlar "LinkedList" kullanırız
        3)"LinkedList"ler node silme ve eklemede cok basarılı oldukları icin ekleme
           ve silme islemlerini coklukla yapacagınız zamanlar "LinkedList" kullanırız
       4) LinkedListler index kullanmadıgı icin arama ve bulmada zorlanırlar
       5) LinkedList ler node ekleme ve silme islemleri yaparken sadece pointer ları degistirirler.
         */


public class LinkedList01 {
    public static void main(String[] args) {



        // ArrayListler eleman silmede ve eklemede index kullandıkları icin basarısızdırlar
        //ArrayListler eleman "search" etmede basarılıdırlar.cunku indexe bakılarak bulunur.
        /*Bu yuzden****
        LinkedListe elemana"node" denir
        1)linkedllist index kullanmazlar ve eleman sılme ve ekleme icin yapılmıstır.
        2)"LinkedList"ler node silme ve eklemede cok basarılı oldukları icin ekleme
           ve silme islemlerini coklukla yapacagınız zamanlar "LinkedList" kullanırız
        3)"LinkedList"ler node silme ve eklemede cok basarılı oldukları icin ekleme
           ve silme islemlerini coklukla yapacagınız zamanlar "LinkedList" kullanırız
       4) LinkedListler index kullanmadıgı icin arama ve bulmada zorlanırlar
       5) LinkedList ler node ekleme ve silme islemleri yaparken sadece pointer ları degistirirler.
       6) LList lerde primitive data type kullanmayız (non_primitive ve wrapper )kullanırlar.

         */
        LinkedList<String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        System.out.println(s);//[Merve, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.add(1,"Caner");
        System.out.println(s);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.addFirst("Ayse");//[ Ayse,Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]
        System.out.println(s);

        s.addLast("Enver");
        System.out.println(s);//[Ayse ,Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih,Enver]

        s.remove(2);
        System.out.println(s);//[Ayse, Merve, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        String r1 = s.peek();//ilk elemanı(node) alır ama silmez.List bossa null verir
        System.out.println(r1);
        System.out.println(s);

        String r2 = s.poll();//ilk node u silip verir.Liste bos olursa hata vermez null verir
        System.out.println(r2);
        System.out.println(s);

        String r3 = s.element();//peek() gibi ilk elemanı silmeden verir.List bossa hata verir
        System.out.println(r3);
        System.out.println(s);

        String r4 = s.pop();//poll() gibi ilk node u silip verir ama liste bos olursa hata verir
























    }

  /*

   */



















}
