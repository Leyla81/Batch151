package day13IncrementDecrementLoops;

public class ForLoop01 {

    public static void main(String[] args) {


        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for(int i = 21; i<181 ; i++){

            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
     //Example:Size verilen kucuk harfle yazılmıs String'in index'i
        // cift sayi olan characterleri buyuk harfe donustur. ankara --->AKR
// NOTE:bir String 'de son index her zaman lenght()-1
        //NOTE2: yazdıgımız kod belli senaryloar icin calisıyor ancak tum senayolar icin
        // calısmıyorsa ; Buna hard-code denir

        String s="ankara";

        for(int i=0 ;i<s.length() ;i++){
            String ch=s.substring(i,i+1);
            if(i%2 ==0){
                System.out.println(ch.toUpperCase());
            }

        }













    }
}
