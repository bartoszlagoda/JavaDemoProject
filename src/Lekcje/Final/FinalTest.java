package Lekcje.Final;

import Lekcje.Klasy.Base.Person;

public class FinalTest {
    public static void main(String[] args) {
        final int x = 2; // nie można zmienić wartości takiej zmiennej

        final Person person = new Person("Tim", 26);
        person.age = 25;

//        person = new Person("Tom", 25); // to nie zadziała
    }
}
