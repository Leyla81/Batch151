package day29Encapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();//diger class tan cagırmak icin obje olusturduk
        // objeler class isimleriyle olusturulur.
        System.out.println(s1.getNotOrt());
        System.out.println(s1.getStdId());
        System.out.println(s1.isSuccesful());



        System.out.println("------------------------");

        s1.setStdId("MU123456");
        s1.setNotOrt(4.99);
        s1.setSuccesful(true);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("------------------------");

        s1.setStdId("DH313756");
        s1.setNotOrt(4.50);
        s1.setSuccesful(true);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());;




    }
}
