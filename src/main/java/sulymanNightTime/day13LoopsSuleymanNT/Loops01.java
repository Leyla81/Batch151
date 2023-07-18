package sulymanNightTime.day13LoopsSuleymanNT;

public class Loops01 {
    public static void main(String[] args) {

 //21'den 180 e kadar hem 4 hem 6 ile bolunebilen tamsayilari console yazdırınız
 for(int i =21;i<181;i++){
     if(i%4==0 && i%6==0){
         System.out.print(i+" ");
     }
 }
        System.out.println();
 //Size verilen kucuk harfle yazılmaıs String'in index i cift sayi olan charakter lerinibuyuk harfe donusturun
        //miami==>MiAmI

        String s = "miami";

 for( int i=0; i<s.length();i++){

     String ch= s.substring(i,i+1);
     if(i%2==0){
         System.out.print(ch.toUpperCase());
     }else{
         System.out.print(ch);
     }
 }
        System.out.println();
//Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java===>Hello J

        String str ="Hello Java";

 for(int i=0; i<str.length(); i++){//kodu okuma:sıfırıncı index ten basla str nın uzunlugu boyunca git. ve bir bir artır.

     char ch=str.charAt(i);

     if(ch=='a'){
         break;

     }else {
         System.out.println();
     }
 }
// verilen bir Stringde son 'a'dan sonraki tum karakterleri ters sırada yazdırınız

        String t="tokatcı";
 for(int i=t.length()-1;i>=0;i--){

     char h =t.charAt(i);

     if(h=='a'){
      break;

     }else{
         System.out.print(h);
     }
 }


















    }
}
