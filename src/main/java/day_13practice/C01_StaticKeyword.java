package day_13practice;

public class C01_StaticKeyword {

    //bir tane static variable bir tane instance variable olusturalım.bunların kullanımını main method icinde gosterelim


    static int sayi1;//static variable lar main in dısında olusurlar ve gokteki ay gibi herkes icin aynıdır
    int sayi2;//instance variable lar objeye baglıdırlar
    public static void main(String[] args) {

C01_StaticKeyword obj1 =new C01_StaticKeyword();//instance variable ları main icinde kullanabilmek icin olustururuz
// static variable lar icin obj2 ye gerek yoktgur
C01_StaticKeyword obj2 =new C01_StaticKeyword();

        System.out.println(sayi1);//static oldugu icin direct cagırdık
        System.out.println(obj2.sayi2);//instance variableyi obj2 ile cagırdık

        sayi1++;//static oldugu ici direct cagırdık
        obj2.sayi2++;//instace oldugu icin obj2 ile cagırmaliyiz

        System.out.println(sayi1);//1
        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi2);//0 olur.degisiklik yapmadık cunku

        System.out.println(obj2.sayi1);//1
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);//2
        System.out.println(obj2.sayi1);//2


    }



}
