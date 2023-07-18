package sulymanNightTime.day20arraylistDateTimeSuleymanhoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {

        //1)String Class kullanmak tercih edilir cunku String class method bakımından zengindir
        //list.of () methodu kullanarak kisa yoldan List olusturabilirsiniz ama bu Listelerin elemanları degistirilemez
        //list.of () methoduna yeni eleman eklenemez
        //list.of () methodunda eleman silinemez

      //  Example = kullanıcıda girdiği harf list te var ise o harfi "buldum" a cevirin, yok ise o harfi ekleyen kodu yazınız.

        List<String>myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();
        System.out.println(myList);//A,H,J,K,M

        Scanner input = new Scanner(System.in);
        int counter =0;

        do {      //surekli donsun diye do while yaptık.
            if(counter==myList.size()){   //counter listenin buyklugune esıt olana kadar calisacak
                System.out.println(myList);
                break;
            }
            System.out.println("please enter a letter");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum");//set()methodu "buldum" a degistirir.
            } else {
                myList.add(letter);
            }
            counter++;

        }while(true);


















    }
}
