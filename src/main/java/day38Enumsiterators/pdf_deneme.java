package day38Enumsiterators;

import java.util.*;

public class pdf_deneme {
    public static void main(String[] args) {

        //ex 1 : bir listedeki istenen sayı aralıgında olmayan elemanı silen bir program yazınız
        // orn[2,13,56,23,45,14,40] istenen aralık 20 ile 40 sınırlar dahil===output 23 40
     List<Integer> mylist = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
     Iterator itr =mylist.iterator();
     while(itr.hasNext()){
        Object sayi= itr.next();
        if ((Integer)sayi>=20&&(Integer)sayi<=40){
            System.out.print(sayi+" ");
        }

     }
        System.out.println("**************************");
       // ex 2: bir listedeki elemanları iterator kullanarak sondan basa yazdırın.
        LinkedList<Integer> mylist1 = new LinkedList<>(Arrays.asList(2,13,56,23,45,14,40));

    Iterator  itr1=mylist1.descendingIterator();
        while(itr1.hasNext()) {
            Object sayi1 =itr1.next();
            System.out.print(sayi1+"  ");

        }


        System.out.println("**************************");

        //ex:3 bir listedeki ilk n elemanı iterator kullanarak 5 artırın
          //list [2,13,56,23,45,14,40]
        // artırılacak eleman sayısı =3
        // output 7,18,67,23,45,14,40

        List<Integer> mylist2 = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        ListIterator ıtr2 = mylist2.listIterator();

        int inx =0;
        while(ıtr2.hasNext()){
            Object num =ıtr2.next();
            if(inx>2){
                break;
            }
           ıtr2.set((Integer)num+5);
            System.out.println(num +" ");
            inx++;
        }
        System.out.print(mylist2);



    }
    }

