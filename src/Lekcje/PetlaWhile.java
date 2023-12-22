package Lekcje;

public class PetlaWhile {
    public static void main(String[] args) {
        int number = 0;

        // while rozni sie od for tym, ze w argumentach petli dodajemy tylko warunek do kiedy cos ma sie wykonywac
        // nazwa zmiennej, ktora jest powiazana z warunkiem musi byc zadeklarowana przed wywolaniem petli
        // dzialanie na zmiennej powodujace zmiane jej musi znajdowac sie w ciele tej petli

        while (number < 20) {
            System.out.println("Moja wartosc to : " + number + " i jestem mniejsza od 20");
            number++;
        }
    }
}
