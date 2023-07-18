package day_04loopArrays;

public class MonkeyAlive {

        /* INTERWIEW SORUSU


         Adada yalnız bir maymun var
          Her gün 4 muz yemesi gerekiyor
         o adada sadece 165 muz var
           Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/
        public static void main(String[] args) {


       int numberOfBananas = 165;

       int survivalDays=1;

       boolean isMonkeyAlive = true;

       do{
           numberOfBananas -=4;//toplam muz sayısından her gun 4 muz eksilir
           System.out.println("Kalan muz sayısı "+numberOfBananas);
           survivalDays++;
           if(numberOfBananas<4){
               isMonkeyAlive =false;
               System.out.println("Bugun "+survivalDays+"Yeterli muz kalmadı.Maymun rahmetli.Rest in peace");
           }else{
               System.out.println("bugun "+survivalDays+".gun :Maymun hala yasıyor...");
           }

       }while (isMonkeyAlive);












        }


}
