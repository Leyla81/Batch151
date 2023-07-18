package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        // kıllanıcıdan alınaverilen bir tamsayinin tekrarsız rakamlarının toplamını bulunuz
        //1838==>1+3=4


Scanner input =new Scanner(System.in);
        System.out.println("please enter an integer...");
        String s= input.next();

        int sum=0;// bos bir konteyner olusturalımki yeni elde edilen bilgiyi koymak icin kullanılır
        for(int i=0;i<s.length();i++){

            String d= s.substring(i,i+1);
            if(s.indexOf(d)==s.lastIndexOf(d)){// indexof sadece stringde kullanılır.index 'ler esitse tekrarsızdır. tekrarsızı yazdırır
                sum=sum+Integer.valueOf(d);
            }

        }
        System.out.println(sum);
        //bir String deki tekrarli karakterleri ekrana yazdıran kodu yazınız.
        //Alabala==>la
        String t ="Alala";
        String result="";//yeni datayi koymak icin bos bir konteynera koyarız

       for(int i =0;i<t.length();i++){

           char ch=t.charAt(i);
           if((t.indexOf(ch)!=t.lastIndexOf(ch))&&!result.contains(""+ch)){ //esit degilse tekrarlıdır.Tekrarlıları yazdırır.
               result=result+ch;
           }

       }
        System.out.println(result);

       //IT ogrenmenının yolları
       //What?(loop nedir)   Why?(nicin kullanılır)  simple Implementation(kolaay uygulamalar),
        // Mid Level İmplementation,Advance Level İmplementation








    }

}
