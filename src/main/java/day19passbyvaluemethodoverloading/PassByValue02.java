package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
      String updatedName =  updateName(name,"Ali");
        System.out.println(name);
        System.out.println(updatedName);//tom hank ali
        System.out.println(name);//tom hanks
name = updateName(name ,"senior");//bu kod ile name değistirmis olduk.koruma altındaki kodu bu sekilde degiştirebiliriz
        System.out.println(name);


    }//main
public static String updateName(String name ,String add){
        name=name+" "+add;
        return name;
}

    }





