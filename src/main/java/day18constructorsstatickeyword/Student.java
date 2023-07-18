package day18constructorsstatickeyword;

public class Student {
     /*
       1) "static" "class member"lar(variable + method + constructor + code bloks) tum object'ler tarafindan paylasilir.
       2) "static" "class member"daki degisiklikler tum object'ler tarafindan otomatik olarak gorulur.
       3) "static" "class member"lar gokteki ayin dunyaya bagli oldugu gibi, class'a baglidirlar.
         Bu yuzden "static" variable'lara "class variable" da denir.
       4) "static" "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'e
         baglayarak dusunmek bu konuyu kolaylastirir.
         5) "static " class member"ları cagırmak icin object olusturmak gerekmez ve tavsiye edilmez.
            "non-static " class member"ları cagırmak icin object olusturmak sarttır

     */

    //okul aplicationı oldugunu dusunelim. bu application"da (student , teacher , principal , Vice Principle(mudur yrdm),
    // parents)

    public static int numOfRegisteredStd = 0; //static herkesin otomatik olarak bilinmesini saglar,gokteki ay gibi
    public int num =0;//static degil bu yuzden objelere monte edilir.



    public Student() {

         numOfRegisteredStd++;
         num++;
    }

    public static void main(String[] args) {

        Student s1 = new Student();//obje olusturmak için class ismi kullanılır

        Student s2 = new Student();

        Student s3 = new Student();

        System.out.println(numOfRegisteredStd); // 3 verir cunku butun ogrencileri gorur. artirdi hepsini
        System.out.println(s1.num);//sadece num kullanamayız cunku 3 num" dan hangisi oldugunu sorar.
                                  // 1 verir cunku sadece kendini verir herkes bilmez statik degidirsadece kendini artırdı




    }
}
