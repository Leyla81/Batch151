package day24dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

      //LocalDate.now()  methodu suanki tarihi verir
        LocalDate mycurrentdate = LocalDate.now();
        System.out.println(mycurrentdate);

        //Ayı alırken "getMonthValue ()"methodu Tarih ten istediğğimiz bileseni nasıl alirız
       int month= mycurrentdate.getMonthValue();
        System.out.println(month);//3

       // Yılı  alırken "getYear ()"methodu kullanırız
        int year = mycurrentdate.getYear();
        System.out.println(year);//2023

        // Gunu  alırken "getDayOfMonth()"methodu kullanırız
       int dayvalue= mycurrentdate.getDayOfMonth();
        System.out.println(dayvalue);//21

        //***object(ornegin ;myCurrentDate) uzerinden cagırılan methodlar icin non-statictir.
        // ***Class ( ornegin ;LocalDate())uzerinden cagırılan methodlar static'tir

        //Month bir "Enum'dır
        // Enum javada sabit degerleri depolamak icin kullanılır(Ay isimleri ,Gun isimleri ,Ulkedeki sehir isimleri
        Month monthName =mycurrentdate.getMonth();
        System.out.println(monthName);//MARCH===>Enum'dır.
        //Gun alma
       DayOfWeek day = mycurrentdate.getDayOfWeek();
        System.out.println(day);//TUESDAY===>Enum'dir

        //ileriki tarihe gitmek icin gun ay yıl ekleme
         System.out.println(mycurrentdate.plusDays(13).plusMonths(1).plusYears(2));//2025-05-03
        //geriki tarihe gitmek icin gun ay yıl eksiltme
        System.out.println(mycurrentdate.minusDays(13).minusMonths(1).minusYears(2));//2021-02-08

        //Spesific bir tarih objesi nasıl olusturulur
       LocalDate date= LocalDate.of(1983,10,07);
        LocalDate date1= LocalDate.of(1989,12,21);

        //Bir tarihin baska bir tarihten once mi sonra mi olup olmadıgını yazdıran kod
        boolean r1 = date.isAfter(date1);
        System.out.println(r1);//false

        boolean r2 =date.isBefore(date1);
        System.out.println(r2);//true

        //esıt olup olmadıgını yazdıran method
        boolean r3 = date.isEqual(date1);
        System.out.println(r3);

        // Example 1 kullanıcıdan aldıgımız tarih gecmise ait ise "gecersiz tarih girdiniz" mesajı girinin
       // kullanıcıdan aldıgımız tarih gelecege ait ise "Zamanı girebilirsiniz" mesajı girinin

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order..");
        int newYear = input.nextInt();
        int newMonth = input.nextInt();
        int newDay = input.nextInt();

        LocalDate givenDate = LocalDate.of(newYear,newMonth,newDay);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println( givenDate + " invalid date");
        }else{
            System.out.println("Enter time for the ticket..");
        }

        //kullanıcının girdigi ayın uzunlugu kac gun cektiğini bulmak icin

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31

        //Example 2: kullanıcını girdigi tarihin gun ismini bulan kodu yazın

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order..");
        int Y = input.nextInt();
        int M = input.nextInt();
        int D = input.nextInt();
        LocalDate birthDate = LocalDate.of(Y,M,D);
        System.out.println(birthDate.getDayOfWeek());
    }
}
