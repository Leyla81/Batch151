package day35Exceptions;

public class E04 {
    public static void main(String[] args) {

        String arr[]={"A","B","G","K"};
        getElementFromArray(arr,2);

        getElementFromArray(arr,5);//burda hata(exception) verir  sınırın dısında



    }
    public  static  void  getElementFromArray(String[] s, int idx){
        try{
            String el =s[idx];
            System.out.println(el);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        System.out.println("try-catch gorev tamamlandı");
    }






















}
