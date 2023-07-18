package ssg.staticKeyword;

public class Counter {
    int count;
    static int stCount;
    public Counter(int a) {
        count+=a;
        stCount++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }
    public static void main(String[] args) {
        Counter cs1 = new Counter(2);
        System.out.println("stCount is: "+ cs1.getStCount());//1
        Counter cs2 = new Counter(3);
        Counter cs3 = new Counter(4);
        Counter cs4 = new Counter(5);
        Counter cs5 = new Counter(6);
        Counter cs6 = new Counter(7);
        System.out.println("count is: "+ cs6.getCount());//7
        System.out.println("count is: "+ cs1.getCount());//2
        System.out.println("stCount is: "+ cs6.getStCount());//6

    }
}
