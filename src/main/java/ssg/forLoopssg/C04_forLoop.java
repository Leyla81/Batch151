package ssg.forLoopssg;

public class C04_forLoop {
    public static void main(String[] args) {
        //soru= 100'den baslayarak 50 ye kadar olan sayıları aralarında virgul koyarak yazdırın'
        for (int i = 100; i >49 ; i--) {
            if(i>50){   //sondaki virgulu silmek icin if dedik
                System.out.print(i+",");
            }else{
                System.out.println(i);
            }



        }
    }
}
