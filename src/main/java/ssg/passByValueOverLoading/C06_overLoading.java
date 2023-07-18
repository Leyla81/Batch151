package ssg.passByValueOverLoading;

public class C06_overLoading {
    public static void main(String[] args) {
        toplam(5.6,7.8);
        toplam(6.7,57);
        toplam(57,19);

    }

    private static void toplam(double a,double b){
        System.out.println(a+b);
    }
    private static void toplam(double a,int b){
        System.out.println(a+b);
    }
    private static void toplam(int a,int b){
        System.out.println(a+b);
    }
}
