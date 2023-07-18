package advancedpracticeSule.day01;

public class C01_StringBuilderBufferKiyas {
    /*
2023 Nisan QA Tester
 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
 * kontrol edip StringBuilder ,String Buffer ve String class'larinin performanslarini
 * karsilastiralim.
 * Ipucu: long TimeSb = System.nanoTime(); kullanalim
 */
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        String str ="merhaba";
        System.out.println("**************String***********");

        for(int i =0;i<1000;i++){
            str +=" ";
        }
        long time2 =System.nanoTime();
        long stringSure =time2-time1;
        System.out.println("String Sure = "+stringSure/1000+" nano saniye");//StringSure = 18407 nano saniye


        System.out.println("************StringBuffer********************");

        StringBuffer buffer = new StringBuffer("Merhaba");
        long time3 =System.nanoTime();

        for (int i = 0; i <1000 ; i++) {
           buffer= buffer.append(" ");
        }
        long time4 = System.nanoTime();
        long bufferSure =time4-time3;
        System.out.println("Buffer Sure = "+bufferSure/1000+" nano saniye");//101


        System.out.println("****************String Builder ***********************");

                StringBuilder builder = new StringBuilder();
                long time5= System.nanoTime();
                for (int i = 0; i <1000 ; i++) {
                    builder = builder.append(" ");
                }
                long time6= System.nanoTime();
                long builderSure =time6-time5;
                System.out.println("Builder Sure = "+builderSure/1000+" nano saniye");//55


        System.out.println("*************Uclu kıyas****************");


        if(stringSure>bufferSure && stringSure>builderSure){
            System.out.println("En yavas String'tir");
         if (bufferSure>builderSure) {
             System.out.println("ikinci yavas Buffer Class'dır");
             System.out.println("En hızlı Builder Class'ıdır");

         }else{
             System.out.println("ikinci yavas Builder Class'dır");
             System.out.println("En hızlı Buffer Class'ıdır");

         }

        } else if (bufferSure>stringSure && bufferSure>builderSure) {
            System.out.println("En yavas Buffer Class ı dır");
            if (stringSure>builderSure){
                System.out.println("ikinci yavas String Class'dır");
                System.out.println("En hızlısı String Class'dır");
            }

        }else {
            System.out.println("En yavas Bulder class ıdır");
            if (bufferSure>stringSure){
                System.out.println("ikinci yavas Buffer Class dır");
                System.out.println("En hızlısı String Class dır");
            } else {
                System.out.println("ikinci yavas String Classidir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }


    }


}
