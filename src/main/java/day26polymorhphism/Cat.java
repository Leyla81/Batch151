package day26polymorhphism;

public class Cat extends Animal {

   public void meaw() {
      System.out.println("Cats meaw");

   }

   @Override
   public void eat() {
      // Child daki override edilmis eat() methoduna "overriding method" denir
      //parent daki override edilmis eat() methoduna "overridden method" denir
      System.out.println("Cats eat");
   }
   @Override
   public Animal create() {
      return new Cat();
   }


   @Override
   public int add(int a, int b) {
      return a+b;
   }

   @Override
   public void drink() {

      System.out.println("Cats drink");






   }
}