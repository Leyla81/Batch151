package Day_10Practice;

public class C02_Static {


    /*okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım */

     static String schoolName ="Yıldız Koleji";
     static int schoolNumber;
     static boolean isSchoolOpen;

    public static void main(String[] args) {

       //note = static variablelere class icerisindek, tum methodlardan direk ulasırız
        //baska classta ulasmak icin class ismi kullanılır


        System.out.println(schoolName);
        System.out.println(schoolNumber);
        System.out.println(isSchoolOpen);

        schoolNumber=102;
        System.out.println(schoolNumber);//102

        school();
        System.out.println(schoolNumber);//200


    }

    private static void school() { //method olusturduk

        schoolNumber=200;
        System.out.println(schoolNumber);//200

    }

}
