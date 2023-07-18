package day35Exceptions;

public class E03 {
    public static void main(String[] args) {
        String s ="Java";

        getCharFromString(s,2);
        getCharFromString(s,4);

    }


    public static void getCharFromString(String s,int index){
        try {
            char ch = s.charAt(index);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullandınız"+e.getMessage());
            System.out.println(e.getCause());
        }


    }














}
