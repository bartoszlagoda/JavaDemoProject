package Lekcje.Lambda;

// klasa implementująca klasę Student
public class ItStudent implements Student{
    @Override
    public void sayHello(String name, int age) {
        System.out.println("I'm IT guy");
        System.out.println("My name is " + name);
    }
}
