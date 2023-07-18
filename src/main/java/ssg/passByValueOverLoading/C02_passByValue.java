package ssg.passByValueOverLoading;

import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
         /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[]={7,15,38,72};
        System.out.println(arr);//[I@27f674d
        // System.out.println("methoddan once array : "+ Arrays.toString(arr));//methoddan once array : [7, 15, 38, 72]
        // arrayElemanDegistir(arr);//methodun icinde array : [7, 60, 38, 99]
        // System.out.println(arr);//[I@27f674d
        // System.out.println("methoddan sonra array : "+Arrays.toString(arr));//methoddan sonra array : [7, 60, 38, 99]

        arrayDegistir(arr);
        System.out.println("methoddan sonra array : "+arr);

    }

    private static void arrayDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("method icinde array : "+arr);
    }

        /*
    verilen 4 elemanli bir array'i method'a gonderelim method'da yeni 3 elemanli
    bir array atayip bu yeni array'e rastgele
    100'den kucuk 3 sayi atayalim method da arrray'i yazdiralim
    main method'da da method call'dan sonra yeniden method'u yazdiralim
*/

    private static void arrayElemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("methodun icinde array : "+arr);

    }
}

