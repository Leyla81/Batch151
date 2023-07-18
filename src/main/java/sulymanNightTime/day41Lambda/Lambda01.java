package sulymanNightTime.day41Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);
        System.out.println(getTheSumOfSqareOfOdds1(nums));
        System.out.println(getTheSumOfSqareOfOdds2(nums));
        System.out.println(getTheMultiplicationOfSqareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndMinOdd(nums));
        System.out.println(getTheSumOfEvenLessThanSevenMaxAndMinGreaterThanEight(nums));
    }

    //examole 1= Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.

    public static int getTheSumOfSqareOfOdds1(List<Integer> nums) {   //odd tek sayı demek

        return nums.
                stream().
                filter(t -> t % 2 != 0).//tek olan sayıları filtreledik
                        map(t -> t * t).//sayının karesini aldık
                        reduce(0, (t, u) -> t + u); //toplama islemi yaptık

    } public static int getTheSumOfSqareOfOdds2(List<Integer> nums) {   //odd tek sayı demek

        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//keni olusturdugumuz classdaki methodu kullandık
                reduce(0,Math::addExact);

    }

//Example 2 =  Verilen bir list'teki cift sayi olan elemanlarin tekrarsız olarak kareleri carpımını toplamini hesaplayan method olusturunuz.

    public static int getTheMultiplicationOfSqareOfEvens(List<Integer> nums) {//Evens Cift Sayi demek
        return nums.
                stream().

                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct(). //tekrarlı ların birini alir
                        reduce(1, (t, u) -> t * u);
    }

//Example 3 =    Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayı olan
// elemanların minumum degerinin toplamini hesaplayan method olusturunuz.

    public static int getTheSumOfEvenMaxAndMinOdd(List<Integer> nums) {//Evens Cift Sayi demek
        int maxEven = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).//cift sayıları verir
                        reduce((t, u) -> t > u ? t : u).get();//get methodu reduce icine ternary yazmamıza izin verdi

        int minOdd = nums.
                stream().distinct().
                filter(t -> t % 2 != 0).//tek sayıları verir
                        reduce((t, u) -> t < u ? t : u).get();

        return maxEven + minOdd;

    }

    //Example 3 =    Verilen bir list'teki cift sayi olan elemanlarin 7 den buyuk maximum degeri ile tek sayı olan
//8 den buyuk  elemanların minumum degerinin toplamini hesaplayan method olusturunuz.

    public static int getTheSumOfEvenLessThanSevenMaxAndMinGreaterThanEight(List<Integer> nums) {//Evens Cift Sayi demek
        int max = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0 && t < 7).//cift sayıları verir
                        reduce((t, u) -> t > u ? t : u).get();//get methodu reduce icine ternary yazmamıza izin verdi

        int min = nums.
                stream().distinct().
                filter(t -> t % 2 != 0 && t > 8).//tek sayıları verir
                        reduce((t, u) -> t < u ? t : u).get();

        return max + min;


    }
}