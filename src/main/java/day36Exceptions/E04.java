package day36Exceptions;

public class E04 {
    /*
    * throw keyword bir method bodysi icinde istedigimiz yerde, istedigimiz kosullar icin,
    istedigimiz kadar Exception atmamizi saglar
    * throw keywordu yazildiktan sonra bir Exception Class Objecti olusturulur.
    * Exception class constructor inin parantez icine istedigimiz Exception mesajini yazabiliriz

*/
//************throw ile throws arasındaki farklar******
    /*1)"throw" method body sin icinde "throws"  ise method parantezınden hemen sonra kullanılır
     *2)"throw" dan sonra "new" keyword ve constructor kullanılarak obje olusturulur
     * "throws"dan sonra sadece Exception Class ismi kullanılır
     * 3)"throw" belli sartlar icin exception atmada kullanılır "throws" ise applicationu

     */
    public static void main(String[] args) {
        printAge(-3);


    }


   public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age can not be negative");

        } else if (age>150) {
            throw new IllegalArgumentException("Age can not be older than 150");

        } else{
            System.out.println(age);
        }


   }







}
