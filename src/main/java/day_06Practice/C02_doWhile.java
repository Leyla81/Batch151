package day_06Practice;

import java.util.Scanner;

public class C02_doWhile {


    public static void main(String[] args) {
        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter height of ball fall ");
        double height = scan.nextDouble();

        double toplamYol =0;

        int vurmaSayısı =0;

        do {
            toplamYol += height;
            vurmaSayısı++;
            toplamYol += height*0.5;

            height= height*0.5;

        }while (height>=1);

        toplamYol +=height;
        vurmaSayısı++;

        System.out.println("yere vurma sayısı = "+ vurmaSayısı);
        System.out.println("toplam yer =" + toplamYol);
























    }
}
