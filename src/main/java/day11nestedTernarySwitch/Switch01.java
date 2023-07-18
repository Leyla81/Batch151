package day11nestedTernarySwitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {


        //ex:Gun isimlerini kullanıcıdan alınız
        // o gunun kacıncı gun oldugunu ekrana yazdırınız
        // 1-->Sunday -->Monday -->Tuesday -->Thursday -->Friday Saturday

        Scanner input =new Scanner(System.in);
        System.out.println("please enter  a day name...");
        String dayName= input.next();

        //1. WAY:
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        }else if(dayName.equalsIgnoreCase(">Monday")){
            System.out.println("monday is second day...");
        }else if(dayName.equalsIgnoreCase(">Tuesday")) {
            System.out.println("Tuesday is third day...");
        }else if(dayName.equalsIgnoreCase(">Wednesday")) {
            System.out.println("Wednesday is fourth day...");
        }else if(dayName.equalsIgnoreCase(">Thursday")) {
            System.out.println("monday is fifth day...");
        }else if(dayName.equalsIgnoreCase(">Friday")) {
            System.out.println("monday is sixth day...");
        }else if(dayName.equalsIgnoreCase(">Saturday")) {
            System.out.println("monday is seventh day...");
        }else {
            System.out.println("Invalid day name");
        }
        //2. WAY********switch**********değiş demek
        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is second day...");
                break;
            case "tuesday":
                System.out.println("Tuesday is third day...");
                break;
            case "wednesday":
                System.out.println("Wednesday is fourth day...");
                break;
            case "thursday":
                System.out.println("Thursday is fifth day...");
                break;
            case "friday":
                System.out.println("Friday is sixth day...");
                break;
                case "saturday":
                System.out.println("Saturday is seventh day...");
                break;
            default:
                System.out.println("Invalid day name...");


        }










    }


}
