package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

//oncelikle yapılması gereken "sort" methodu ile "natural order" yaparız.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);//[12, 23, 10, 19]

        Collections.sort(nums);//sıralama yapar==> array lerdeki "sort" array'den gelir List lerde ise collectionsdan gelir
        System.out.println(nums);//[10, 12, 19, 23] yazdırır.

        int minDiff = nums.get(1)-nums.get(0);

        for (int i = 1; i <nums.size() ; i++) {
            Math.min(minDiff,nums.get(i)-nums.get(i-1));//minumum sayıyı verir
        }
        System.out.println(minDiff);//2 verir
        for (int i = 1; i <nums.size() ; i++) {
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1)+"ve"+nums.get(i));

            }

        }
















    }
}
