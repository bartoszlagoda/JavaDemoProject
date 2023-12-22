package Lekcje;

import java.util.Scanner;

public class PobieranieDanychOdUzytkownika {
    public static void main(String[] args) {
        // pobieranie imienia od uzytkownika (uzycie klasy domyslnej Javy - Scanner)
        Scanner scanner = new Scanner(System.in); // utworzenie obiektu klasy Scanner, który nazywa się scanner
        System.out.println("Podaj swoje imie: ");
        String name = scanner.nextLine(); // wywołanie metody klasy Scanner wywołującej pobranie od użytkownika wprowadzonych znaków
        System.out.println("Czesc " + name + " !");

        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt(); // wymaga od uzytkownika podania tylko znaków typu Integer
        //int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + firstNumber * firstNumber);
    }
}
