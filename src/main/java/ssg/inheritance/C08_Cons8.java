package ssg.inheritance;

public class C08_Cons8 extends C07_Cons2 {
    String str="cons3deki str calisti";
    void C08_Cons3(){
        System.out.println("cons3deki cons calisti");

    }
    void method(){
        System.out.println("cons3deki method");
    }

    public static void main(String[] args) {
        //C08_cons3 obje1=new C08_cons3();
        // System.out.println(obje1.str);//"cons3deki str calisti"
        // obje1.method();
        //   C07_cons2 obje2=new C08_cons3();
        //   System.out.println(obje2.str);
        //   obje2.method();
        //  C06_cons1 obje3=new C08_cons3();
        //  System.out.println(obje3.str);
        //  obje3.method();
        // C06_cons1 obje4=new C07_cons2();
        // System.out.println(obje4.str);
        // obje4.method();
        C07_Cons2 obje5=new C07_Cons2();
        System.out.println(obje5.str);
        obje5.method();

    }
}
