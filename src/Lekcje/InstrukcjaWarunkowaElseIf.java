package Lekcje;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
//        int number = 0; // Liczba rowna 0
//        int number = 5; // Liczba dodatnia
//        int number = -15; // Liczba mniejsza od -5
//        int number = 7; // liczba dodatnia
        int number = 12; // Liczba jest wieksza od 10
//        int number = -4; // Zaden warunek nie zostal spelniony

        if (number == 0) {
            System.out.println("Liczba rowna 0");
        }else if (number > 10) {
            System.out.println("Liczba jest wieksza od 10");
        }else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Zaden warunek nie zostal spelniony");
        }

        // Warunki są sprawdzane po kolei, jesli pierwszy zostanie spelniony
        // to program nie bedzie juz sprawdzal nastepnych warunkow
    }
}
