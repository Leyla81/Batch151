package day34collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {


    public static void main(String[] args) {


        //"hash" ===> benzersız "unique" sozluk gibi dusunulebilir
    /*
   "Key"     "value"
   cat      ==>Kedi
   dog      ==>Kopek
   hard      ==>zor
   diffucult ===>zor
  key bolumu: tekrarsız === value bolumu : tekrarlı olabilir */
        //hash map elemanlarına "entry" denir
        //Elemanların tamamına 'EntrySet' denır
        //"key" ve "value" lar farklı data type'nda olabilirler
        // "HashMapler random sekilde sıralanır bu yuzden sıralama yapmadıgı icin en hızlı calısan map dir

        HashMap<String ,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);//"HasMap"ler de add() ekleme methodunun yerine put()methodu kullanılır
        countryPopulation.put("Netherland",18000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("Turkey",83000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turke=83000000, Germany=83000000, Albania=30000000}

        //get() methodu key ile calısır ve value return eder
        //1.Way
        System.out.println(countryPopulation.get("Germany"));//83000000
        //2.Way
        int germanyPopulation= countryPopulation.get("Germany");
        System.out.println(germanyPopulation);

         //keySet () methodu butun key leri verir
        //1.WAY
        System.out.println(countryPopulation.keySet());
        //2.WAY
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //values() methodu HashMap teki butun value ları verir
        System.out.println(countryPopulation.values());

        //2.WAY

        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[1800000, 400000000, 83000000, 83000000, 3000000]

        //Example1:Countrypopulation mapindeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum =0;
        for (  Integer w :   value           ) {
            sum= sum+w;
        }
        System.out.println(sum/value.size());//114160000


        //entrySet() mapteki entryleri kalıp halinde alıp bize set olarak verir
        //Looplar maplerle ile kullanılamaz, bunun icin entrySet methodunu kullanırız.

        Set< Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        //Example:countryPopulation map indeki ulkelerin isimlerinin character sayisi ile nufusların tolamını yazdırın

        int toplam =0;
        for (Map.Entry<String,Integer> w : entries) {
         toplam= toplam  +   w.getKey().length()+w.getValue();
            System.out.println(toplam);

        }

    }
}
