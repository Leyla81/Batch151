package day14loops;

import java.util.Scanner;

public class Loops04Atm {
    public static void main(String[] args) {


      //kullanıcı username ve password girsin
      //3 kereden faazla yanlıs girerse" your account was blocked"
      //3 kereye kadar yanlıs girerse" Ivalid username or password,try again"msj alsın
      //dogru girerse "Wellcome to your acount"msj alsın.

      Scanner input=new Scanner(System.in);
      int counter=0;
      String validUserName="tecpro123";
      String validPassWord="Education12?";

        /*System.out.println("your account was blocked");

        System.out.println("Please enter your username");      BU KISIMLARI TEKRAR EDECEGİ İCİ DO İCİNE UAZARIZ
        String username=input.next();

        System.out.println("Please enter your password");
        String passWord= input.next();
        counter++;*/


        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while(true);





    }
}








