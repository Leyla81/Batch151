package day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {

   //"StringBuffer javada String ureten bir Class'dir
        // StringBuffer , StringBuilder'a cok benzer ,yani ikisi de "mutable" String uretir
        //StringBuffer "multi -thread" dir coklu is yapar.ama StringBuilder "multi-threat" degildir.Coklu is yapmaz
        //java StringBuffer"i StringBuilder dan once olusturdu.
        //StringBuilder "Multi Threat" olmadıgı icin daha hızlı calısır.
        // multi threat yapilirken yapılan işlerin sıralaması onem arz eder ,yapılan isleri mantıklı
        // bir sıraya koymak "ssynchronization olarak adlandırılır.


       // 3 String olusturan Class ogrendik;
        //immutable String lazimsa==String class
        //mutable String lazımsa ; StringBuilder veya StringBuffer
        //-------i)StringBuilder multi threat gerekmezse kullanırız.
        //-------ii)StringBuffer'ı multi threat gerekirse kullanırız.

        StringBuffer sbf1 = new StringBuffer("Java");
















    }
}
