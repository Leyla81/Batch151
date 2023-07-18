package sulymanNightTime.day30CollectionsSuleyman;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
   /* 1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir
            2)3 tane Set Class vardir bunlardan birinicisi
    i)HashSet Class:
            "Hash" benzersiz id olusturma teknigidir, bu teknige "Hashing Technique" denir
            "hashSet" elemanları rastgele sıralar
            "hashSet" elemanları sıralamadıgından hızlı calısır
            "hashSetler "null"ı eleman olrak kabul eder
            "hashSet" tekrarsız oldugu icin bir tane "null" koyar sadece
    ii)LinkedHashSet Class:
          "LinkedHashSet"ler elemanları sizin berdiginiz sıraya gore dizdiginden(insrtion order) hashSet"lerden  daha yavastır
           "LinkedHashSet"ler tekrarsiz eleman(unique) depolamak icin kullanilir
    iii)TreeSet Class:
     "treeSet"ler elemanları "natural order" a gore sıralarlar
     bu yuzden coooook yavastırlar
     en yavas set "treeSet"lerdir

    */
   public static void main(String[] args) {

       HashSet<String>hs = new HashSet<>();
       hs.add("Ajda");
       hs.add("Cuneyt");
       hs.add("Esra");
       hs.add("Zeki");
       hs.add("Ezel");
       hs.add("Ezel");//tekrarlı eleman eleman ekledigimizde hata vermez ama tekrarlı elemanı bir kere yazdırır
       hs.add(null);// degeri sıfırdır. en basta yazdırır
       System.out.println(hs);//[Zeki, Ajda, Cuneyt, Esra, Ezel]sıralamayı istedigi gibi yapar.
       System.out.println(hs.hashCode());//2038751948

       LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
       lhs.add(234);
       lhs.add(87);
       lhs.add(-32);
       lhs.add(124);

       System.out.println(lhs);//[234, 87, -32, 124]

       LinkedHashSet<Integer>ls = new LinkedHashSet<>();
       ls.add(451);
       ls.add(87);
       ls.add(231);
       ls.add(124);
       System.out.println(ls);//[451, 87, 231, 124]

       //******retainAll*******ilk linkedHashSet"teki farkli elemanlari siler

       lhs.retainAll(ls);
       System.out.println(lhs);//[87, 124]ilk linkedHashSetteki farklı elemanları siler.
       System.out.println(ls);//[451, 87, 231, 124]

       TreeSet<Character> ts =new TreeSet<>();
       ts.add('G');
       ts.add('A');
       ts.add('Z');
       ts.add('R');
       ts.add('R');
       ts.add('U');
       //ts.add(null);TreeSet"ler Null eklenemez
       System.out.println(ts);//[A, G, R, U, Z] TreeSet alfabetik sıraya koyar

       System.out.println(ts.first());//==> first() ilk eleman olan A yı verir
       System.out.println(ts.last());// ==> last() son elemanı verir

       System.out.println(ts.lower('R'));// lower() methodu parametre icinde verilen harfin bir oncesini verir
       System.out.println(ts.lower('D'));//olmayan elemannda basa doner'A 'yı verir

       System.out.println(ts.higher('K'));

       System.out.println(ts.headSet('R')); //==> [A, G]  headSet() methodu 'R'den onceki caracterleri verir
       System.out.println(ts.headSet('R', true));   //[A,G,R]bu ise 'R'yi dahil eder

       System.out.println(ts.tailSet('G'));//==>[G, R, U, Z] "G" dahil sona dogru hepsini verir

       System.out.println(ts.ceiling('R'));//====>R verir. Eleman set in icinde varsa elemanın kendisi return eder
       System.out.println(ts.ceiling('K'));//==>R verir .Eleman setin icinde yoksa olması gerken yerden sonraki elemanı return eder

       System.out.println(ts.floor('G'));//G==>Eleman set in icinde varsa elemanın kendisi return eder
       System.out.println(ts.floor('J'));//G==>Eleman set in icinde yoksa  elemanın olması gereken yerden onceki karakter doner.

       System.out.println(ts.subSet('G', 'U'));//==> [G,R ]subString de oldugu gibi ilk eleman dahil sonraki eleman dahil degil
       System.out.println(ts.subSet('G',false, 'Z',true)); //ilk eleman haric sonraki eleman dahil

   }












}
