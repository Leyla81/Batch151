package day16ArraysForEachLoop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

      //spesific bir elemanın array de olup olmadıgını anlamak icin gereken kodu yazınız

      String names[]={ "K","C","R","A","S"};

      String eleman="A";

      int counter=0;

for(String w: names){

    if(w.equals(eleman)){
        counter++;
        break;//buraya break koydugumuzda elemanı bulunca cıkar ve java daha hızlı calısır
    }
}

   if(counter>0) {
       System.out.println("Array has  "+eleman);

   }else{
       System.out.println("Array does not have  " +eleman);
   }

//2 WAY=***********binarysearch()******************

//java binlerce datanın icinden specific datayı bulmak icin ortaya bakar
// ve data sagda mı yoksa solda mı diye bakar. Buna binarysearch()methodu ile bakılır.

        Arrays.sort(names);
   //1)binarysearch() methodunu "sort" kullanmadan yapamayız.Cunku binarysearch() methodu mantıgı sıralı elemanlar icin gecerlidir
  //2)binarysearch()methodu var olan elemanlar içinsize o elemanın indexi mi verir.
  //3)  binarysearch() methodudan aldıgımız index 0 veya 0 dan buyukse bu o elman array de va demektir.
//4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
//  "-" isaretinin anlami o eleman yok demektir.
//  "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.

// bionarySearch () in parantez icine (arama yapılacak seyin ismi ,array"de aranacak eleman)
        int result=Arrays.binarySearch(names,eleman);
        System.out.println(result);

        if(result<0){
            System.out.println("Array has  "+eleman);

        }else{
            System.out.println("Array does not have  " +eleman);

        }








    }
}
