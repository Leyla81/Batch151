package day14loops;

import java.util.Scanner;

public class Loops03DoWhile {
    public static void main(String[] args) {


        int i=1;
        while(i<1){//while loop da loop body'sinin calısmamasi mumkundur.(Zero execution is possible)
            System.out.println("while loop");
            i++;//bu kod ekrana hic birsey yazmaz.cunku 'while' once dusunur sonra yapar. ilk once kontrol eder.
        }


        //do-while ==>once yapıyor sonra dusunuyor...once yapıyor sonra kontrol eder.
        // genellikle oyunlarda do while kullanılır
        int k =1;

        do{
            System.out.println("d-while-loop");//ekrana yazdırır
            k++;
        } while(k<1);

        //kullanıcı bir sayı girsin sayi 100 den kucuk ise kullanıcı
        // "Kazandınız" msj alsın diger durumlarda "Kaybettiniz" msj aldınız

        Scanner scan=new Scanner(System.in);


        do{
            System.out.println("Please enter an integer...");//bunu iceri yazmamızın sebebi tekrar tekrar yapacak
            int n= scan.nextInt();

            if(n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost");
                break;
            }

        }while(true);//loop surekli calısır

        //kulanıdan aldıgımız cumlenın buyuk harfle baslayıp nokta ile bittigini kontrol eden kodu yazınız.
      Scanner input=new Scanner(System.in);

        do{
            System.out.println("Please enter a word");//tekrarlanan kod hep loopun icinde yer alır,
            String s=input.nextLine();

            if(s.endsWith(".")&&(s.charAt(0)>='A'&&s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct gramaticly");
            }else{
                System.out.println("your sentence is gramatical mistake");
                break;
            }
        }while(true);//false olursa bir kez calısır tekrarlı is yaptıracagımız icin do-while kullanırız

















    }
}
