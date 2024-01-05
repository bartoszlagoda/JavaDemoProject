package Lekcje.Lambda;

public class StudentTest {

    public static void main(String[] args) {
        // obiekt klasy Student
        Student it = new ItStudent();
        sayHello("John", 23, it);
        // klasa anonimowa
        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };

        sayHello("Kate", 21, med);

        // wyrażenie lambda korzystające z interfejsu funkcjonalnego
        Student noStudent = (name, age) -> {
            System.out.println("I am not a Student, my name is " + name);
            if (age >= 18) {
                System.out.println("You can buy a beer!");
            }
        };
        sayHello("Tom", 18,noStudent);
    }

    // metoda statyczna mająca w argumencie imię i wybrany obiekt klasy Student
    public static void sayHello(String name, int age, Student student){
        student.sayHello(name, age);
    }
    /*
    Lambda:
    parametr -> ...
    (parametr1,parametr2) -> ...
     */
}
