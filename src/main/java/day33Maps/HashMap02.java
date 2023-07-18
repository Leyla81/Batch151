package day33Maps;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

    //HashMap arkadaki meekanizma nasıl calısır
        HashMap<String,String>capitals = new HashMap<>();

        //java hashmap de 16 buckets(kova) olusturur. bir bucket a istediğimiz kadar entry koyabiliriz
        //Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
        //Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode",
        // "key" ve "value" u koyar.
        //Java bucket'larin icinde LinkedList kullanir.
        //Eger daha once ayni entry ile bir "HashCode" uretildiyse Java tekrar bir "HashCode" uretmez ama "value" degisti ise "overwrite" islemi yapar.
           //Java 12 bucket doldugunda yeni 16 adet bucket verir
        capitals.put("USA","Washington");
        capitals.put("Italy","Rome");
        capitals.put("turkey","Ankara");

          capitals.get("Turkey");





    }
}
