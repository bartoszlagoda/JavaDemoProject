package Lekcje.Klasy.Test;

import Lekcje.Klasy.Base.Auto;
// klasa testowa dla klasy Auto
public class AutoTest {
    public static void main(String[] args) {

        // deklaracja zmiennej typu Auto (tworzenie obiektu klasy Auto)
        Auto mercedes = new Auto("Mercedes","Klasa S",2021,1000);
//        Auto mercedes = new Auto();
        // przypisanie wartosci do pol obiektu mercedes
//        mercedes.marka = "Mercedes";
//        mercedes.model = "Klasa S";
//        mercedes.rokProdukcji = 2021;
//        mercedes.przebieg = 1000;

        // wywołanie metod klasy Auto na obiekcie mercedes
        mercedes.jedz(); // CTRL + TAB -> powrót do początkowej klasy
        mercedes.hamuj();
        mercedes.info();

        // deklaracja nowej zmiennej typu Auto
//        Auto audi = new Auto();
        Auto audi = new Auto("Audi","A5",2020,0);
//        audi.marka = "Audi";
//        audi.model = "A5";
//        audi.rokProdukcji = 2020;
//        audi.przebieg = 0;

        // wywołanie metod klasy Auto na obiekcie audi
        audi.jedz();
        audi.hamuj();
        audi.info();

        // deklaracja nowej zmiennej typu Auto
        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info(); // wywolaly sie wartosci domyslne - null, null, 0, 0
    }
}
