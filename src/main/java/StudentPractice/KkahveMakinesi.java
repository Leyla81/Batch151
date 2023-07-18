package StudentPractice;

import java.util.Locale;
import java.util.Scanner;

public class KkahveMakinesi {




    Scanner input =new Scanner(System.in);
    String option;
    void showMenu(){
        System.out.println("Wellcome to cafee Hayal");
        System.out.println("Wellcome to cafee Hayal");
        System.out.println("\n");
        System.out.println("1 . Turk Kahvesi");
        System.out.println("2 . Filtre Kahve");
        System.out.println("3 . Espresso");
        System.out.println("4 . Exit");


        do{
            System.out.println("***********************************************************");
            System.out.println("Enter an option");
            System.out.println("***********************************************************");
            option = input.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("\n");

            switch (option){
                case "Turk kahvesi":
                    System.out.println(option+ "Hazırlanıyor");
                    System.out.println("\n"+"\n");
                    secenekler();
                    break;
                case "Fitre Kahve":
                    System.out.println(option+ "Hazırlanıyor");
                    System.out.println("***************************************");
                    System.out.println("\n"+"\n");
                    secenekler();
                    break;
                case "Espresso":
                    System.out.println(option+ "Hazırlanıyor");
                    System.out.println("*******************************************");
                    System.out.println("\n"+"\n");
                    secenekler();
                    break;
                case "EXIT":
                    System.out.println(option+ "Hazırlanıyor");
                    System.out.println("******************************************");
                    System.out.println("\n"+"\n");
                    secenekler();
                    break;
                default:
            }

        }while(!option.equalsIgnoreCase("EXIT"));




    }

     void secenekler() {

        do {
            System.out.println("Sut eklememizi ister misiniz (evet veya hayır olarak cevaplayınız)");
            String strSeker =input.nextLine();
            if (strSeker.equalsIgnoreCase("evet")){
                System.out.println("Sut ekleniyor....");
                System.out.println("******************************************");
                System.out.println("\n"+"\n");
            } else if (strSeker.equalsIgnoreCase("hayır")){
                System.out.println("Sut eklenmiyor!!!");
                System.out.println("******************************************");
                System.out.println("\n"+"\n");
            }else {
                System.out.println("Lutfen gecerli bir deger giriniz");
                System.out.println("*************************************");
                System.out.println("\n"+"\n");
            }

        }while (true);

        /*do {

            System.out.println("Seker eklememizi ister misiniz (evet veya hayır olarak cevaplayınız)");
            String strSut =input.nextLine();

            if (strSut.equalsIgnoreCase("evet")){

                System.out.println("Kac Seker istiyorsunuz");
                int kacSeker =input.nextInt();

                System.out.println(kacSeker+ "Seker ekleniyor....");
                System.out.println("******************************************");
                System.out.println("\n"+"\n");
            } else if (strSut.equalsIgnoreCase("hayır")){
                System.out.println("Sut eklenmiyor!!!");
                System.out.println("******************************************");
                System.out.println("\n"+"\n");
            }else {
                System.out.println("Lutfen gecerli bir deger giriniz");
                System.out.println("*************************************");
                System.out.println("\n"+"\n");
        }


        }while (true);*/

}}