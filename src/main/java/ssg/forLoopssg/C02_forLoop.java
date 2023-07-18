package ssg.forLoopssg;

public class C02_forLoop {
    public static void main(String[] args) {
        //soru = 10 ile 30 arasındaki sayiları aralarında virgul koyarak aynı satırda yazdırın


        for (int i = 10; i <31 ; i++) {
            if (i < 30) {//sondaki virgulu atmak icin
                System.out.print(i + ",");
            }else {
                System.out.println(i);
            }
        }





    }
}
