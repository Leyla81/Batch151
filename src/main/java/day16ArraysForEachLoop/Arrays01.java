package day16ArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {


    public static void main(String[] args) {

        //Example===>kullanıcının coklu datayı bir array"a yerlestirebilmesi için gereken kodu yazınız.
        //1)kullanıcıdan data almak için Scanner object kullanmalıyız
        //2) Coklu data oldugu icin Array olusturmalıyız.
        //3) Array olusturmak icin kullanıcıdan Array"a  kac eleman koyacagımız bellı olmalı
       //4)loop olusturup eleman eklemek islemini tekrar tekrar yapabilmeliyim

        Scanner input=new Scanner(System.in);
        System.out.println("please enter of elements you want to add..");// burda girecegim eleman sayisini giriyorum
        int numOfElements= input.nextInt();
        System.out.println("to stop adding press 'q'");

        String sdtNames[]=new String[numOfElements];//array burda olusuyor.koselı parantez

        for (int i=0;i<sdtNames.length;i++){
            System.out.println("enter the"+(i+1)+"student name");//enter the first /second ..student name yazdırır
                                                                    //tekrar tekrasorar cunku loop "un icinde.

            String name= input.next();
           if (name.equalsIgnoreCase("q")) {//girilen isim q"ya esit degilse asagıda isssmi yazdıracak
               break;
           }else{
               sdtNames[i]=name;

           }
        }

        System.out.println(Arrays.toString(sdtNames));






    }
}
