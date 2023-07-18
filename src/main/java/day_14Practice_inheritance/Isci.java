package day_14Practice_inheritance;

public class Isci extends Muhsebe
{
    /*
bu class'danda obje olusturabiliriz. Bu class'ın child class'larının olması obje olusturmaya engel degil
fakat isciler icin, surekli isci ve ustabası olmaktan baska ihtimal olmadıgı icin
isci class'ında isci uretmeye gerek yok.
 */
    protected String isciStatu="Surekli Isci";
    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calısır");
    }

}
