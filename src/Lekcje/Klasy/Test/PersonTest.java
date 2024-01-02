package Lekcje.Klasy.Test;

import Lekcje.Klasy.Base.Footballer;
import Lekcje.Klasy.Base.MathTeacher;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tomasz",29,"WSB Merito University");
//        teacher.name = "Tomasz";
//        teacher.age = 29;
//        teacher.school = "WSB Merito University";
        teacher.walk(); // metoda Person
        teacher.eat(); // metoda Person
        teacher.teachMath(); // metoda MathTeacher
        teacher.sayHello(); // metoda MathTeacher

        Footballer footballer = new Footballer("Michal",21,"Roca Juniors");
//        footballer.name = "Michal";
//        footballer.age = 21;
        footballer.walk();
        footballer.eat();
//        footballer.footballClub = "Roca Juniors";
        footballer.playFootball(); // metoda Footballer

    }
}
