package sulymanNightTime.day13LoopsSuleymanNT;

public class Loops02 {

    public static void main(String[] args) {

//Verilen bir String'de kucuk harfleri console'a yazmayiniz
//"Pwd12?Ab" ==> P12?A
        String s="Pwd12?Ab";

        for(int i=0; i<s.length();i++){
            char ch =s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;//hic birsey yapmaz devam et der cunku buyuk harf arıyoruz.
                //continue:// loop yaparken bazi elemanlari isleme sokmamak icin "continue"kullanilir. kucuk harfleri yazma islemine sokma demek
            }else{
                System.out.print(ch);
            }
        }
        System.out.println();
        //Interview Question

          // Bir string'i ters ceviren kodu yazınız
        //"Java"===>avaJ
        String t ="Java";

        String ters="";
        for(int i=t.length()-1; i>=0;i--){
            ters =ters+t.substring(i,i+1);
        }

        System.out.println(ters);


        //Bir tamsayinin rakamlarinin toplamini veren kodu yazınız.
        //578 ==>5+7+8=20
        //modulus%10 her zaman son rakamını verir


        int sum=0;//yeni data elde edilecegi icin bos kontener gerekir
        for(int i =578;i>0;i=i/10){//baslangıc noktası 578

           sum=sum+ i%10;
            System.out.println(sum);
        }








    }
}
