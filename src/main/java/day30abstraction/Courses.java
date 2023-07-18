package day30abstraction;

public abstract class Courses {    //method abstract ise  class da abstract olmak zorundadır

    //methodun body"isi child"lar tarafından kullanılmazsa body yazılmaz body"siz method "abstract"tır
    //body si olmayan butun classlari(abstract)  child class lar "override" etmek zorundadır

    public abstract   void  math();//abstract bir method body yok

    public void art(){ //concrete bir method body si var
        System.out.println("Learn art");
    }
    /*

    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child classlarin
    yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction" yapariz
    2)Bazen parent class daki methodun body si hicbir child class tarafindan kullanilmaz. Bu durumda
    parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir. Bizde o methoda
    body yazmayiz
    3)Body si yazilmayan methoda Abstract Method denir. Abstract ingilizcede vucutsuz yada soyut anlamindadir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak javaya
    bu methodun bodysi olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz,
    o yuzden classi da abstract yapmaliyiz
    6)Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum chidlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir
    7) parent class daki 'concrete' methodu child class"lar tarafıdan override edilmek zorunda degildir
    8)concrete methodlar abstract class ların icine yazılabilir ama abstract methodlar concrete class"ların icine yazılamazlar
     9)final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir, bu yüzden java abstract methodlarin final olamasina musade etmez
    10)abstract classlarin icinde abstract methodlar olur, obstract methodlar body si olmadigindan
    eksik methodlari gibi dusunulebilir
    Yani abstract class icinde eksik bir yapi barindirir, siz abstract classdan object uretirseniz abstact class icindeki
    eksikiilk object'e yansir.
    Java bunu istemez cunku eksik object eksik is yapar buda application'ın yanlis calsimasina sebep olur
    javada applicationu korumak icin abstract classlardan object uretilmesini engellemistir
    11)abstract classlarin constructorlari vardir ama object olusturamazlar
    12)abstract classların abstract childi ya da concret childi olabilir
    13) "abstract methodlar private classlar abstract olamazlar child classlar abstract methodları kullanırlar . private c
     */


















}
