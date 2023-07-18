package day16arraysforeachloopMehmetHoca;

import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */

//Kullanıcı surekli işlem yapacagı icin loop kullanılır
        Scanner input=new Scanner(System.in);
        System.out.println("please to stop calculation, press 'q' ");

        do{
            System.out.println("please enter the operation you want to do among +, -, *, /, % ");
            char opr =input.next().toLowerCase().charAt(0);
           if (opr=='q'){
               System.out.println("see you again...");
               break;
           }
           boolean r = opr == '+' || opr =='-' || opr== '*'|| opr == '/' || opr == '%';
           if(!r) {
               System.out.println("undefined operation");
               break;
           }
            System.out.println("enter first number..");
           int n1 =input.nextInt();
            System.out.println("enter second number..");
            int n2 =input.nextInt();


            switch(opr){
                case'+':
                    System.out.println(n1 + "+" +n2 +"= "+(n1 + n2));
                    break;
                case'-':
                    System.out.println(n1 + "-" +n2 +"= "+(n1 - n2));
                    break;
                case'*':
                    System.out.println(n1 + "*" +n2 +"= "+(n1 * n2));
                    break;
                case'/':
                    System.out.println(n1 + "/" +n2 +"= "+(n1 / n2));
                    break;
                case'%':
                    System.out.println(n1 + "%" +n2 +"= "+(n1*n2/100));
                    break;
            }

        }while(true);















    }
}
