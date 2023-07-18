package sulymanNightTime.day35Exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2);//Sayıya donustugunu ispatlamak icin +2 yazdık
        System.out.println(convertStringToInt("12ab") + 2);//Exception verir Sayi formatında olmadıgı icin

    }

    //Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str){ //String i inte cevirme methodu

        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException e){//NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.
            str = str.replaceAll("[^0-9]", "");
            return Integer.valueOf(str);
        }
    }

}



