package ssg.nestedforloop;

public class C06_nestedForLoop {


    public static void main(String[] args) {

        /*
        a
        a b
        a b c
        a b c d
        a b c d e
        */
        char ch ='e';
        for (char i = 'a'; i <='e' ; i++) {
            for (char j = 'a'; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }



















    }
}
