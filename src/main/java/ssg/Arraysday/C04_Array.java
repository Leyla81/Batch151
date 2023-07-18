package ssg.Arraysday;

public class C04_Array {
    public static void main(String[] args) {
        /*
        5.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
        */
        int arr[]={10,8,7,3,11,33,23};
        maxSayiYazdir(arr);

    }

    public static void maxSayiYazdir(int[] arr) {//en buyuk array i bulmak icin method olusturduk
       //1.yol
        int maxSayi = arr[0];
        for (int a : arr ){
            if (a>maxSayi){
                maxSayi=a;
            }
        }

        System.out.println(maxSayi);



        //2.yol
        int maxSayi1 = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            maxSayi1 =Math.max(maxSayi1,arr[i]);

        }

        System.out.println(maxSayi1);

    }



}

