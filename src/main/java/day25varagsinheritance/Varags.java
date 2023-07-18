package day25varagsinheritance;

public class Varags {
    public static void main(String[] args) {

        //toplama islemi yapan bir kod
        //asagıdaki gibi farklı methodları olusturarak dynamic cozum uretemeyız
        //public static int toplama (int a,int b,int c){
        //return a+b;}
        //cunku kullanıcı farklı sayıdaki sayıları toplamak her zaman isteyebilir
        //her ihtimal icin bir methodu olusturmak mumkun degil
        //java farkli sayıdaki parametrelerin hepsini kabul eden bir yapı ollusturmustur
        //bu yapıya Varags denir
       System.out.println( add(5,2,7,8,9,7,5));
        getinitials("Ali Can","Kemal Han");

    }
    //varags da istediğimiz kadar sayı koyabiliriz dipsiz kuyu gibi
    public static int add(int...a){ //main methodun icinden cagırmak istedigimiz zaman static yapmalıyız yoksa hata verir
        int sum =0;//elde edilecek toplama işlemi icin bos konteyner olusturduk
                for (int w:a){
                    sum=sum+w;
                }
        return sum;
    }
//bir method parantezınde birden fazla varags kullanılmaz=== public static int add(int...a, int...b) gibi
    //bir method parantezınde birden fazla parametre kullanılacaksa Varags sonda olmalıdır
    // ===== public static int add(int a, int...b) gibi1. int varags degil.

    //Example :  Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //         Ali Can ==> AC    Kemal Han ==> KH
public static  void getinitials(String...s){
        String initials ="";

        for (String w: s){
        initials = initials+    w.charAt(0)+w.split(" ")[1].charAt(0);
            System.out.println("initials = " + initials);
            initials="";

        }
}




}
