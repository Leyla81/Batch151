package day13IncrementDecrementLoops;

public class IncrementDecrement {

    public static void main(String[] args) {

//Increment1

    int b=5;
        System.out.println(b);
    b=b+5;
        System.out.println(b);
    b+=5;
        System.out.println(b);
    b++;
        System.out.println(b);

   //decrement1
   int c= 8;
        System.out.println(c);//8

   c=c-3;
        System.out.println(c);//3
   c-=3;
        System.out.println(c);//2


//Increment 2;
        int d=6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24

//decrement 2:
    int e=24;
        System.out.println(e);//24
     e=e/2;
        System.out.println(e);//12
      e/=2;
        System.out.println(e);//6

      //"1" ile Increment
        int f=12;
        //f=f+1;
        //f+=1;
        f++;

       //"1" ile Decrement
        int h=12;
        //h=h-1;
        //h-=1;
        h--;
//Post-Increment ve pre-Increment
        int i =10;
        int k=i++;//java solda saga gelir ve ilk i gorur "+"sonradan gordugu icin POST-INCREMENT olur
        //yukarıda "k" nın degeri yıne 10 olur
        int m=15;
        int n=++m;//java solda saga gelir ve ilk "+" onceden gordugu icin PRE-INCREMENT olur
        //yukarıdaki "n" degeri 16 tir.

//Example:

  int p=17;
  int r =p--;//post-decrement

  int s=20;
  int t=--s;//pre-decrement
        /*
         *  1) Increment artirmak demektir Decrement azaltmak demektir
         *  2) Incerement toplama ve carpma ile Decrement cikarma yada bolme ile yapilabilir
         *  3) Increment ve Decrement 3 yolla yapilabilir
         *
         *       a)  int i = 12; ==> i = i +5;
         *       b)  int i = 12; ==> i +=5;
         *       c)  int i = 12; ==> i++;
         *           Note : 3. yol sadece 1 artirmak icin kullanilabilir
         *
         *
         *        a)  int i = 12; ==> i = i -5;
         *       b)  int i = 12; ==> i -=5;
         *       c)  int i = 12; ==> i--;
         *           Note : 3. yol sadece 1 azaltmak icin kullanilabilir
         *  */






    }

}
