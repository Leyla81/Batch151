package sulymanNightTime.day29collectionsSuleymanHoca;

import java.util.LinkedList;

public class LinkedList01 {

      /*
      note= arrayListler eleman silme ve eklemede tekrar index kullanmak zorunda oldukları icin
      eleman ekleme ve silmede basarısızdırlar.Java bproblemi LinkedList ile cozmüstur.
      cunku index kullanmazlar.Ama Arraylistler index kullanarak eleman bulmada basarılidırlar.
      Note:
           LinkedListlerde en bastaki elemandan daha once "Head" eleman vardir. Son eleman'a "Tail" denir en sonda
             oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune "point", on yuzune
           ornegimize gore harf olan kismina "Data" denir. Node, Data ve Point'den olusuyor.
              Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.

      1)"LinkedList"ler node silme ve eklemede cok basarılı oldukları icin ekleme
       ve silme islemlerini coklukla yapacagınız zamanlar "LinkedList" kullanırız
       2) LinkedList ler node ekleme ve silme islemleri yaparken sadece pointer ları degistirirler
       3) Arraylistler index kullanarak eleman bulmada basarılidırlar.
       Note= ihtiyacınız olan collection cogunlukla ekleme ve silme islemi yapacaksa LinkedList ,
       search (eleman arama)yapacaksa ArrayList kullanılır
       */
      public static void main(String[] args) {

          LinkedList<String>s=new LinkedList<>();
          s.add("Esra");
          s.add("Steve");
          s.add("Ajda");
          s.add("Muge");
          s.add("Cuneyt");
          s.add("Esra");

          s.add(2,"Esen");//verilen indexe ekler
          s.addFirst("Kemal");//ilk sıraya ekler
          s.addLast("Ajdar");//sona ekler


          System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

          //s.remove(2);//2.indexi siler
          System.out.println(s);

          //s.remove("Ajdar");
          System.out.println(s);

          //s.remove();//ilk elemanı siler
          System.out.println(s);

          //s.removeFirstOccurrence("Esra");//ilk gorunen esrayı siler
          System.out.println(s);

          //s.removeLastOccurrence("Esra");//son esrayı siler
          System.out.println(s);

         String r1= s.peek();// ilk elemanı alir ama silmez (copy-paste)
          System.out.println(r1);
          System.out.println(s);

         String r2= s.poll();//ilk elemanı alır ve siler(cut-paste)
          System.out.println(r2);
          System.out.println(s);

          String r3 = s.element();// ilk elemanı silmeden size verir(copy-paste)
          System.out.println(r3);
          //"peek()" ile "element()" her ikisi de ilk elemanı silmeden  size verir.
          // Farklari peek() liste bos oldugunda "null" verir. "element()" ise liste bos oldugunda "hata" verir

         String r4 = s.pop();//"removeFirst()" ile aynı isi yapar
          System.out.println(r4);
          //"poll()" ile "pop()" her ikisi de ilk elemanı siler ve  size verir.
          // Farklari poll() liste bos oldugunda "null" verir. "pop()" ise liste bos oldugunda "hata" verir









    }
}
