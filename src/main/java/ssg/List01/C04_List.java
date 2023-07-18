package ssg.List01;

import java.util.ArrayList;
import java.util.List;

public class C04_List {
    public static void main(String[] args) {
        //bir dogal sayı list i olusturun ve olustyrdunuz listteki cift sayıları tolayın
        List<Integer> num = new ArrayList<>();
        num.add(28);
        num.add(33);
        num.add(46);
        num.add(87);

        int sum = 0;
        for (int i = 0 ; i< num.size() ; i++) {
            if(num.get(i)%2==0){// num listini i . degerini 2 ye bolumunden 0 kalanı getir
                sum+= num.get(i);
            }

        }
    }
}
