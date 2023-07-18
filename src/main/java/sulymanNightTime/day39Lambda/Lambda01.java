package sulymanNightTime.day39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

       /* Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
        for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
        Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk.
        Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
        Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

                Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
                Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
        Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
        t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

                myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
        degisti. Tom
                Jim
        Clara

        stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
                Sonra for each gelip ikinci elamani aliyor.
                javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor*/

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);

    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran kodu yaziniz.
      //1,Yol
    public static void printElements(List<String>myList){
        for (String w :myList) {
            System.out.println(w+" ");

        }
    }


    //2.yol

       public  static  void printEl(List<String>myList) {
        myList.
                stream().
                forEach(t-> System.out.println(t +" "));
        //stream()=====> methodu elemnları yukarıdan asagı sıralar
       }



//Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
public static void printElExceptStartsWithT(List<String>mylist) {
    mylist.
            stream().
            filter(t -> !t.startsWith("T")).
            forEach(t -> System.out.print(t + " "));

}
   //Example 3 = bir liste character sayısı 4 den az olan tum elemanları console yazdırın
    public static void printElLengthLessThanFour(List<String>myList){

        myList.
                stream().
                filter(t->t.length()<4.).
                forEach(t-> System.out.println(t + " "));
    }


    //Example 4 = Bir listeki character sayısı 4 den az olan tum elemanlari buyuk harflerle console yazdıran methodu olusturun.

    public static void printElLengthMoreThanFourWithUpper(List<String>myList){
        myList.
                stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.println(t));
        //map() methodu var olan listteki elemanı degistırmek icindir
    }
    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari
    // tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

      public static void printElLengthMoreThanFourUniqueLowerCase(List<String>myList){
        myList.
                stream().
                distinct().////distinct()tekrarli elemanleri bir kere gosterir.
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.println(t+" "));


}
//Example 6= bir listeki elemanları tekrarsız olarak buyuk harflerle alfabetik sırada console yazdırın

public  static  void printElUniqueToUpperCaseSorted(List<String>mylist){
        mylist.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.println(t+" "));
}

//Example 7//Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
// kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

public static void printElUniqueLowerCaseSortWithLength(List<String>myList){
        myList.stream().
                distinct().//tekrarlının birini alır
                map(t->t.toLowerCase()).//elemanı degistirir
                sorted(Comparator.comparing(t->t.length())).//Sıralamanın kuralını biz belirlersek bunu kullanırız
                //normalde sorted() alfabetik sıraya koyar
                forEach(t-> System.out.println(t+" "));
}




}
