package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {


    public static void main(String[] args) {


        //Lambda map haric butun collection uyelerinde kullanilabilir.
        // Map'de kullanilamaz cunku maplerde key value iliskisi vardir.

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftVePozitifLambdaExpessionYzdır(sayi);
        System.out.println("\n**************");
        ciftvePozitifMethodReferans(sayi);
        System.out.println("\n*****************");
        ElKareleriniYazdir(sayi);
        System.out.println("\n*****************");
        ElKareleriniYazdir2(sayi);
        System.out.println("\n*****************");
        kareleriniTekrarsızYazdır(sayi);
        System.out.println("\n*****************");
        elBuyukteKucugeSirala(sayi);
        System.out.println("\n*****************");
        pozitifElKupBulBirlerBsmg5OlanıYzdr(sayi);
        System.out.println("\n*****************");
        pozitifElKupBulBirlerBsmg5OlanıYzdr(sayi);
        System.out.println("\n*****************");
        methİleElTopBul(sayi);
        System.out.println("\n*****************");
        LambdaExpressionİleTopla(sayi);
        System.out.println("\n*****************");
        System.out.println(ciftElKarelerinikucuktenBuyugesırala(sayi));

    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

public static void ciftVePozitifLambdaExpessionYzdır(List<Integer>sayi){

        sayi.stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t +" "));
}

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftvePozitifMethodReferans(List<Integer>sayi){
        sayi.stream().
                filter(t->t%2==0 && t>0).
                forEach(Utils::yazdır);

    }
//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void ElKareleriniYazdir(List<Integer>sayi){
        sayi.stream().
                map(t->t*t).//akistan gelen elemanları degisikligeugradıgı icin map kullandıkdık
        forEach(Utils::yazdır);
    }
      //2.yol map bolumunu method referance ile yazdıralım.Utils Kutuphanesine gidelim

    public static void ElKareleriniYazdir2(List<Integer>sayi) {
        sayi.stream().
                map(Utils::KareBul).
                forEach(Utils::yazdır);

    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareleriniTekrarsızYazdır(List<Integer>sayi){
        sayi.stream().
                map(Utils::KareBul).
                distinct().//tekrarsız yazdırıyorum
                forEach(Utils::yazdır);

    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void elBuyukteKucugeSirala(List<Integer>sayi){
        sayi.stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdır);
    }
    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız

public static void pozitifElKupBulBirlerBsmg5OlanıYzdr(List<Integer>sayi){
        sayi.stream().
                filter(t->t>0).//cift olannları filltreledik
                map(t->t*t*t).
                filter(t->t%10==5).forEach(Utils::yazdır);
}
//2. yol Method Referans kullanık Utils kutuphanesinden.
    public static void pozitifElKupBulBirlerBsmg5OlanıYzdr2(List<Integer>sayi){
        sayi.stream().
                filter(t->t>0).//cift olannları filltreledik
                map(Utils::kupBul).//method referans kullandım
                filter(t->t%10==5).
                forEach(Utils::yazdır);
    }
// SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void methİleElTopBul(List<Integer>sayi){
        int sonuc = sayi.stream().
                reduce(Integer::sum).get();//reduce() ile islem sonucu elemanlar azalmaya gitbmesini saglar
                                     //(Integer::sum)Lambdanın hazır toplama methodudur
                                      //reduce methodu terminal bir methoddur bu yuzden forEach() methodunu kullanamayız
    //get() methodu optinal ı integer a cevirir.
        System.out.println(sonuc);
    }
// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

public static void LambdaExpressionİleTopla(List<Integer>sayi){
        int sonuc =sayi.
                stream().
                reduce(0,(t,u)->t+u);
    System.out.println(sonuc);
}
//SORU9 : Listin cift elemanlarının, karelerini,
// kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKarelerinikucuktenBuyugesırala (List<Integer>sayi){
       List<Integer>sonuc=sayi.stream().
                filter(t->t%2==0).
                map(Utils::KareBul).
                sorted().//zaten kucukten buyuge sıralama yaptıgı ıcın paranteze birsey yazmaya gerek yok
               collect(Collectors.toList());//elemanları liste donusturduk
        return sonuc;
    }











}
