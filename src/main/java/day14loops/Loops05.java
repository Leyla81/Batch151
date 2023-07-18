package day14loops;

public class Loops05 {
    public static void main(String[] args) {

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A  INTERVIEW QUESTION
          String s="Pwd12?Ab";
        for (int i = 0; i <s.length() ; i++) {

          char ch = s.charAt(i);//tek tek kontrol edecegimiz icin charAt()methodunu kullanarak sıfırıncı index"i alir
          if (ch >='a'&&ch<='z'){
              continue;
          }else{
              System.out.print(ch);
          }
        }
        System.out.println("-------------------");
      //Break ile continue arasındaki fark
        // 1)break switch"in dısınaa cıkmak icin loop"u kırmak icin kullanılır
       //continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir

         //********INTERVIEW QUESTION**************
        //Bir String i ters ceviren kodu yazınız
        //"Java"=====>"avaJ"

        String t ="Java";
        String ters="";//yeni kutuya yerlestirmek icin bo kutu lazım

        //burda loop kullanmamızın sebebi
        for (int i = t.length()-1  ;  i>=0;  i--) {//i 0 olmaz cunku sondan baslamam lazım .baslangıc noktası lenght()-1
         ters= ters + t.substring(i,i+1);//string dondurur
        }
        System.out.println(t);
        System.out.println(ters);

        System.out.println("**********************************");
        //2.Way charAt ile yapılır char dondurur
        String u="Java";
        String ters1="";

        for (int i = u.length()-1  ;  i>=0;  i--) {//i 0 olmaz cunku sondan baslamam lazım .baslangıc noktası lenght()-1
            ters1= ters1 + u.charAt(i);
        }
        System.out.println(u);
        System.out.println(ters1);

        System.out.println("*********************************");
//Bir tamsayinin rakamlarinin toplamini veren kodu yazınız.
        //578 ==>5+7+8=20
        //modulus%10 her zaman son rakamını verir
      int num1=-578;
      num1=Math.abs(num1);// -578 0"dan kucuk oldugu icin cıktı 0 olur.bu yuzden Math.abs()methodu kullanılır

        int num2=0;//yeni data elde edilecegi icin bos kontener gerekir



        for (int i =num1; i >0 ; i=i/10) {      //baslangıc noktası 578 dir.yani num 1;0"dan buyuk olana kadar calıs.
                                               //rakamları tek tek almak ici 10"a bolup modulus% ile son rakamı alırız
            num2= num2 + i% 10;
        }
        System.out.println(num2);








    }



}
