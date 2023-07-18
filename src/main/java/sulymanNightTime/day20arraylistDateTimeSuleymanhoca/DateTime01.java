package sulymanNightTime.day20arraylistDateTimeSuleymanhoca;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //LocalDate class ı java da hazırdır.bulundugumuz yerin tarihini verir
//icinde bulundugumuz tarihi nasıl alabiliriz
        LocalDate mycurrentDate =LocalDate.now();//suanki tarihi verir
        System.out.println(mycurrentDate);//2023-03-15

        //Tarih ten istediğğimiz bileseni nasıl alirız ayı alırken "getMonthValue"
       int monthValue= mycurrentDate.getMonthValue();// sayı almak icin getMounthValue()methodu kullanılır
        System.out.println(monthValue);//3

        //yılı alırken "getYear()" methodu
       int yearValue= mycurrentDate.getYear();
        System.out.println(yearValue);//2023

        //Ay"ın kacıncı gunu oldugunu almak icin "getDayOfMonth()"
        int dayValue = mycurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //asagıdaki "Month" bir Enum'dir
        //Enum , javada sabit degerleri(Ay isimleri, gun isimleri, ulkedeki sehir isimleri gezegen isimleri) depolamak icin kullanılır
      Month monthName= mycurrentDate.getMonth();//ayın ismini verir
        System.out.println(monthName);//march

        //asagıdaki "DayOfWeek" bir Enum'dir
       DayOfWeek dayName= mycurrentDate.getDayOfWeek();
        System.out.println(dayName);//Wednesday

        //ileriki tarihe nasıl gidilir
        System.out.println(mycurrentDate.plusDays(5).plusMonths(2).plusYears(4));
        //yukarıdaki kod ile suanki tarihe parantez içindeki gunsayısını ay sayısını yıl sayısını ekler==2027-05-20

        //geri tarihe gitme
        System.out.println(mycurrentDate.minusYears(30).minusMonths(8).minusDays(15));//1992-06-30

       //specific bir tarih objesi nasıl olusturulur
       LocalDate gokhanBirth = LocalDate.of(1986,6,10);
        LocalDate fatihBirth = LocalDate.of(1985,2,25);

        boolean r1 = gokhanBirth.isAfter(fatihBirth);//gokhanın dogum gunu fatıh in dogum gununden sonra mı?
        System.out.println(r1);//true

        boolean r2 = fatihBirth.isBefore(gokhanBirth);//fatihın dogum gunu gokhanın dogum gununden once mi
        System.out.println(r2);//true

        boolean r3 = gokhanBirth.isEqual(fatihBirth);
        System.out.println(r3);//false

       // Example 1kullanıcıdan aldıgınız tarih gecmise ait ise "gecersiz tarih girdiniz "msj veriniz
        //          kullanıcıdan aldıgınız tarih gelecege ait ise "zamanı girebilirsiniz eyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter year ,month and day numbers in the given order");
        int year = input.nextInt();
        int month=input.nextInt();
        int day = input.nextInt();

        //"of()" methodu yıl ay ve gun girmek için kullanılır
        LocalDate givenDate = LocalDate.of(year,month,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate +"invalid Date");
        }else{
            System.out.println("Enter time fo the ticket");
        }

      int lenghtOfMonth= mycurrentDate.lengthOfMonth();//ayın kac cektiğini gosterir
        System.out.println(lenghtOfMonth);

        //kullanıcının girdiği tarihin kod ismini bulan tarihi giriniz.
        System.out.println("please enter year ,month and day numbers in the given order");
        int y = input.nextInt();
        int m=input.nextInt();
        int d = input.nextInt();

       LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());//verilen tarin gununu verir




    }

}
