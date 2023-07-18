package day_13practice;

public class C02_StaticKeyword {
    //bu class calıstıgında output ne olur ve calısma mantıgı nedir

    static int y;
    int x;
    public C02_StaticKeyword(int i){
        x+=i;//x degerine i yi ekleyecegiz obj. parametresinde i ye 2 eklemistik
        y+=i;//static olan y ye i yi ekledik

    }

    public static void main(String[] args) {

       C02_StaticKeyword obj1=new C02_StaticKeyword(2);//parametreli olusturdugumuzda constructor olusturmalıyız
       C02_StaticKeyword obj2=new C02_StaticKeyword(3);

        System.out.println(obj1.x +" ,"+obj2.x +", "+y);//2,3,5 y static oldugunda obj ile cagırmaya gerek yok
                           //2 dir       3             5 olur





    }

}
