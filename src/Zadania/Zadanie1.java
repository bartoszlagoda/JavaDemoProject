package Zadania;

import java.util.Scanner;

public class Zadanie1 {
    // napisz program, ktory poprosi uzytkownika o 2 liczby, a nastepnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** KALKULATOR ****\nWprowadz pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadz druga liczbe: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Na podanych przez Ciebie liczbach zostaly wykonane podstawowe operacje matematyczne." +
                "\nOto wyniki: ");

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        // tutaj nastąpi konwersja danych do String
        System.out.println("Wynikiem dodawania jest: " + addition);
        System.out.println("Wynikiem odejmowania jest: " + substraction);
        System.out.println("Wynikiem mnozenia jest: " + multiplication);
        System.out.println("Wynikiem dzielenia jest: " + division);
        System.out.println("Wynikiem modulo jest: " + mod);
    }
}
