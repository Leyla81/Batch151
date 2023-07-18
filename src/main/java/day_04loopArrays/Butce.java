package day_04loopArrays;

public class Butce {


        // Tum aile uyelerinin birikiminin
       // bulundugu ortak ihtiyaclar icin
      // kullanildigi bir butce ile kisisel
     // harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static  int butce;
    public  int harclik;
    public  void maasAl(int alinanMaas){
        butce+=alinanMaas;//alınan maası butceye assıgn eden bir kod. butce= butce+alinanMaas; seklinde de yapılır
    }
    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik;//harcana para butceden eksilten kod. butce = butce-alınanHarclık seklinde de yazılır.
        harclik += alinanHarclik;
    }
 public  void butcedenHarca(int harcananPara){
        butce -=harcananPara;
 }
   public void harcliktanHarca(int harclikHarcamasi){
        harclik -=harclikHarcamasi;
   }





}
