package day16arraysforeachloopMehmetHoca;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

//specific bir elemanı Array de olup olmadıgını anlamak icingereken kodu yazınız.

        //1.YOL***********
        String names[] = {"K","C","R","R","A","S,"};

        String el = "R";
        int counter = 0;

        for(String w:names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has ==>"+el);
        }else{
            System.out.println("Array doesnt have ==>"+el);
        }

      //2.YOL**********sort()*******ve BionarySearch()**********

        Arrays.sort(names);//oncelikle sıralamalıyız cunku bionarySearch() sıralı elemanlarla kullanılır.
                            //alfabetik sıra...
       int result= Arrays.binarySearch(names,el);// bionarySearch () in parantez icine (arama yapılacak seyin ismi ,array"de aranacak eleman)
         //bionarySearch() elemanın index'ini verir. eleman yoksa "-" dondurur yok demektr
        //bionarySearc hep 'int' döndürür

        if(result<0){
            System.out.println("Array doesnt have ==>"+el);
        }else{
            System.out.println("Array doesnt have ==>"+el);
        }

        //1) binarysearch() methodunu sort() kullanmadan kullanamayiz, cunku binarysearch() mantigi sirali elemanlar icin gecerlidir
        //2) binarysearch() methodu var olan elemanlar icin size o elemanin index inin verir
        //3) binarysearch() methodundan aldigimiz index 0 veya 0 dan buyuk ise bu aradigimiz eleman arrayde var demektir
        //4) binarysearch() methodu olmayan elemanlar icin negatif deger verir
        //      "-" isaretinin anlami o eleman arrayde yok demektir
        //      "-" isaretinin yanindaki sayi ise eger o eleman arrayda olsaydi kacinci eleman olurdu demektir sıra verir index degil



    }

}
