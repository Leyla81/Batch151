package sulymanNightTime.day20arraylistDateTimeSuleymanhoca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        List<Integer>nums =new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);//12,23,10,19

//collection.sort(nums); method"u nums listesindeki elemanlari "natural order" yapar.
        Collections.sort(nums);//sıralama yapar==> array lerdeki "sort" array'den gelir List lerde ise "collections"dan gelir
        System.out.println(nums);//10,11,19,23

        int minDiff = nums.get(1)-nums.get(0);


        for (int i = 1; i <nums.size() ; i++) {
             minDiff =Math.min(minDiff,nums.get(i)-nums.get(i-1));// get() methodunun icine index girilir.
        }

        System.out.println(minDiff);

        for (int i =1; i<nums.size();i++)
            if (nums.get(i)-nums.get(i-1)==minDiff) {
                System.out.println(nums.get(i) + " and " + nums.get(i - 1)); // 13 and 14 yzadırır.
                }















            }

    }









