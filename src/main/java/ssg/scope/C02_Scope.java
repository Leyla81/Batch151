package ssg.scope;

public class C02_Scope {

    static  int i;
    public static void main(String[] args) {
       int y = 14;

        for (int i = 0; i <=5 ; i++) {
            System.out.print(i);

        }//for parentezinin icinde i yazdırılırsa hata verir

        System.out.println();
        {//static olmayan block
            System.out.println(i);//main in dısındaki static "i"dir
            System.out.println(y);
          int z =543;
            System.out.println(z);
        }


    }
}
