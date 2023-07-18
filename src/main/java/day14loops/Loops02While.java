package day14loops;

import java.util.Scanner;

public class Loops02While {

    public static void main(String[] args) {

  //3 den "8" e kadar tum tamsayilari konsola yazdıraan kodu yazınız.

  //1 WAY
  for(int i=3;i<9;i++){
      System.out.print(i+" ");
  }
        System.out.println();

//2 Way;
        int i=3;
  while(i<9){
      System.out.print(i+" ");
      i++;

        }
        System.out.println();
//21'den 180 e kadar hem 4 hem 6 ile bolunebilen tamsayilari console yazdırınız
        for(int k =21;k<181;k++){
            if(k%4==0 && k%6==0){
                System.out.print(k+" ");
            }
        }
        System.out.println();
//2. Way
        int k=21;
        while(k<181){
            if(k%4==0 && k%6==0){
                System.out.print(k+" ");
            }
           k++;
        }
        System.out.println();

        //Size verilen kucuk harfle yazılmaıs String'in index i cift sayi olan charakter lerinibuyuk harfe donusturun
        //miami==>MiAmI
        // 1.way
        String s = "miami";

        for( int i1=0; i1<s.length();i1++){

            String ch= s.substring(i1,i1+1);
            if(i1%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }
        System.out.println();

        //2.yol
        String s1="miami";
        int m=0;

        while(m<s1.length()){

            String ch =s1.substring(m,m+1);

            if(m%2==0){
                System.out.print(ch.toUpperCase());

            }else{
                System.out.print(ch);
            }
            m++;//burası yazılmazsa durmadan yazdırır ve sonsuz loop(infinite loop) olusur
        }
        System.out.println();
// Sıze verilen tamsayinin toplamını konsola yazdıran kod yazınız
        int r=578;//ekrana 20 yazdırır
        r=Math.abs(r);

        int sum =0;

        while(r>0){

          sum=sum+r%10; //modulus '%' her zaman son sayıyı verir

            r=r/10;
        }

        System.out.println(sum);


//r=Math.abs(r)====>bu kodu yazarsak -578 olsa bile kod calısır eksiler icin de calısır

    //Example: kullanıcıdan aldıgınız sayi icin carpım tablosu olusturan kodu yazınız
    //3*1=3   3*2=6

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n=input.nextInt();

        int u=1;
        while(u<11){

            System.out.println(n+"x"+u+"="+(n*u));

            u++;
        }

// kullanıcıdan aldıgınız Stringde sesiz harleri console yazdıran kodu yazınız.

        //scanner yukarıda oldugu icin tekrar yazmaya gerek yok.
        System.out.println("Pleae enter a word");
        String y =input.next();

        int z=0;
        while(z<y.length()){
            char ch=y.charAt(z);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                z++;
                continue;
            }else{
                System.out.println(ch);
            }
            z++;
        }
        //if in icinde cok faz la kod olması tavsiye edilmez soyle de yazabilir siniz
       // boolean x= ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
        //if(!x){System.out.println(ch);}  z++;    TERCİH EDİLEN BUDUR













    }
}
