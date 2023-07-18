package sulymanNightTime.day26Abstractions;



    /*
        1)Bazen parent class'daki method'un body'si hicbir child class
          tarafindan kullanilmaz.
          Bu durumda parent'daki method'a body yazmak hic kullanilmadigi
          icin mantikli degildir.
          Biz de o method'a body yazmayiz.
        2)Body'si yazilmayan method'a "Abstract Method" denir.
          Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
        3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
          keyword'unu kullanarak Java'ya bu emthod'un body'si olmayacak deriz.
        4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
          normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
        5) parent taki method ise Abstract metodunu her child class tarafından
          kullanılmak yanı override edilmek zorundadır yoksa hata verir
       6) body si olan methodlar(concrete (somut) method ) abstract
           classların icine yazılabilir
        7)abstract keyword u varsa vucut olmaz.vucut varsa abstract olmaz
       8)Abstract classların içinde abstract methodlar olur
            abstract methodlar bodysi olmadıgı için eksik methodlar olarak düşünülebiir
      Yani abstract class içinde eksik bir yapı barındırır
      siz abstract classdan obje üretirseniz abstract classın eksikliği objeye yansır
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir
      9) abstract class ların constructor ı var ama obje olusturamazlar
      10)"final" methodlar abstract olamazlar
      11) prıvate methodlar abstract olamazlar
      12)abstract clasın abstract child ı veya concrete child ı olabilir.
     */
/*
    "final" keyword u acıklar misiniz?*** INTERVIEW QUESTION***
    1) VARIABLE'LAR DA METHOD'LARDA  CLASS'LARDA KULLANILIR
    VARIABLE larda ===a)variable ya kesınlikle deger atanmalıdır
                   ===b) ilk atana deger hic degistirilmez
    METHOD LARDA ===A)methodun bodysi degistirilemez
                 ===b)method override edilemez
    CLASS larda kullanıldıgında a) final class ın child class ı olmaz ama final class kendisi child olabilir

 */
    public abstract class Courses {
    public abstract void math();//body yok
    public  void art(){  //body var
        System.out.println("Learn art...");

    }


}
