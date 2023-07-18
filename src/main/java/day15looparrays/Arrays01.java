package day15looparrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //NOTE: 1) array javanın aynı data tipinde coklu data depolamak icin olusturdugu bir yapıdır.
        //2)array olusturmak icin konteyner seklını belirtmemız lazım
        // 3)Array'ler primitive data type ları veya referans ları ile calısır.
        // Strıng non primitive dir.Non-primive lerin referans ları icin calısır.
        //4) Array ler"super fast"tir ve memory de cok az yer kaplarlar
        //5) Array hızlı oldugu icin tercih edilirler

        //Array nasıl olusturulur
        String stdNames[]=new String[5];//array 5 kişilik yer icin

        //array nasıl yazdırılır.
        System.out.println(Arrays.toString(stdNames));//null null null null null yazdırır cunku isim koymadık

        //Array a nasıl elaman eklenir stdNames yazı koseli parantez icine index girilir
        stdNames[0]="Ajda";
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[4]="Ayhan";
        stdNames[1]="Filiz";
        System.out.println(Arrays.toString(stdNames));

        //Array'deki specific bir elemanı alma
        System.out.println(stdNames[3]);//cuneyt

        // Example:StdNames arrayindeki her ismin sonuna yıldız koyarak yazdıralım
        // surekli yazılacagı için loop kullanılır. Array indexle calıstıgı icin baslangıc 0(sıfırdır)

        //1 WAY
        for(int i =0;i< stdNames.length;i++){//length stringlerde parentezli Array'lerde parentezsiz kullanılır.
            System.out.println(stdNames[i]+"*");
        }

//****2. Way***********for-each-loop**************===> enhanced (Zenginlestirilmiş)Loop denir.
        //mumkunse for -each- loop kullanılır.ARRAY'lerde kullanılır.

        for(String w :stdNames){// arraylar de for içide 'w :'kullanılır
            System.out.println(w+"*");
        }

        //Example2: bir integer array olusturunuz 5 eleman ekleyiniz elemanlarhın toplamını bujlup konsola yazdırınız
        int ages[]=new int[5];
        System.out.println(Arrays.toString(ages));//konsola 0 0 0 0 0 yazdırır
        ages[0]=5;
        ages[1]=2;
        ages[2]=1;
        ages[3]=7;
        ages[4]=8;
        System.out.println(Arrays.toString(ages));

        int sum=0;// yeni deger icin bos konteyner
        for(int w:ages){

            sum=sum+w;//degerleri toplar
        }
        System.out.println(sum);

        //Bir char array olusturunuz elamanların carpımını bulup konsola yazdırın

        char letters[]=new char[3];
        System.out.println(Arrays.toString(letters));

        letters[0]='W';//86 Ascıı degeri
        letters[1]='A';//65 Ascıı degeri
        letters[2]='B';//66 Ascıı degeri

        System.out.println(Arrays.toString(letters));
        int ch=1;// carpma isleminde 0 carpımı yıne sıfır olacagı icin 1 yazılır.

        for(char w:letters){

            ch=ch*w;//Ascıı degerleri carpar.java char data type matematiksel işlemlerde kullanıldıgında ascıı table kullanır
        }
        System.out.println(ch);













    }
}
