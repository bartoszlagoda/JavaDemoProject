package Lekcje.Klasy.Base;
// Klasa jest szablonem, na podstawie którego można tworzyć obiekty
// Obiekt jest przedstawicielem danej klasy
// Klasa może zawierać w sobie pola (np. marka, model, rok produkcji i przebieg dla auta)
// Klasa może zawierać w sobie metody
// Metody i pola nie muszą być deklarowane jednocześnie
public class Auto {
    // pola klasy
    public String marka;
    public String model;
    public Integer rokProdukcji;
    public Integer przebieg;

    public Auto(){

    }

    public Auto(String marka, String model, Integer rokProdukcji, Integer przebieg){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    // metody klasy
    public void jedz() {
        System.out.println("Jade!");
    }

    public void hamuj() {
        System.out.println("Hamuj!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
