package day_13practice;

public class C03_varags {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
// iclerinden en uzun olanı yazdıran bir method olusturun (Varargs)
// bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız
// bu methodun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classdan calıstırınız
// bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";
        String str5 = "Abdurrezzak";

         enUzunKelime(str1, str2, str3, str4, str5);

    } // main

     public static String enUzunKelime(String... str) {//3 nokta ile varags olusturduk
        String enUzunKelime = "";//kelimeyi bos bir konteyner a attık
        for (String each : str) {//str daki herbir elemanı al
            if (each.length() > enUzunKelime.length()) {//eger herbir kelimenin uzunlugu enUzunJelime konteyner ından buyukse
                enUzunKelime = each;//o kelimeyi enUzunKelimeye assign et
            }
        }
        return enUzunKelime;//method void olsaydı return yazmaya gerek yoktu
    }
}

// bu methodun access modifiers'ını default olursa aynı package den ulasabiliriz
// bu methodun access modifiers'ını protected olursa farklı classda ulasmak icin parent child iliskisi olması lazım
// bu methodun access modifiers'ını public olursa farklı bir package veya classdan ulasabiliriz




