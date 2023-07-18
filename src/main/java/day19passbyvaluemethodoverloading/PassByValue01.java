package day19passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {
       /* Pass by value
        1) Java Pass by Value kullanir.
        2) yani; java method larin orjinal degeri degistirmesine musaade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda a yollar
            Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
        4)Java esnek bir dildir, Istersek yazdigimiz kod ile   orjinal degerin degismesini temin edebiliriz
        bakiniz line 32:

        Pass By Reference :
        1) Pass by reference da methoda reference yollanir
        2) Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
            Bu yüzden C# C++ gibi Pass by reference kullanan dillerde method variable orjinal degerini degisitirir

    * */

        //pass by value sayesinde orginal degeri korunur

        int shirtPrice = 100;
        // burada pass by value ile shirtprice degeri koruma altına alır
        int studentShirtPrice = discount("student", shirtPrice);
//methoda gonderirken degeri degil kopyasını gonderir ve degisen deger kopyası olur orginal degil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);//90verir
        System.out.println("shirtPrice =" + shirtPrice);//100 verir

        System.out.println(discount("veteran", shirtPrice));//80 yazdırır
        System.out.println("shirtPrice="+shirtPrice);//tekrar 100 yazdırır cunku korurur
        shirtPrice = discount("senior",shirtPrice);//bu kod ile koruma altındaki degeri degistire debiliriz
        System.out.println("shirtPrice = " + shirtPrice);
    }

        public static int discount(String type ,int price){//methodlar main in dısında olusturlur.
        // Method icinde shirt price hep 100gelecek

        switch(type){
            case "student":
                price= price -10;//90
                break;
            case "veteran":
                price= price -20;//80
                break;
            case "senior":
                price= price -5;//95
                break;
            default:
                price= price;



            }
            return price;






























    }
}
