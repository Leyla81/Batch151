package suleymanJava.day07ifStatement;

public class IfStatment01 {
    public static void main(String[] args) {
        //Example : tpe code check if a given character is upper case or lowercase or others
        char ch= 'S';
        if(ch>='A'&&ch<='Z'){
            System.out.println("upper case....");
        }else if(ch>='a'&&ch<'z'){
            System.out.println("lower case...");
        }else{
            System.out.println("other...");
        }
      // Ex: if the number less than 300 or greater than 3000 prınt
        //       "perfect number"on the console, otherwise
        //       print "regular number on the console.
        int num = 3200;
        if(num<300 ||num>3000){
            System.out.println("perfect number...");
        }else{
            System.out.println("regular number...");
        }
// Ex :type code to check if a number is "even" or "odd"
// "Even" sayının 2 ye bolumunden kalan 0 olmalı .
// "Odd" sayının 2 ye bolumunde kalan sayı olmalı.
        int n=7;//odd
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        //Ex :tpe code to prınt number of month for the given month name
        //
        String monthName="march";
        if (monthName.equals("january")){
            System.out.println(1);

        }else if(monthName.equals("january")){

        }else if(monthName.equals("february")){

        }else if (monthName.equals("march")){

        }else if(monthName.equals("april")){

        }










    }




}
