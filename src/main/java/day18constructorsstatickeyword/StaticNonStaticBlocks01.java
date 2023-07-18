package day18constructorsstatickeyword;

import java.time.LocalDate;

/*
1. static blocklar static variablelara ilk degerlerini atamak(initialiize) icin kullanilir.
2. static bir variable deger atamak icin kod yazmaniz gerekirse static block kullaniniz
3. static bir variablea deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama static block icine
yazilan kod main method icine yazilandan once calistirilir.
4. bir classda bir"den fazla static block varsa ustteki once calistirilir
 */
// Statik block nasıldır =====>  static{      }



public class StaticNonStaticBlocks01 {



    //static variable"ler "static block" kullanılmadan da "initiaze" edilebilirler
    public static double pi=3.14;
    //"Static variable"ler "static block" kullanılarak da initialize edilebilirler.
    // Asagıdaki gibi "static " bir variable a deger atamak icin kod yazmamız gerekirse "static block" kullanırız

    public static double price;

    static{
        System.out.println("hey i am static block..");
        LocalDate d = LocalDate.now();//suanki ayı verir.
        if(d.getMonthValue()==3){
            price=1000;
        }else{
            price=1200;
        }
    }

    public static void main(String[] args) {
        System.out.println("hey i am main method..");
        LocalDate d = LocalDate.now();//suanki ayı verir.
        if(d.getMonthValue()==3){
            price=1000;
        }else{
            price=1200;
        }













    }





}
