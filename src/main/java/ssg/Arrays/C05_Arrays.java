package ssg.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {


        /*
       Soru verilen bir Arrayde  en uzun ve kısa stringleri yazdıran bir method olusturun

         */

   String names []  = { "veli","ali","furkan","hasan","huseyin"};

        enUzunVeEnKisa(names);

    }
    public  static  void enUzunVeEnKisa (String[]names){
        String enUzunKelime = names[0];
        String enKisaKelime = names[0];
        for (int i = 1; i <names.length ; i++) {
            if (enKisaKelime.length()<names[i].length()){
                enUzunKelime = names[i];
            }
            if (enKisaKelime.length()>names[i].length()){
                enKisaKelime = names[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime ="  + enUzunKelime);
        System.out.println("Arraydeki en kısa kelime ="  + enKisaKelime);
    }

}
