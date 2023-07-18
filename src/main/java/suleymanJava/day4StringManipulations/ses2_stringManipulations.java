package suleymanJava.day4StringManipulations;

public class ses2_stringManipulations {


    public static void main(String[] args) {

        // Ex 1 = get the first 4 characters from a string and convert them to lower case
        // Albania==>Alba  ==>alba

        String s="GERMANY";
       String t= s.substring(0,4).toLowerCase();
        System.out.println(t);

        //Check ııf two strıng are same or not . gives boolean data

      String r="Java";
      String u="java";
      boolean same=r.equals(u);
        System.out.println(same);// gives false

        boolean same1 =r.equalsIgnoreCase(u);
        System.out.println(same1);// gives true bastaki buyuk kucuk harfi dikkate almaz
        // wvhy  do not we use "==" to compare strings?? VERY IMPORTANT
        // "==" check both values in heap memory and adresses in stack memory
        // "equals" only checks values in heap memory
        String s1="TechPro";
        String s2="TechPro";

        boolean r1 =s1==s2;
        System.out.println(r1);//true heap memoryde yeni bir yer acmaz

        boolean r2 = s1.equals(s2);
        System.out.println(r2);//true

        String t1=">Python";
        String t2 =new String("Python");//heap memory de yeni bir deger olusturur

        boolean d1= t1==t2;
        System.out.println(d1);

        boolean d2 = t1.equals(t2);
        System.out.println(d2);
        //javada "==" kod yazılmaz onun yerine equals kullanılır.




    }




}
