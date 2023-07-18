package LAMBDA.day04;

import LAMBDA.day03.Utils;

import java.util.stream.IntStream;

public class Lamda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7, 10));
        System.out.println(getMltiplicationInTheGivenRange(7, 10));

    }
   //7 den 10 a kadar tam sayıların toplamını hesaplayan methodu yazınız
    public static int getSumInTheGivenRange(int starting,int ending){
     return    IntStream.//integer ları bir akımda verir
                rangeClosed(starting,ending).sum();//rangeClosed(starting,ending) integer ları belli aralıkta verir

    }

    //7 den 10 a kadar tam sayıların carpımını hesaplayan methodu yazınız

    public static int getMltiplicationInTheGivenRange(int starting,int ending){
        return IntStream.
                rangeClosed(starting,ending).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //45 den 47 a kadar tam sayıların rakamlarının toplamını hesaplayan methodu yazınız
    //45 46 47========4+5+4+6+4+7=30
    public static int getSumOfDigitsInTheGivenRange(int starting,int ending){
        return  IntStream.
                rangeClosed(starting,ending).
                map(Utils::getSumOfDigits).//rakamları toplamına cevirdi
                sum();

    }






}
