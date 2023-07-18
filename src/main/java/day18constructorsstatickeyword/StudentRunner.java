package day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

// static olan numOfRegisteredStd  variable cagırmak icin sadece
// class ismini kullandık obj olusturmadık
        System.out.println(Student.numOfRegisteredStd);
        // static olmayan "num" variable ini cagırmak ici asagıdaki objeyi olustururuz.
        Student s1 =new Student();
        System.out.println(s1.num);








    }
}
