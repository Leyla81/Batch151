package day12SwitchLoops;

public class Loops01 {
    public static void main(String[] args) {

       //Exaanple 1: ekrana 5 kere "hi" yazdırın.
      // 1. WAY (tavsiye edilmez)
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
     //1-->code 'lar clean olmalı.Tekrar olmamalı "Repetition "
     //2-->Dynamic olmalı
     //3-->Tamir(fix) edilebilirve kolay guncellenmeli(Update)
        //*******2.WAY*****
        //NOTE: aynı adımlar tekrar tekrar yapılması gerekiyorsa LOOP kullanılır
        //4 loop vardır 1)for-loop 2) while-loop 3) do- while-loop  4) for-each-loop

     //   1) for-loop kalıbı
     //for(baslangıc degeri;loop calisma sarti ;Artırma/Eksiltme){ calisacak kodlar}
     for(     int i=1      ;   i<6             ;i++ ){
         System.out.println("Hi!");
     }
    //kendi ornegim:
        for(int name =1;name<8;name++){
            System.out.print("leyla"+" ");
        }
     //example: 11 den 14 e kadar tum sayıları ekrana yazdırınız
        for(int i=11;i<15;i++) {
            System.out.print(i+" ");
        }
     //Example: "4" den 24 e kadar tum sayıları aralarına bosluk bırakarak console yazdırın.
     for(int i=4; i >25;i++){
         System.out.print(i+" ");
     }



    //Example:40'dan 23'e kadar tum cift sayilari ekrana yazdırınız
        for(int i= 40;i>22;i--){
           if(i%2==0){
               System.out.print(i +" ");
           }
        }



        //Example:18" den 57 ye kadar tum tek sayıları ekrana yazdır
        for(int i=18;i<57;i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");//yan yana yazdırır
            }
        }
            //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
            for(int i=20; i<75; i++){
                if(i%2!=0){
                    System.out.print(i + " ");
                }
        }
//"Massachusetts" kelimesindeki tum sesli harfleri console yazdır
        String s="Massachusetts";
            for(int i=0; i<s.length();i++){
               char c= s.charAt(i);
               if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
                System.out.println(c+" ");

            }








    }
}
