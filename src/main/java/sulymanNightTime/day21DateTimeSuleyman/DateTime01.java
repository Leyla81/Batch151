package sulymanNightTime.day21DateTimeSuleyman;

import java.time.LocalTime;

public class DateTime01 {
    public static void main(String[] args) {



        //anlık zamanı nasıl alırız?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//bilgisayardaki zamanı gorur.==>19.50

        //anlık zamanda bilesenler nasıl alınır.
       int saat= myCurrentTime.getHour();
        System.out.println(saat);//==>19

        int dakika = myCurrentTime.getMinute();
        System.out.println(dakika);//==>50

        int saniye = myCurrentTime.getSecond();
        System.out.println(saniye);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        // gelecek ve gecmiş zamana nasıl gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23);
        System.out.println(next);

        LocalTime nextSaat = myCurrentTime.plusHours(3);
        System.out.println(nextSaat);














    }
}
