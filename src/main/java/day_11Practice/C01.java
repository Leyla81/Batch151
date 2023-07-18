package day_11Practice;

public class C01 {

    String name ="Hasim";
    int age =20;

    public C01(String name, int age) { //constructor olusturdu constructor ların return type olmaz

        this.name= name;
        this.age = age;
    }

    public C01() {

    }


    public static void main(String[] args) {


      C01 obj1 = new C01("Nuri",25);  //parametreli oldugu icin main dısında constructor olusturdu


        System.out.println(obj1.name+ " , "+ obj1.age);

        C01 obj2 = new C01();
        //note : her classta default constuctor vardır fakat biz bulundugumuz classda parametreli
        // bir contructor olusturduysak bu durumda default constructor silinir
        // bu yzden parametresiz obj  olusturdugumuzda tekrardan contructor olusturur

        System.out.println(obj2.name + " , "+obj2.age);

    }













}
