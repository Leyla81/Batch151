package day27interface;

public class Honda implements Engine ,Brake {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void payment() {

    }

    @Override
    public void slow() {
        System.out.println("Be slow....");

    }
}
