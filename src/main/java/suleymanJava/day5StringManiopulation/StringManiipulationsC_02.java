package suleymanJava.day5StringManiopulation;

public class StringManiipulationsC_02 {

    public static void main(String[] args) {

        // ex 1: delete all "y"'s from a given String

        String s ="Everything is easy if you study";

        String s1=s.replace("y","");
        System.out.println("s1 = " + s1);//

// Example 2: delete all digits(0,1,2,3,4,5,6,7,8,9) from a given string
        String t="Tom is 13 years old and his GPA is 3.98";
        String t1 = t.replaceAll("[0-9]","");
        System.out.println("t1 = " + t1);



           // What is regex?                                    //different from
        //1== all digits:[0-9]                               1== All characters "different from" (^)  digits [^0-9]
        //2== all lower cases:[a-z]                          2== All characters "different from" (^) lower cases[^a-z]
        //3== all uppercases :[A_Z]                          3== All characters "different from" (^)  uppercases[^A-Z]
        //4== All letters[a-zA-Z]                            4== All characters "different from" (^)  letters [^a-zA-Z]
        //5==all letters and digits[a-zA-Z0-9]               5== All characters "different from" (^)  letters and digit[^a-zA-Z0-9]
        //6 ==all vowels==[aeiouAEIOU]                       6== All characters "different from" (^)  vowels [^aeiouAEIOU]
        //7 ==all punctuation marks==\\p{punct}

      //ex:delete all vowel from agiven String
        String u="Tom are you here";
       String u1= u.replaceAll("[aeiouEAIOU]","");
        System.out.println("u1 = " + u1);

        //ex=count how many digits are ther in a string
        String n = "Tom is 13 years old and his GPA is 3.98";
       int n1= n.replaceAll("[^0-9]","").length();
        System.out.println("n1 = " + n1);

        // ex: chec the user 's password according to the givern rules
        //      1. password  should have 8 characters
        //      2. password shouldnt have 'space' character
        //      3. password should have at least 1 uppercase
        //      4. password should have at least 1 lowercase
        //      5. password should han at least 1 symboll
        //      6. password should han at least 1 digit

        String pwd ="As1?fdes3";

        //      1. password  should have 8 characters
        boolean first = pwd.length()>7;
        System.out.println("first = " + first);

        //      2. password shouldn't have 'space' character
       boolean second= pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("second = " + second);

        //      3. password should have at least 1 uppercase
       boolean third= pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);

        //      4. password should have at least 1 lowercase
       boolean fourth= pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        //      5. password should have at least 1 symbol
       boolean fifth =pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println("fifth = " + fifth);
        
        //      6. password should have at least 1 digit
        boolean sıxth =pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("sıxth = " + sıxth);





    }


}
