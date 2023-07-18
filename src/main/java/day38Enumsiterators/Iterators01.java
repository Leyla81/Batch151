package day38Enumsiterators;

import java.util.*;

public class Iterators01 {


    public static void main(String[] args) {


        /*
        *"iterator" "loop"ların yaptıgı aynı isi yapar.
        looplarda sonsuz loop tehlikesi oldugundan iterator a ihtiyac duyulmustur
       * iterator da sonsuz loop olusma ihtimali yoktur.
       * iterator ile loop arasında hız farkı yoktur
       * iterator lar bir collection dan eleman silme ve bir collectiondaki elemanı degistirme konusunda daha basarılıdır
       * iki tip iterator var ;i)Iterator==sadece eleman silmede kullanılır eleman eklemk ve degistirmek mumkun degildir
                                "Iterator" sadece soldan saga calısır loop lardaki gibi
       *                        ii)ListIterator = eleman silebilir ekleyebilir ve degistirilebilir
                                  "ListIterator" ise iki yonlu calısır hem bastan hem sondan


         */
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]



        //Iterator olusturma/kullanma
        Iterator<String> myItr =  myList.iterator();//Listteki elemanları "Iterator" a cevirdi.
                                                   // aynı elemanlar iteratora koydu ama yapı olarak farklı
                                                   //myList.iterator ==listemi iterator a cevirmis oldum
        while (myItr.hasNext()){//hasNext() pointera "senden sonra eleman var mı?"diye sorar
                                //varsa "true" yoksa "false" dondurur.
            myItr.next();

            myItr.remove();//elemanları hem ıteratordan hem list den siler

        }
        System.out.println(myList);//bos verir. iteratordan silince list ten de otomatik olarak silmis olur

        //ListIterator kullanma
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String>yourListItr = yourList.listIterator();//list i ListIterator a cevirdi.
        System.out.println(yourListItr);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + " !");//listIteratordaki elemanlara unlem isareti ekler
        }

        System.out.println(yourList);//[Tom !, Jim !, Clara !, Angie !, Mark !]

//hasPrevious () ve previous()nasıl kullanılır
       //hasPrevious () listenin senden once eleman var mi "true ya da false" dondurur
        //hasPrevious () ve previous() kullanmak icin "hasNext" ve "next" i kullanmak zorundayız
        //iteratorla basta olan pointer "hasNext" ve "next" ile sona gidecek

      while (yourListItr.hasPrevious()){
              String el =yourListItr.previous();//previous()methodu imleci sagdan sola atlatır
             System.out.println(el);//sagdan sola calısarak yazdırdı.    Mark !Angie !Clara !Jim !Tom !
                yourListItr.set("?"+ el);
}
        System.out.println(yourList);//[?Tom !, ?Jim !, ?Clara !, ?Angie !, ?Mark !]


      //descending()methodu LinkedList"lerle kullanılır."descending" sonda basa demek, azalma."ascending" artarak gidme
        // En sondan en basa nasıl iterate edebiliriz
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Van");
        ourList.add("Mus");
        ourList.add("Kayseri");
        ourList.add("İzmir");
        ourList.add("Samsun");
        System.out.println(ourList);//[Van, Mus, Kayseri, İzmir, Samsun]

        Iterator<String>ourItr = ourList.descendingIterator();//tersten islem yaptırır."hasNet()" ve "next()" kullanmadan
                                                              //ama "descending" sadece LinkedList ile kullanılır
        while(ourItr.hasNext()){
         String eleman = ourItr.next();
            System.out.print(eleman +" ");//Samsun İzmir Kayseri Mus Van

        }



      //Integer bir iterator olusturma
        List<Integer>list =new ArrayList<>();

       list.add(5);
       list.add(9);
       list.add(2);
       list.add(1);
       list.add(17);
       list.add(3);
        System.out.println(list);

        Iterator itr =list.iterator();//iterator objesi olusturduk

        System.out.println(itr.hasNext());//hasNext() senden sonra eleman var mı demek.true/false==>true verir

        System.out.println(itr.next());//next() iterator objesini bir ileriye zıplatır bize dondurdugu eleman uzerinde zıpladıgı elemandır
                                       //imlecin bulundugu yerden atlar ===>5 verir
        System.out.println(itr.next());//9 verir

        itr.remove();//enson uzerinden zıpladıgı sayıyı siler.uzerinden atladıgı sayı yoksa exception fırlattı.
        System.out.println(" list = " +list);//bu yuzden iki kez ustuste remove () methodu kullanılmaz






    }
}
