package ssg.Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

     //5.soru verilen bir int arraydeki en buyuk sayıyı yazdıran bir method olusturun



     int arr [] ={20,37,42,90,15};

maxSayiYazdir(arr);


    }
   public  static void maxSayiYazdir (int[]arr){
       Arrays.sort(arr);
       System.out.println(arr[arr.length-1]);//90
   }









}
