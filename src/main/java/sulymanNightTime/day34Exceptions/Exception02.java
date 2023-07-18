package sulymanNightTime.day34Exceptions;

public class Exception02 {
    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));

        System.out.println(getElement(a, 6));//Array in uzunlugundan fazla oldugu icin exception firlatir.
// bunu handle etmek icin asagıda "try-catch" blogu olusturulur
        System.out.println(getElement(a, -3));
    }

    //Bir String array'den istenilen bir elemani eleman sirasi ile alan method olusturunuz
    public static String getElement(String[] a, int numOfElement){

        String result = "";

        try{
            result = a[numOfElement-1];
        }catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException array islemlerinde olmayah index kullandiginizda atilir.
            if(numOfElement-1<0){                 //indexler 0 dan baslar bu yuzden exception fırlatır
                result = a[0];
            }else{
                result = a[a.length-1];
            }
        }
        return result;
    }
}

