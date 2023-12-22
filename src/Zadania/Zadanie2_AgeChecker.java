package Zadania;

/*
Zapytaj uzytkownika o wiek.
W przypadku gdy ma mniej niz 18 lat wypisz na ekranie informacje ze nie moze kupic alkoholu.
 Gdy ma wiecej niz 18 lat to podziekuj za zakupy.
 */

import java.util.Scanner;

public class Zadanie2_AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz swoj wiek: ");
        int userAge = scanner.nextInt();

        if (userAge < 18 && userAge >= 0) { // wprowadzono AND, bo inaczej drugi warunek nie bylby brany pod uwage
            System.out.println("Alkohol nie jest sprzedawany osobom ponizej 18 roku zycia. ");
        } else if (userAge < 0) {
            System.out.println("Wartosc niepoprawna. Wprowadz jeszcze raz swoj wiek. ");
        }else {
            System.out.println("Dziekujemy za zakupy i zapraszamy ponownie. ");
        }
    }
}
