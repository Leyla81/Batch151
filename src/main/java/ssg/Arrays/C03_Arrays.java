package ssg.Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

     /*
     3.soru verilen Arrayin tum elemanlarını bir soldaki konuma tasıyacak bir program yazın
     ornek ;   array ((1,2,3)) ise output (2,3,1) olacak
      */

        int numbers[] ={1,2,3,4,5};
        int temp = numbers[0];

        for (int i = 0; i < numbers.length-1 ; i++) {

            numbers[i] = numbers[i+1];
        }

        numbers[numbers.length -1]= temp;
        System.out.println(Arrays.toString(numbers));











    }
}
