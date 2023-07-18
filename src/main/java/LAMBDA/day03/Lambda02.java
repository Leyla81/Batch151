package LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/* *************** Match***************
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==> en az bir ya da birden daha fazla eleman sarti saglarsa  true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */
public class Lambda02 {   public static void main(String[] args) {

    Universite u1 =new Universite("hacettepe","fizik",1000, 75);
    Universite u2 =new Universite("bilkent","matematik",2000, 80);
    Universite u3 =new Universite("odtu","java",4000, 85);
    Universite u4 =new Universite("bogazici","sql",4500, 90);
    Universite u5 =new Universite("itu","resim",5000, 90);
    Universite u6 =new Universite("erciyes","api",6000, 75);
    Universite u7 =new Universite("karaelmas","muzik",7000, 80);
    Universite u8 =new Universite("marmara","bilgisayar",8000, 100);

    List<Universite>myList=new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));

    System.out.println(notOrt75tenByk(myList));
    System.out.println();
    System.out.println(matBolumuVarMı(myList));
    System.out.println();
    System.out.println(ogrncSysGoreByktenKcgeSıralistYap(myList));


}//main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.
public static boolean notOrt75tenByk(List<Universite>myList){
    return myList.
            stream().
            allMatch(t->t.getNotOrtalamasi()>75);
}

    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.

public static boolean matBolumuVarMı(List<Universite>myList){
    return    myList.
            stream().
            anyMatch(t->t.getBolumAdi().
                    equalsIgnoreCase("matematik"));
}



    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.

 public static List<Universite> ogrncSysGoreByktenKcgeSıralistYap(List<Universite>myList){

    return myList.
             stream().
             sorted(Comparator.
                     comparing(Universite::getOgrenciSayisi).
                     reversed()).
             collect(Collectors.toList());


 }
























}
