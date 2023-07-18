package ssg.passByValueOverLoading;



public class C05_overLoading {
    public static void main(String[] args) {
        /*
       3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
       2. methodda 1 tane double 1 tane int deger carpalim
       3. methodda 2 tane double deger carpalim
 */

        carpim(7,15);
        carpim(7.5,2);
        carpim(5.6,6.5);
    }//autoWiding

    private static void carpim(double a, double b) {

        System.out.println(a * b);
    }

    private static void carpim(double a, int b) {

        System.out.println(a*b);
    }

    private static void carpim(int a, int b) {
        System.out.println(a*b);

}
}
