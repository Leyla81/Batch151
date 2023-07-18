package day23inheritance;

public class Animal {



    /*
        1)eat(){} method'u gibi bir cok class'in kullanmasi gereken method'lari her class'a ayri ayri yazarsak
            i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir.
           ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
          iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
         iiii)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
        iiiii)Her class'in icine method'u tekrar tekrar yazmak "atomic yapiya" tertstir.
    2) private class memberlar child classlar tarafından kullanılamaz
           public class member"lar child class"lar tarafından kullanılırlar
           "default" class member"lar aynı package de "public" gibi olurlar child class tarafından kullanılablirler
           3) java dabir clas"ın sadece 1 tane parent i olabilir
           Coklu parent a "nultiple inheritance "denir.Tekli parent a "Single inheritance" denir.
           Java "multiple inheritace " i desteklemez, Java "Single inheritance kullanır.
           apartman seklindeki inheritance yapısına "Multilevel ınheritance " denir.
     */
     public void eat() {
        System.out.println("Animal eats...");
    }
    public void drink() {
        System.out.println("Animals drink...");
    }











}
