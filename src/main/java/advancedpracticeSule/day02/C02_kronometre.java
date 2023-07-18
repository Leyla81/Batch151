package advancedpracticeSule.day02;

import java.util.Scanner;

public class C02_kronometre {

    /*KRONOMETRE  2023/04 QA INTERWIEW
    Kullanıcının belirlediği sayıda işlemi gerçekleştiren,
    sonunda toplam süreyi ve
    ortalama süreyi kullanıcıya gösteren bir kronometre
    kodunu yaziniz.*/
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("lutfen kac islemgireceginizi girniz ");
        int numTask= input.nextInt();

        long startTime =System.currentTimeMillis();//baslangic zamanı almak icin

        System.out.println("*************************************");
        for (int i = 0; i < numTask ; i++) {
            int numbers[]= {1,2,3,4,5};
            int sum =0;
            for ( int w : numbers  ) {
                sum += w;
            }
            System.out.println("sum ="+sum);
            System.out.println("Islem "+i+" tamamlandı");

            System.out.println("*****************************");
        }
           long endTime =System.currentTimeMillis();

        long islemSuresi =endTime-startTime;

        System.out.println("islem suresi = "+islemSuresi);
        System.out.println("ortalama sure = "+(double)islemSuresi/numTask + "milisaniye");




    }


}
