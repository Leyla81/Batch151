package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String,Integer>stdAges = new HashMap<>();
        stdAges.put("Ajda",72);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);

        System.out.println(stdAges);


       // replace() methodu valueleri degistirmek icin kullanilir. ornek ("Ezel", 38) iken
        // stdAges.replace("Ezel, 39); ile value yani 38, 39'a cevrildi. Bu
        // method keyleri update etmeye yarar. Valuleri update etmek icin replace() kullanilabilir,
        // ancak valuleri degistirmek istedigimizde put() yerine replace
        // kullanmak en makul olanidir. Okunabilirlik acisindan replace methodu tercih edilir.
        stdAges.replace("ezel",39);
        System.out.println(stdAges);

       // Replace() methodlarindan biri sadece key'e bakiyor, diger replace() methodunda
        // key'nin eski degerine(value)
       // bakiyor ve degistiriyor. Yani iki is yapiyor
        stdAges.replace("Angelina",57 ,61);
        System.out.println(stdAges);

        //putIfAbsent(); methodu Map icinde eger "Ali" key yoksa Map"e Ali=60'i ekler, varsa eklemez
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //get() methodu ile ornek "Tom" yazdigimizda Map icinde Tom varsa Java, Tom'u verecek. Var olmayan key icin null verir.
        //getOrDefault() methodunda ise ornek "Tom", 0 yazdigimizda Java bize Tom' key'inin Map'deki value'sunu verir. Ornek
        //sadece 83'u verdi, ayrica key olan Tom'u yazdirmadi. Olmayan key halinde bu method null degil, '0' verir.
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("tom",0));

        System.out.println(stdAges.get("Ayse"));
        System.out.println(stdAges.getOrDefault("Ayse", 0));

      //  containsValue() methodunu Stringlerde var mi diye bakmak icin kullanmistik. Burada da valuelerin icinde o deger
        // var mi diye bakar. Keylerin icinde o deger var mi? Contains methodu her zaman boolean dondurur. Yani true ya da
      //  false gorecegiz ekranda. Method icine yazdigimiz ornek 99 yazarsak ve o deger yoksa map icinde bize false verir.

         //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));

        stdAges.remove("Ali");
        System.out.println(stdAges);

        stdAges.remove("Tom",81);
        System.out.println(stdAges);

        /*
        size() methodu kac tane entry oldugunu soyler. Collectionlarda da kullandik.
putAll() methodu, bir Map'in icine baska bir Map koymaya yarar. Bunun icin birden fazla Map olmali.
Degisen ilk Map'tir. Hangi Map, digerine konulursa, konulan degismiyor.
         */
        HashMap<String,Integer>kidsAge = new HashMap<>();
        kidsAge.put("john",12);
        kidsAge.put("jim",12);
        kidsAge.put("jack",12);
        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);// {John=12, Jack=32, Jim=22}




/*
        entrySet() methodu tum entryleri bir setin icine koyarak verir.




        Replace() methodlarindan biri sadece key'e bakiyor, diger replace() methodunda key'nin eski degerine(value)
        bakiyor ve degistiriyor. Yani iki is yapiyor.

        replace("Angelina", 57, 61); methodu Map'in icinde "Angelina", 57 varsa 57'yi 61'e donusturur, yoksa donusturmez.
        Yani value Map icinde 57 ise degistirecek. 57 olan value yoksa bir degisiklik yapmayacak.

        putIfAbsent(); methodu, yoksa oraya ekleme yap diyoruz. Ornek "Brad", 60 yazdik bu method icine ve Map'e method ile
        bakildi, Map'de "Brad" ,58 oldugundan bir degisiklik yapilmadi. Cunku key olarak Brad var. */





















    }
}
