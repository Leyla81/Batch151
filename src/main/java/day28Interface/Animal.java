package day28Interface;

public interface Animal {
    void eat ();//abstract method'dur. child classda override edilmeli
    void drink();

    /*1)interface ler deki tum variable lar otomatic olarak final dır .
         bu yuzden interface icindeki variable i olusturdugunuzda mutlaka deger ataması yapmalısınız
        Bilindigi final variablelerin degerleri degistirilemez
    2) ınterface ledeki tum variable'lar otomatik olarak "public" dir.
    3)   ınterface ledeji tum variable lar otomatik(default) olarak "static" dir
    */

    int age =4;
}
                  //********ınterview question***********
//*******Abstract class ile interface arasındaki farklar nelerdir*****************
/*
1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
  Ama inderface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
2)Abstract Class'lar multuple inheritance'i desteklemez ama interface'ler destekler.
3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
4)"interface" Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
5) Abstract classlarda constroctor vardır ama obje uretemez. interface lerde constructor yoktur bu yuzden object uretemez.

 */