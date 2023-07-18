package suleymanJava.day5StringManiopulation;

public class StringManipulationsC_01 {
    public static void main(String[] args) {

        // Ex1:Type code to check if the seventh charecter of agiven String is "a"or not
        String s ="Alabama State";
        // 1.way:
        boolean result1 =s.charAt(6)=='a';
        System.out.println("Is the seventh character="+result1);// gives true
        //2.Way :
        boolean result2 =s.startsWith("a",6);// toffset means first 6 character skip then the other starts with "a" or not
        System.out.println("Is the seventh character = " + result2);
         
        //Ex 2:Type code tocheck if string ending 'money' or not
        String t = "learn java earn money";
        
        // 1 Way; substring()
       String result3= t.substring(t.length()-5);
        System.out.println("result3 = " + result3);

       boolean result4= t.substring(t.length()-5).equals("money");
        System.out.println("result4 = " + result4);
// 2.way:
      boolean result5=  t.endsWith("money");
        System.out.println("result5 = " + result5);

// example3: type code to convert "money" to "dollar"
        //Note you can use replace() method with char and string
        
       String newt =t.replace("money","dollar");
        System.out.println("result6 = " + newt);// Learn Java Earn dollar
 // ex: type code to convert "a" to "*"?

        String t2 = t.replace('a','*');
        System.out.println(t2);//le*rn J*v* e*rn money

        String t3 = t.replace("earn","win");
        System.out.println(t3);//Lwin java win money

        
        
        
        
        

    }












}
