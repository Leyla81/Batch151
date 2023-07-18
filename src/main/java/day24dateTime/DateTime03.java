package day24dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {


//Saati ve tarihi verir.
       LocalDateTime ltd= LocalDateTime.now();
        System.out.println(ltd);

      DateTimeFormatter dtf=  DateTimeFormatter.ofPattern("dd/MM/yyyy - hh : mm a");
       String formatedLtd = dtf.format(ltd);
        System.out.println("formatedLtd = " + formatedLtd);














    }
}
