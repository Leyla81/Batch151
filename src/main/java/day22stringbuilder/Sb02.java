package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("java is easy");
        System.out.println(sb1);

        sb1.reverse();//Stringi ters cevirir.Stringin ters cevrilmesi looplar ile de yapılır. bu kısa yoldur
        System.out.println(sb1);//ysae si avaj

        sb1.deleteCharAt(6);//index 6 yı siler
        System.out.println(sb1);//ysae s avaj   i"yi siler

        sb1.delete(4,7);//baslangıc indexinden bitis indexine kadar olan bolumu sile 7 haric
        System.out.println(sb1);//ysaeavaj yazdırır.

        sb1.replace(2,5,"X");// verilen 3 karakteri "X" e cevirir.
        System.out.println(sb1);//ysXvaj

        sb1.insert(3,"2023");//ilk 3 karakteri gec sonrasına 2023 ekle
        System.out.println(sb1);

       StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
       int r1 = sb2.compareTo(sb3);
        System.out.println(r1);  //==>0 verir arada fark yok demektir
        //compareTo()methodu alfabetik sıraya koyar
        //sonuc  mesaela -3 ise alfabetik olarak 3 onde demektir
        //sonuc  mesaela 3 ise alfabetik olarak 3 sonra demektir.













    }
}
