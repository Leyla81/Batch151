package day12SwitchLoops;

public class SuleymanIncrementDecrement {


    public static void main(String[] args) {
        //1) "Increment" artırma demektir."Decrement" azaltma demektir.
        //2)"Increment toplama ve cıkarma ile yapılabilir.Decrement ise cıkarma ve bolme islemi ile yapılabilir
        //3)"Increment" ve "decrement" 3 yolla yapilabilir.
        //i)int i=12-->i=i+5
        //ii)int i=12-->i+=5
        //iii)int i=12-->ii++;
//Note:3. yol sadece 1 artırmak icin kullanılır.
        //i)int i=12-->i=i-5
        //ii)int i=12-->i-=5
        //iii)int i=12-->ii--;
//Note:3. yol sadece 1 azaltmak  icin kullanılır.

        int age=12;
        System.out.println(age);//12
        //age=age++; bu kodda java soldan geldigi icin artırmadan once age i gorurve 12 yazdırır.buna "POSTICREMENT"denir
        age++;//postIncrement

        age = ++age; //Pre increment
        System.out.println(age);//14

        int salary = 40;

        salary = salary--;//Post Decrement
        System.out.println(salary);//40

        salary = --salary;//Pre Decrement
        System.out.println(salary);//3

    }
}
