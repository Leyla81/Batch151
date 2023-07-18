package LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));
        System.out.println(KrtrCiftOlanYazdır(iller));
        System.out.println();
        System.out.println(KrtrCiftOlanYazdır1(iller));
        System.out.println();
        System.out.println(KarakterSys5tenFazlaElsil(iller));
        System.out.println();
        System.out.println(HileBaslayauileBitenElSil(iller));
        System.out.println();
        System.out.println(KarakterSylarınınKaresiniAlma(iller));
        System.out.println();
        System.out.println(KarakterSylarınınKaresiniAlma1(iller));
        System.out.println();


    }
    ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String>KrtrCiftOlanYazdır(List<String>iller){
        return iller.
                stream().
                filter(t->t.length()%2==0).
                collect(Collectors.toList());
    }

    public static List<String>KrtrCiftOlanYazdır1(List<String>iller){
        return iller.
                stream().
                filter(Utils::ciftMi).
                collect(Collectors.toList());
    }






        // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
public static List<String>KarakterSys5tenFazlaElsil(List<String>iller){
        iller.removeIf((t->t.length()>5));//removeIf()methodu parantez icindeki sarta uyarsa si demek
        return iller;
}


        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

public static List<String>HileBaslayauileBitenElSil(List<String>iller){
        iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
        return iller;
}

        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
public static List<Integer>KarakterSylarınınKaresiniAlma(List<String>iller){
        return  iller.
                stream().
                map(t->t.length()*t.length()).//Bu yapıya Lambda expression
                collect(Collectors.toList());//Liste icinde topla demek

}
      //2.yol
    public static List<Integer>KarakterSylarınınKaresiniAlma1(List<String>iller){
        return  iller.
                stream().
                map(Utils::KaresiniAl).//method Referans tır
                        collect(Collectors.toList());
    }



    }

