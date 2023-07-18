package LAMBDA.day07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01Tekrar {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

         allEvenPrint(nums);

         anyOddPrint(nums);

         ilk3AtlaKlnYuzde50indirim(nums);
        System.out.println();

         ciftElYazdir(nums);
        System.out.println();

        teksayiKareleriniYazdır(nums);
        System.out.println();

        teksayiKupleriniTekrarsızYazdır(nums);
        System.out.println();

        System.out.println(BenzersizCiftsayiKarelerininToplamınıYazdır(nums));
        System.out.println();
        System.out.println(benzersizCiftsayiKarelerininCarpYazdır(nums));
        listedenMaxYazdir1(nums);
        listedenMaxYazdir2(nums);
        listedenMaxYazdir3(nums);
        listedenMaxYazdir4(nums);

        listMinEleman(nums);
        minDeger(nums);

    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.
    public static void allEvenPrint(List<Integer>nums){
        boolean allEven =nums.
                stream().
                allMatch(t->t%2==0);
       // allMatch metodu icerisinde tum sayilara bak ve cift mi diye t%2==0 seklinde kontrol ettik dedik.
        System.out.println("allEven = " + allEven);
    }



    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz
    public static void anyOddPrint(List<Integer>nums){
        boolean anyOdd =nums.
                stream().
                anyMatch(t->t%2!=0);
        System.out.println("anyOdd = " + anyOdd);
    }



    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.

public static void ilk3AtlaKlnYuzde50indirim(List<Integer>nums){
        nums.
                stream().
                sorted().//kucukten buyuge sıralar
                skip(3).//ilk 3 deger atlanır
                map(t->t*1.5).//%50 zam yapmak icin 1.5 ile carptık
                forEach(t-> System.out.print(t+ " "));
}

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void ciftElYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().//akısa sunduk
                filter(t -> t % 2 == 0).//cift sayıları filtreledik
                forEach(t -> System.out.print(t + " "));//12 14 10 4 12
    }



    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void teksayiKareleriniYazdır(List<Integer>nums){
        nums.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));

    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void teksayiKupleriniTekrarsızYazdır(List<Integer>nums) {
        nums.stream().
                distinct().//tekrarsız yapmak icin
                filter(t -> t % 2 != 0).//tek Sayilari almak icin
                map(t -> t * t * t).//kupunu almak icin
                forEach(t -> System.out.print(t + " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

        public static int BenzersizCiftsayiKarelerininToplamınıYazdır(List<Integer>nums) {
        return     nums.stream().
                    distinct().
                    filter(t -> t % 2 == 0).
                    map(t -> t * t).
                    reduce(Math::addExact).get();//toplama islemi yaptık
                // reduce(0,(t,u)->t+u);==seklinde de toplayabilir
        }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


    public static int benzersizCiftsayiKarelerininCarpYazdır(List<Integer>nums){
       return nums.
               stream().
               distinct().
               filter(t->t%2==0).
               map(t->t*t).
               reduce(Math::multiplyExact).get();
//reduce() dan sonra forEach ()methodunu kullanamııyoruz
    }

    //9)Liste ogelerinden max degerini veren bir method olusturunuz
    public static void listedenMaxYazdir1(List<Integer> nums) {

        //1.Yol
        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);//ternary
        System.out.println("max = " + max);
    }
        //2.yol
    public static void listedenMaxYazdir2(List<Integer> nums) {

        Integer max2 =
                nums.
                        stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println("max2 = " + max2);
    }
    // 3.Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {

        Integer max3 = nums.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> u).get();
        System.out.println("max3 = " + max3);


    }
    //4.yol
    public static void listedenMaxYazdir4(List<Integer> nums) {

        nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
               limit(1).forEach(t-> System.out.print("max4 :"+t));

    }

    //10)Liste ogelerinden minumum degerini veren method olusturunuz

    public static void listMinEleman(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }

        //2.yol
        public static void minDeger(List<Integer>nums){
            int minDeger = nums.
                    stream().
                    distinct().
                    reduce(Math::min).//matematik class ından faydalandık
                    get();
            System.out.println("minDeger "+ minDeger);
        }



















}

