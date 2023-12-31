package day33Maps;

import java.util.HashMap;

public class HashMaps01 {




        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1   String ve integer ikisi de oldugu icin hasmap kullanılır
        //harfler almak icin
        public static void main(String[] args) {

            String s = "Hello Henry!";
            System.out.println(getTheNumOfOccurrenceOfLetters(s));

        }
    public static HashMap<String, Integer> getTheNumOfOccurrenceOfLetters(String s){

        //String'deki harf disi character'leri sil
        s = s.replaceAll("[^A-Za-z]", "");

        //Gorunum sayilarini depolamak icin Map olustur
        HashMap<String, Integer> numOfOccurrence = new HashMap<>();

        //Harfleri al
        String letters[] = s.split("");

        //for-each loop
        for(String w : letters){
            Integer numOfOcc = numOfOccurrence.get(w);
            if(numOfOcc==null){
                numOfOccurrence.put(w,1);
            }else{
                numOfOccurrence.replace(w, numOfOcc+1);
            }
        }
        return numOfOccurrence;
    }
}