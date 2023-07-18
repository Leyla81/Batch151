package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

       int sonuc= toplamaYap (3,5);
        System.out.println(sonuc);

        long carpmaSonuc= multiply(8,5);
        System.out.println(carpmaSonuc);

        int ucluSonuc=firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

        double kup =getCube(5);
        System.out.println(kup);

        print("hello world");
    }

   //toplama işlemi yapan bir method oluşturun

      public static int toplamaYap ( int a, int b) {
          return a + b;

      }
            //2 sayıyı çarpma işlemi yapan method olusturma
          protected static long multiply (int a, int b){

         return a*b;

          }
// verilen 3 sayıdan ilk ikisini carpan ucuncuyu carpan bir method olusturma

       private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
       }

//verilen bir ondalık sayının kupunu hesaplayan method olusturup kullanınız

     static double getCube(double a) {
       return a*a*a;

     }

// girilen bir kelimeyi ekrana yazdıran bir method olusturma

    private static void print(String str){
        System.out.println(str);
    }


//return type void olursa return kullanılmaz yukarıda oldugu zaman
 //birsey uretmiyor demek










}
