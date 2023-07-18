package day28Interface;
/*
1) Class (Child) ==> Class : extends
   interface(Child) ==> interface :extends
   Class(Child) ==> interface :implements
   interface(Child)  ==>Class : OLAMAZ
   ayni ise "extends" farklı ise implements kullan
   "interface"i Classin child'i yapma

 */

public interface Mammal extends Animal{

    String feedbaby = "Milk";
    int age =6;


}
