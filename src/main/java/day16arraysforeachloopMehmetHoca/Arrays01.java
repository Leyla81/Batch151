package day16arraysforeachloopMehmetHoca;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
        //Example===>kullanıcının coklu datayı bir array"a yerlestirebilmesi için gereken kodu yazınız.

        //1)kullanıcıdan data almak için Scanner object kullanmalıyız
        //2) Coklu data oldugu icin Array olusturmalıyız.
        //3) Array olusturmak icin kullanıcıdan Array"a  kac eleman koyacagımız bellı olmalı
        //4)loop olusturup eleman eklemek islemini tekrar tekrar yapabilmeliyim

        Scanner input =new Scanner(System.in);
        System.out.println("please enter the number of elements you want to add..");
        int numOfElements=input.nextInt();

        String stdNames[]=new String[numOfElements];//sayıyı alıp depolar
        System.out.println("to stop adding press 'q'...");//eger for "un icine yazarsak her seferinde bu msj goruruz

        for (int i = 0; i <stdNames.length ; i++) {//baslangıc noktası 0"dır; ogrenci sayısının uzunlugu kadar gidip true ise
                                                   // ; 1 artırıp 2. ye gecerim
            System.out.println("Enter the " +(i+1)+". student name");
            String name=input.next();//ismi -name sepetıne koyar

            if(name.equalsIgnoreCase("q")){//"q" ise bırak calısma
                break;
            }else{   //degilse
                stdNames[i]=name;

            }
        }
        System.out.println(Arrays.toString(stdNames));
















    }
}
