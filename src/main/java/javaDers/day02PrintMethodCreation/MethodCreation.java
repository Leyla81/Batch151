package javaDers.day02PrintMethodCreation;

public class MethodCreation {

    public static void main(String[] args) {


       //ornek 1: karenin alanını hesaplayan konu yazınız

        kareninAlanı( 7);

        // dikdörtgeni alanını hesaplayan kod yazınız

        System.out.println("dikdortgeninAlanı" +(dikdortgeninAlanı(10, 20)+2));




    }

    private static int dikdortgeninAlanı(int a, int b){
        return a*b;

    }
    private static void kareninAlanı(int a){


        System.out.println("kareninAalanı= " + (a*a));

    }


}
