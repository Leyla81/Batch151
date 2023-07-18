package day_05practice;

import java.util.Scanner;

public class C04_forAgac {

    public static void main(String[] args) {/*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız

        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yaprak satır sayısımı giriniz");
        int yaprakSatirSayisi = scan.nextInt();

        System.out.println("Govde satır sayısını giriniz");
        int govdeSatirSayisi = scan.nextInt();

        String yaprak = "";// bos bir yapraklar icin kontainer olustuduk.

        for (int i = 0; i <yaprakSatirSayisi ; i++) {//0"dan yaprak satır sayısına kadar donguye aldık

            yaprak = yaprak+ "^"; //her seferinde ekleyerek gidecek

            System.out.println(yaprak);
        }
        for (int i = 0; i <govdeSatirSayisi ; i++) { //0 dan govde satır sayısına kadar aldık
            System.out.println("|||");

        }

















    }
}
