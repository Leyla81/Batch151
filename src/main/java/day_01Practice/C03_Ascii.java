package day_01Practice;

public class C03_Ascii {


    public static void main(String[] args) {
        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
      //C=67 E=69 M=77 (B+1 yaparsam C elde ederiz-->(D+1 yaparsam E elde ederiz)
                        //L+1 yapasam M verir

        char ilkkKarakter= 'B'+1;
        char ikinciKarakter='D'+1;
        char ucuncuKarakter='L'+1;

        System.out.println(""+ilkkKarakter+ikinciKarakter+ucuncuKarakter);
        //basa cift tırnak koymazsak degerleri toplar tırnak Stringe cevirir.ve CEM yazdırır.







    }
}
