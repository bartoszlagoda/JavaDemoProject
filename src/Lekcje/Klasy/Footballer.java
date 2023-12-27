package Lekcje.Klasy;
// Klasa dziedzicząca po klasie Person
public class Footballer extends Person{

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        // wywołanie konstruktora klasy nadrzędnej (Person)
        super(name, age); // musi być pierwsze
        System.out.println("Uruchamiam konstruktor Footballer");
        this.footballClub = footballClub;
    }

    public void playFootball(){
//        eat(); // metody klasy bazowej
//        walk(); // metody klasy bazowej
        System.out.println("I am playing football");
    }
}
