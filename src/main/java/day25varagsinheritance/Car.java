package day25varagsinheritance;

public class Car extends Vehicle {


    public Car (){
        this("make");
        System.out.println("Car1");
    }
    public  Car(String make){
        System.out.println("Car String paremetreli");
    }
    public String model="car model";
    public  int km=20000;
}
