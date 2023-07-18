package day24dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {


        //Anlık zamanı LocalTime.now() ile alırız
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //12:20:58.535686900

       int hour= myCurrentTime.getHour();
        System.out.println(hour);//sadece saati alırız

       int minute = myCurrentTime.getMinute();
        System.out.println(minute);//sadece dakikayı almak icin

        int second = myCurrentTime.getSecond();
        System.out.println(second);//sadece sanıyeyi almak icin

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//sadece nono saniyeyi almak icin

       LocalTime hourEkle = myCurrentTime.plusHours(5);
        System.out.println(hourEkle);
        LocalTime minuteEkle =myCurrentTime.plusMinutes(25);
        System.out.println(minuteEkle);
        LocalTime secondEkle =myCurrentTime.plusSeconds(55);
        System.out.println(secondEkle);

        //System.out.println(myCurrentTime.plusHours(5).plusMinutes(25).plusSeconds(55));seklinde de yazdirilabilir.
       // ya da LocalTime next = myCurrentTime.plusHours(5).plusMinutes(25);
        //System.out.println(next); seklinde de yazdırılır

        //Zaman formatı nasıl degistirilir?
        //DateTimeFormater.ofPattern() methodu kullanılarak degistirebiliriz.
        /*
        DateTime Class ta kullanılan tarih saat formatları
        HH:mm ==>24 lu saat sistemi-----String olarak cift tırnak gerekir
        hh:mm ==> 12 li saat sistemi
        hh: mm a ==> 12li saat sistemi AM PM
        hh:mm ss ==> saniyeyi gosterir.
        HH:MM ==> yanlıs formattır cunku "MM" aylar icin kullanılır. kucuk "mm" minute demek buyuk "MM" month demektir

        dd MM yyyy==>gun-ay-yıl
        MMM ===>Aug
        MMMM===>August
        yyyy===>2023
        yy==>23 verir
         */
        //saati formatlamak icin
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm.ss a");

       String formatedMyCurrentTime= dtf1.format(myCurrentTime);
        System.out.println("formatedMyCurrentTime = " + formatedMyCurrentTime);

        //tarihi formatlamak icin
        LocalDate myCurrentDate =LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println("formatedMyCurrentDate = " + formatedMyCurrentDate);

        //tarihi gun ay ismini ilk uc harfi verecek sekle ceviriniz 25-agu-23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yy");
        String formatedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formatedMyCurrentDate2);

        //Tarihi 25 / Agustos/ 2023 sekline cevirme
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatedMyCurrentDate1 =dtf4.format(myCurrentDate);
        System.out.println("formatedMyCurrentDate1 = " + formatedMyCurrentDate1);

         //Baska bi zamna dilimindeki tarih ve zamanı nasıl alabiliriz

        //Tokyo'da ayın kacı?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInTokyo = " + dateInTokyo);

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println("dateInAmsterdam = " + dateInAmsterdam);

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:36:38.317506800


    }
}
