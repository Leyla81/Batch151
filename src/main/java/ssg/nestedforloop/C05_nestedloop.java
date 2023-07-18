package ssg.nestedforloop;

public class C05_nestedloop {
    public static void main(String[] args) {
          /*
    * * * * .
    * * * . .
    * * . . .
    * . . . .
    . . . . .

     */
        int sayi =5;

        for (int i = 1; i <=sayi ; i++) {// ilk for her zaman satır sayısıdır
            for (int j = 1; j <= sayi-i; j++) { //sutun sayısını gosterir

                System.out.print("* ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }



















    }




















}
