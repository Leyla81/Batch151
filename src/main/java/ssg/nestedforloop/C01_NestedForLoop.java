package ssg.nestedforloop;

public class C01_NestedForLoop {
    public static void main(String[] args) {



   //asagıdakı sekli nestedsız loop ile yazdıran kodu yazınız
   /*
      * * * * * *
      * * * * * *
      * * * * * *
      * * * * * *
    */
        //1.yol
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        //2.ypl
        for (int i = 0; i < 6; i++) {
            System.out.println("* ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("* ");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.println("* ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println("* ");
        }
        System.out.println();

        //3.yol://nestedFor

        for (int i = 0; i <4 ; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.println("*");
            }
            System.out.println();
        }












    }
}
