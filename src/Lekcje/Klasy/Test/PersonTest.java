package Lekcje.Klasy.Test;

import Lekcje.Klasy.Footballer;
import Lekcje.Klasy.MathTeacher;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tomasz";
        teacher.age = 29;
        teacher.school = "WSB Merito University";
        teacher.walk(); // metoda Person
        teacher.eat(); // metoda Person
        teacher.teachMath(); // metoda MathTeacher
        teacher.sayHello(); // metoda MathTeacher

        Footballer footballer = new Footballer();
        footballer.name = "Michal";
        footballer.age = 21;
        footballer.walk();
        footballer.eat();
        footballer.footballClub = "Roca Juniors";
        footballer.playFootball(); // metoda Footballer

    }
}
