package javaDers.day07StringManipulation;

public class C01StringManipulations {

    public static void main(String[] args) {
        
        String s ="learn Java earn money";
        
                       //****************endsWith*****************
        
     //example s string inin money ile bitip bitmedigini kontrol ediniz :true false dondurur.
        
        boolean isEnd =s.endsWith("money");
        System.out.println("isEnd = " + isEnd);
        // yada

        System.out.println(s.endsWith("money"));

                   //**************replace*************
      //replace:metnin icerisindeki belirli bir datanın yerine verilen diğer datayı yerlestiri String bir data dondurur
      //ex : s stringindeki "money" kelimesini dolar kelimesi ile yer degistiriniz
        // Teklı karakterler ile de coklu karakterler ile de calisir
        //her iki tarafta da tek tırnak ya da cift tırnak kullanılmalıdır.
        String s1 = s.replace("money","dolar");
        System.out.println("s1 = " + s1);

       // ex: s aStringinde "earn" kelimesini win ile degistiren kodu yazınız
        System.out.println(s.replace("earn","win"));

   // ex:s stringindeki a harfini * ile degistiriniz
        String s2 = s.replace("a","*");
        System.out.println("s2="+s2);
        // ya da soyle de yapılır.

        System.out.println(s.replace('a','*'));


       // ex:s stringindeki n harfini *** ile degistiriniz
        String s3=s.replace("n","***");
        System.out.println("s3 = " + s3);
        // ya da
        System.out.println(s.replace("n","***"));

       // s String inde butun "e" harflerini siliniz
        String s4=s.replace("e","");
        System.out.println("s4 = " + s4);
        //ya da soyke de yaoılır.
        System.out.println(s.replace("e",""));

        String t ="Yucel 25 ya$ındadır sandık ama 30'mus!.";
        //*****************replaceAll()***********
       // 3) replaceAll () : Bir grupp datayi degistirmek icin kullanilir.
       // Bir grup data'yi ifade edebilmek icin Regular Expression (Regex) kullanilir

        //ex :tum rakamlarını * a ceviriniz
        String t1=t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);
        // ya da
        System.out.println(t.replaceAll("[0-9]","*"));

    // en cok kullanılan regexler:
        //1. Tum rakamlar==> [0-9]
        //2. tum kucuk harfler ==>[a-z]
        //3. tum buyuk harfler ==>[A-Z]
        //4. tum harfler ==>[a-zA-Z]arya virgul konmaz
        //5. tum harfler ve rakamlar==>[a-zA-Z0-9]
        //6.tum noktalama isaretleri==>\\p{puncht}
        //7. tum sesli harler==>[aeiouAEIOU]
        // ******** ^  ==>den farklı  haricdemek******
        //1. Tum rakamlar haric==> [^0-9]
        //2. tum kucuk harfler haric==>[^a-z]
        //3. tum buyuk harfler hariç ==>[^A-Z]
        //4. tum harfler haric==>[^a-zA-Z]arya virgul konmaz
        //5. tum harfler ve rakamlar haric==>[^a-zA-Z0-9]
        //6.tum noktalama isaretleri haric==>\\p{puncht}
        //7. tum sesli harler haric==>[^aeiouAEIOU]

  //ex: t Strıngindeki tum rakamları ve harfleri unleme ceviriniz
        String t2 =t.replaceAll("[a-zA-Z]","!");
        System.out.println("t2 = " + t2);
       // ya da
        System.out.println(t.replaceAll("[a-zA-Z0-9]","!"));
  //bosluk haric hepsini + ya cevir.
        String t3 = t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3);

        String t4 = t.replaceAll("[^a-z ]","?");
        System.out.println("t4 = " + t4);

 //
      String t5 =t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);
    }
    
}
