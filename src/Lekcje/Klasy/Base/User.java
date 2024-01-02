package Lekcje.Klasy.Base;

public class User {
    public String username;
    public String password;

    public User(){
        System.out.println("Tu nastepuje wywolanie konstruktora");
    }
    // konstruktory moga byc nadpisywane i uzywane w ramach innych potrzeb
    public User(String user, String pass){
        // w tym wypadku jedynie przypisujemy user do username i password do pass, ale nie są to wartosci obiektu
//        username = user;
//        password = pass;
        // deklaracja, że ten username i to hasło, które będzie przypisane w tym konstruktorze ma być w obiekcie
        this.username = user;
        this.password = pass;
        System.out.println("Konstruktor uzytkownika " + user + " z haslem " + pass);
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + username);

    }
}
