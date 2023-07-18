package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {



        //Example 1: Type code to print the number of occurrences(gorunum) of words in a sentence
//"I like you,like like!"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1

        String s=" I like you, you like like";
        System.out.println(s);

         //firstStep
        //like ile like ! aynı olmaması icin tum noktalama isaretletini silelim

        s= s.replaceAll("\\{puncht}","");
        System.out.println(s);

      //2.Step ben kelimelerle calısmalıyım bu yuzden bosluktan bol.
        String words[]= s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer>occ =new HashMap<>();
        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
       //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for(String w : words){

            Integer numOfOccurrence = occ.get(w);

            if(numOfOccurrence==null){

                occ.put(w,1);

            }else{

                occ.replace(w, numOfOccurrence+1);

            }


        }

        System.out.println(occ);// {like=3, I=1, you=1}






















    }
}
