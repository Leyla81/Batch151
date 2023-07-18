package ssg.scope;

public class C04_contructorScope {

    int a;
    int b;
    int c;
    C04_contructorScope(int a){//constructor1 olusturduk
        System.out.println(a);//asagıdaki contructor ı kullanır
        }
        C04_contructorScope(int a ,int b){//constructor2 olusturduk
            System.out.println(a+b);
        }
        C04_contructorScope(int a ,int b, int c){//constructor3 olusturduk
            System.out.println(a+b+c);

        }

    public static void main(String[] args) {
       C04_contructorScope obj1 = new C04_contructorScope(5);
       C04_contructorScope obj2 = new C04_contructorScope(5,3);
       C04_contructorScope obj3 = new C04_contructorScope(5,3,2);








    }














}
