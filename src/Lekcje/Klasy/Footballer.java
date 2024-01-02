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

    // nadpisanie tej samej metody w klasie rodzica Person
    public void eat(){
        System.out.println("I like healthy food !");
    }

    public void playFootball(){
//        eat(); // metody klasy bazowej
//        walk(); // metody klasy bazowej
        System.out.println("I am playing football");
    }
}
