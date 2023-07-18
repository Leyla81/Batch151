package day21arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {

       //Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a letter...");
       String letter= input.next().toUpperCase().substring(0,1);

       if(myList.contains(letter)){
           myList.set(myList.indexOf(letter),"Buldum..");// girilen harfin indexini buldum diye guncelledi."set()" methodu gunceller
       }else{
           myList.add(letter);//olmayan harfi eklemek icin
       }
        System.out.println(myList);

















    }
}
