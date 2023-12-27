package Lekcje.Klasy;
// klasa rozszerzająca klasę Person
public class MathTeacher extends Person {

    public String school;
    public void teachMath(){
//        eat(); // metody klasy bazowej
//        walk(); // metody klasy bazowej
        System.out.println("I'm teaching math");
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age);
    }
}
