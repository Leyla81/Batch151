package day_09Practice;

import java.util.Scanner;

public class C01_BurcHesaplama {
    public static void main(String[] args) {
        // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dogum  ayınızı String  olarak giriniz");
         String ay = scan.next();

        System.out.println("Lutfen dogum gununuzu integer olarak giriniz");
        int gun = scan.nextInt();

        String burc ="";

        if(ay.equalsIgnoreCase("Ocak")){
          if(gun>22){
              burc="Kova";
          }else{
              burc="Oglak";
          }

        }
        if(ay.equalsIgnoreCase("Subat")){
            if(gun>20){
                burc="Balık";
            }else{
                burc="Kova";
            }

        }if(ay.equalsIgnoreCase("Mart")){
            if(gun>22){
                burc="Koc";
            }else{
                burc="Balık";
            }

        }if(ay.equalsIgnoreCase("Nisan")){
            if(gun>21){
                burc="boga";
            }else{
                burc="Koc";
            }

        }if(ay.equalsIgnoreCase("Mayıs")){
            if(gun>22){
                burc="İkizler";
            }else{
                burc="boga";
            }

        }if(ay.equalsIgnoreCase("Haziran")){
            if(gun>22){
                burc="yengec";
            }else{
                burc="ikizler";
            }

        }if(ay.equalsIgnoreCase("Temmuz")){
            if(gun>23){
                burc="Aslan";
            }else{
                burc="yengec";
            }

        }if(ay.equalsIgnoreCase("Agustos")){
            if(gun>22){
                burc="basak";
            }else{
                burc="Aslan";
            }

        }
        if(ay.equalsIgnoreCase("Eylul")){
            if(gun>22){
                burc="Terazi";
            }else{
                burc="Basak";
            }

        }if(ay.equalsIgnoreCase("Ekim")){
            if(gun>22){
                burc="Akrep";
            }else{
                burc="Terazi";
            }

        }if(ay.equalsIgnoreCase("Kasım")){
            if(gun>22){
                burc="Yay";
            }else{
                burc="Akrep";
            }

        }if(ay.equalsIgnoreCase("Aralık")){
            if(gun>22){
                burc="Oglak ";
            }else{
                burc="Yay";
            }

        }

        System.out.println(gun+ " " +ay+ " "+ "tarihinde dogduysanız = "+ burc);




    }
}
