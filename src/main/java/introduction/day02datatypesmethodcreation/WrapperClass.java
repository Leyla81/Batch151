package introduction.day02datatypesmethodcreation;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive:      char      boolean byte short int     long float double
        //wrapper class : Character Boolean Byte Short Integer Long Float Double
        // wrapper clas non primitivedir memoryde cok yer kaplarlar
        // o yuzden sart degilse wrapper class tercih edilmez boyle bir imkanın varlıgından haberdar olmalıyız

        // 'n yazıp nokta koyarsanız hic method goremezsiniz cunku primitive method icermez
        int n = 12;
        // m yazıp nokta koyarsanız method görebilirsiniz cünkü wrapper classlar methot icerir.
        Integer m =12;

        byte p = 13;
        Byte r = 13;

        //ornek1: short data typenın minimum ve maksimum degerlerini kod yazarak bulunuz

       short maxShort = Short.MAX_VALUE;
        System.out.println( maxShort);

       short minShort= Short.MIN_VALUE;
        System.out.println(minShort);

// ornek2: int data tyenın minimum degeri ile byte data type nın degerlerinin toplamını bulnuz

        int minValue = Integer.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        System.out.println(minValue + maxValue);

        //ornek3: primitive int i wrapper Integer e ceviriniz.
        int num =13;
        Integer wrapperNum =num;

        //primitive bir kutuda (yani method olmayandan) wrapper kutuya atarsak autoboxing denir

        //wrapper Byte primitive byte ceviriniz
        Byte k = 33;
        byte primitiveK= k;

        // wrapper sepeti icinde bazı methodlarla birlikte bulunan degeri alarak primirive yani method bulunmayan kutuya atarsak
        //bu isleme unboxing denir

        //örnek 4 primitive char ı wrapper Charectere ceviriniz.(autoboxing)


        char letter ='L';
        Character letterWrapper= letter;

        //wrapper boolean ı primitive booleana ceviriniz (unboxing)

        Boolean isOld = true;
        boolean isOldPrimitive= isOld;










    }


}
