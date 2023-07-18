package ssg.constrocter01;

public class C01_constructer {  /*
    soru 1) birkac tane constructer cagirip bu constructerlari inceleyelim
     */

    int x;
    int y;
    C01_constructer(int a,int b){
        this.x=a;
        this.y=b;
    }
    public static void main(String[] args) {
        C01_constructer obj1=new C01_constructer(5,6);
        System.out.println(obj1.y+" "+ obj1.x);
        C01_constructer obj2=new C01_constructer(10,15);
        System.out.println(obj2.y+" "+ obj2.x);
        C01_constructer obj3=new C01_constructer(9,5);
        System.out.println(obj3.y+" "+ obj3.x);


    }
}


