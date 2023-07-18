package day22stringbuilder;

public class StringBuilderQuestions {
    public static void main(String[] args) {

     //pdf question 2
        String s1 ="java";
       // String s2 ="java";
        StringBuilder s2 = new StringBuilder("java");
        if(s1.equals(s2.toString())){
            System.out.println("1");

        }else{
            System.out.println("2");
        }

        //pdf question 1

      StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);



      // pdf  Question 3
        String numbers ="012345678";
       // System.out.println(numbers.substring(1,3));
        //System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));

        //pdf question 4
       int total=0;
        StringBuilder letters =new StringBuilder("abcdefg");
        //total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
       // total += letters.substring(6,5).length();
        System.out.println(total);



        //string i ters cevirme

        String a ="Time is maoney";

        String ba = "";

        for (int i = a.length()-1; i >=0; i--) {

          ba =ba + a.substring(i,i+1);
        }
        System.out.println(ba);
        System.out.println(a);







    }
}
