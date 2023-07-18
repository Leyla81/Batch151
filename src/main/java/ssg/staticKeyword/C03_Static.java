package ssg.staticKeyword;

public class C03_Static {
    static int x;
    int y;
    C03_Static(){
        x+=2;
        y++;
    }
    int getSquare(){
        return x*x;
    }
    public static void main(String[] args) {
        C03_Static sm1=new C03_Static();
        C03_Static sm2=new C03_Static();
        int z=sm1.getSquare();
        System.out.println("-x"+z +"-y"+sm2.y+" "+sm1.x);
    }
}
