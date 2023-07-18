package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        //*************Stringlerle Lambda islemi*************

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek",
                "greyfurt", "nar", "mandalina", "armut", "elma", "keciboynuzu", "elma"));

        elİlkHrfeVecOlanlar(meyve);
        System.out.println("************");
        elBasSonYldzKoy(meyve);
        System.out.println("************");
        System.out.println(kartrSysGoreByktnKuckEnByk3ElSırala(meyve));
        System.out.println("************");
        System.out.println(kartrSysGoreByktnKuckEnByk3ElSırala2(meyve));



    }

// SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım

    public static void elİlkHrfeVecOlanlar(List<String>meyve){
        meyve.stream().
                filter(t->t.startsWith("e")||t.startsWith("c")).
                forEach(Utils::yazdır);
    }
// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void elBasSonYldzKoy(List<String>meyve){
        meyve.stream().
                map(t->"*" +t+ "*").
                forEach(Utils::yazdır);
    }

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
public static List<String> kartrSysGoreByktnKuckEnByk3ElSırala(List<String>meyve){
      List<String>sonuc=  meyve.stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
        //karakter sayısına gore sıraladık
    limit(3).//İlk 3 elemanı verir
              collect(Collectors.toList());//List e cevirdik.
        return sonuc;
}
//2. yol
    public static List<String> kartrSysGoreByktnKuckEnByk3ElSırala2(List<String>meyve){
        List<String>sonuc=
                meyve.stream().
                sorted(Comparator.comparing(String::length).reversed()).//lambda daki hazır method ile yapıldı
                limit(3).
                collect(Collectors.toList());
        return sonuc;
    }




}
