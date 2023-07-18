package day11nestedTernarySwitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {
     //kullanıcıdan 0'dan kucuk 120'den buyuk deger giremeyeceksekilde datalari aldıktan sonra
        //eger calisan kadınsa 60 yasında buyukse "Emekli olabilir" yazdiran
        //eger calisan erkek ise 65 yasında buyukse "Emekli olabilir" yazdıran

// note "if" icinde "if" kullanırsanız "nested if" olusturmussunuz demektir
        // "nested if" javayı yavaslatır bu yuzden mecbur kalmadıkca kullanmayız
        //"nested if" gibi javayi yavaslatan kodlar   "Time consuming" olarak adlandırılır
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age=input.nextInt();

        System.out.println("Please enter your gender...");
        String gender =input.next();

        if (age<0||age>120){
            System.out.println("Negative ages are invalid...");
        }
        else if (gender.equals("male")){
            if (age>65){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }
        }else if(gender.equals("female")){
            if( age>60){
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            }
        }else{
            System.out.println("undifined gender");
        }














    }
}
