package Lekcje.Klasy.Test;

import Lekcje.Klasy.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(); // w tym miejscu tworzy się konstruktor domyślny
        User user1 = new User("Bartosz","QWERTY1"); // tworzenie konstruktora z wymaganymi argumentami
        user.username = "Bartek";
        user.password = "QWERTY";
        user.sayHello();
        user1.sayHello();
    }
}
