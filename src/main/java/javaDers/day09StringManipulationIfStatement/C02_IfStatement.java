package javaDers.day09StringManipulationIfStatement;

public class C02_IfStatement {
    public static void main(String[] args) {


        //****Interview Question***
        //String ="abbccdc"tekrarsız karakterleri ekrana yazdırın
        // if Statemenlar curly bracesla kapatılır noktalı virgülle degil.
        //
        String str = "aac";

        char ch =str.charAt(0);
        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println(ch);
        }

        char ch1 =str.charAt(1);
        if(str.indexOf(ch1)==str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
            char ch2 = str.charAt(2);
            if(str.indexOf(ch2)==str.lastIndexOf(ch2)) {
                System.out.println(ch2);
            }

// Ex: syaı pozitif ise ekrana 'pozitif sayi' yazdıran kodu yazınız

            int num=20;
            if (num>0){
                System.out.println("pozitif sayi");
            }
    // Ex : sayı -1 ile 10 arasında ise ekrana rakam yazdırınız.
        //0123456789

             int number =12;
            if(number>-1 && number<10){
                System.out.println("Rakam");
            }

//ex : sayı 3 basamaklı ise ekrana "sayı 3 basamaklıdır" yazdırınız

        int num1 =-234;

            num1=Math.abs(num1);// sayı eksi ise + cevirie -234 234 e donustu.

         if(num1>99&&num1<1000){

             System.out.println("Sayi 3 basamaklıdır.");
         }



    }
}