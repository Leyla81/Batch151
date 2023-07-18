package sulymanNightTime.day31collectionsMapsSuleyman;

import java.util.*;

public class HashMap01 {



    public static void main(String[] args) {

    //mapler iki bolumdur "KEY" ve "VALUE"..map"ler "key-value" structure ını kullanır
    //"key" tekrarsız bolum "value" tekrarlı olabilir
       /* Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
        Ornek:
        Cat=Evcil hayvan
                Dog=Evcil hayvan
        Su sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
        bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
        iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim "key", tekrarli kisim
        "value" olarak tanimlanir. Key=Value
        Maplar "key=value" yapisini kullanir. Maplerde birinci ve ikinci deger var. Maplerdeki elemanlara "Entry" denilir.
                Elemanlari iceren yapinin tamamina "EntrySet" denir.
                Java tekrarsizlara Set diyor,*/
        //Key ve Value'lar  ayri ayri data type"i olabilirler
        //hashMap ler entry leri rast gele sıralar bu yuzden en hızlı map dir
        //map ler collections degildir.farkli bir yapidir

        //******map nasıl olusturulur************
        HashMap<String , Integer>countryPopulation =new HashMap<>();

           //*****Map e nasıl entry eklenir
          countryPopulation.put("Germany",83000000);  //add()tekli datayı koydugu icin hashMap()de put()kullanılırikili data vardır
          countryPopulation.put("Albania",3000000);
          countryPopulation.put("USA",400000000);
          countryPopulation.put("Netherland",83000000);

          System.out.println(countryPopulation);

           int usaPopulation =countryPopulation.get("USA");//get () methodu "key" ile calisır ve size value kısmını verir.
        System.out.println(usaPopulation);//400000000

        //****butun "key'ler"nasıl alırız****
       Set<String>keys = countryPopulation.keySet();//javada tekrarsız seyle set() methodunun icine konur ve bize butun "key"leri verir.
        System.out.println(keys);

        //****butun "value'ler"ı nasıl alırız****
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);


   //Example 1: countryPopulation map indeki ulkelerin nufuslarının ortalaması nedır

        Collection<Integer>value =countryPopulation.values();

        int sum =0;
        for (Integer w:value) {
            sum =sum+w;
            System.out.println(sum / value.size());
        }

            //****entrySet()****size entry"lerı kalıp halinde set"in icine koyarak verir
        Set<Map.Entry<String,Integer>>entries =countryPopulation.entrySet();//looplar entry lerle kullanılamaz.Sadece entry ler arasında gezinmek icin loop kullanabiliriz
        System.out.println(entries);
         // Set<Map.Entry<String,Integer>>=====>map deki entry ler set in elemanıdır demek

        // countryPopulation map"indeki ulkeleri isimlerinin karakter sayısı ile nufuslarını toplamını bulunuz

        int toplam = 0;

        for(Map.Entry<String,Integer> w :entries){
            toplam=toplam+ w.getKey().length()+w.getValue();
            //getkey() ulkeleri verir. getvalue () nufusu verir.

            System.out.println(toplam);

        }







    }
}
