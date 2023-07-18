package day_05practice;

import java.util.Scanner;

public class C02_switchBankamatik {
    public static void main(String[] args) {
        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen  1 ile 4 arası islem numarası giriniz"+"\n" +
                "islem 1 Bakiye sorgulama"+"\n"+ "islem 2 Para cekme"+"\n"+"islem 3 Para yatırma"+
                "\n"+"islem 4 islemi sonlandırın");
        int number = scan.nextInt();

        int bakiye =1000;

        switch(number){

            case 1:
                System.out.println("bakiyeniz  "+ bakiye +  "TL");
                break;
            case 2:
                System.out.println("Cekmek istediginiz parayı giriniz");// kullanıcıya msj gonderelim
               int cekilecekPara = scan.nextInt();//msj int kontainer ina koyduk.
               if(cekilecekPara<=bakiye){
                 bakiye=  bakiye-cekilecekPara;
                   System.out.println("Para cekme isleminden sonraki mevcut Bakiyeniz  "+ bakiye + "TL");
               }else{
                   System.out.println("bakiyeniz yetersiz");
               }
                break;

            case 3:
                System.out.println("Yatirmak istediginiz parayı giriniz");
                int yatirilacakpara = scan.nextInt();
                if(yatirilacakpara<=2000){
                    bakiye = bakiye + yatirilacakpara;
                    System.out.println("para yatırma isleminden sonraki mevcu bakiyeniz " +bakiye+ "TL");
                }else{
                    System.out.println("ATM de gunluk para yatırma limiti 2000 TL'dir");
                }
                break;

            case 4:
                System.out.println("TechPro bank'i kullandıgınız icin tesekkurler");
                break;

            default:
                System.out.println("invalid number");
        }

    }
}
