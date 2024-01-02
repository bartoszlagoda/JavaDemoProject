package Lekcje.Klasy.Base;

// klasa rozszerzająca klasę Person
public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        // wywołanie konstruktora klasy nadrzędnej (Person)
        super(name, age); // musi być pierwsze
        System.out.println("Uruchamiam konstruktor MathTeacher");
        this.school = school;
    }
    // nadpisanie metody z klasy Person
    public void walk(){
        System.out.println("I walk very fast");
    }

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
