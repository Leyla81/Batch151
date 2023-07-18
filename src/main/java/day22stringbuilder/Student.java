package day22stringbuilder;

public class Student {
  //stdName "public oldugu icin diger class'lardan ulasılabilir
    public String stdName = "Ali Can";
    int age =23;//default'tur. Baska package dan gorunmez.

    //access modifier i "prıvate" olan class member'lar olusturuldukları class
    // icinde gorulebilirler. olusturuldaki class'ın dısında gorunmezler
  private String healthCondition = "Cancer";
    //Access Modifier i"protected" olan class member'lar aynı package
  // icinde iken "public" gibi davranırlar
  // Farklı package "a gectiginizde "protected olanlar sadece
  // child class'lardaan gorulebilirler

    protected int salaary = 3000;












}
