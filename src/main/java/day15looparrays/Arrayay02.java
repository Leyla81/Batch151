package day15looparrays;

import java.util.Arrays;

public class Arrayay02 {

    public static void main(String[] args) {

        // application larda data ile kod lar birbirinden ayrılır
        // yani logic dataya bagımlı olmamalıdır. data ya bagımlı kodlara hard code denir. (hatali kodlardir)
        // asagıdakı grades array'inde son elemanı almak icin 4 veya "grades.ledngth -1 "kullanırsanız hep dogru sonucu alırsınız

    //********Arrayleri kısa yoldan nasıl olusturabiliriz*********

       // int grades[]=new int[5];bunu yazıp tek tek notları girmek yerine
        // suslu parantez icinde 5 notu girip semicolonla bitiririz

        int grades[]={67,47,85,75,23};
        System.out.println(Arrays.toString(grades));

        //Example: grades Array'indeki en kucuk ve en buyuk grade'in toplamını ekrana yazdıran kodu yazınız

        Arrays.sort(grades);//"sort" sırala demektir en kucukten en buyune kadar sıralayarak yazdırır
        System.out.println(Arrays.toString(grades));//23 47 67 75 85 yazdırır

        System.out.println(grades[0]+grades[grades.length-1]);

        System.out.println("---------------------");
            // Example 2: size verilen bir string arraydeki isimlerde 5 character den
        // az character icerenleri concole yazdırınız

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

       for(String w :stdNames){
           if(w.length()<5){
               System.out.println(w);
           }
       }
        System.out.println("-----------------------------------");
// Example 3: size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan
// sonra "F" ile baslayan isimlerden onceki isimleri console yazdırınız

        for(String w:stdNames){

           Arrays.sort(stdNames);//Arrays.sort sayıları kucukten buyuge sıralarken Strıngde alfabetik sıraya koyar
            //Ajda,Ayhan,Cuneyt,Filiz, Tom yazdırır (ASCENDING===>kucukten buyuge--- ALPHABETİCALLY===>natural order

           if(w.startsWith("F")){
               break;
           }
            System.out.println(w);
        }
        System.out.println("------------------------------");
//// Example 4: size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan
//// sonra "F" ile baslayan isimlerden haric isimleri console yazdırınız

        for(String w:stdNames) {
            Arrays.sort(stdNames);
            if (w.startsWith("F")) {
                continue;
            } else {
                System.out.println(w);
            }


        }





    }
}
