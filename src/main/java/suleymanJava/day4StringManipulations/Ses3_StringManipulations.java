package suleymanJava.day4StringManipulations;

public class Ses3_StringManipulations {

    public static void main(String[] args) {

        //Ex 1: check the password ıf ıt has giveb rules
        //       i)ıt will star with "J"
        //       ii) ıt should have aat least 8 characters
        //       iii) last 3 Character should be "AVA"

        String pwd="J12!?AVA";

       // i)ıt will star with "J"
        boolean first=pwd.startsWith("J");
        System.out.println("first rule = " + first);

        //  ii) ıt should have aat least 8 characters
        boolean second =pwd.length()>7;
        System.out.println("second rule = " + second);

        //iii) last 3 Character should be "AVA"
       boolean third= pwd.substring(5,8).equals("AVA");
        System.out.println("third rule = " + third);
   //NOTE: If you want to get characters from an index to the last character,
        // use "substring()"method just with the starting index


    }

}
