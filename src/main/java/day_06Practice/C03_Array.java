package day_06Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {


    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan = new Scanner(System.in);
        int arr[] = new  int[4];


        for (int i = 0; i < 4; i++) { // burda for loop ile 4 defa girmesini saglarız

            System.out.println("Please enter a number");
            int numbers = scan.nextInt();

            arr[i]=numbers;// kullanıcıdan alınan her sayıyı arr e assign edildi.
        }
        System.out.println(Arrays.toString(arr));

        int toplam =0;

                for(int each:arr){
                    toplam =toplam +each;
                }

  double ortalama = toplam/arr.length;
        System.out.println(ortalama);
        for (  int each :arr ) {
            if(each>ortalama){
                System.out.println(each +"  ");
            }

        }








    }
}
