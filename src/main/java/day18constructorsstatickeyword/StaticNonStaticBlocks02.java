package day18constructorsstatickeyword;

import org.w3c.dom.ls.LSOutput;

public class StaticNonStaticBlocks02 {


    public StaticNonStaticBlocks02(){
        System.out.println("constructer 1");

    }

    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructer 2");

    }
    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructer 3");

    }
    public StaticNonStaticBlocks02(boolean isOld) {

        System.out.println("Constructer 4");
    }

    {
        System.out.println("i am constructor");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }


}
