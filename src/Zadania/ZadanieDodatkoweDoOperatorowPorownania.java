package Zadania;

import java.util.Scanner;

public class ZadanieDodatkoweDoOperatorowPorownania {
    // Poprosic uzytkownika o podanie dwoch liczb i wykonanie na nich wszystkich operacji logicznych
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** KALKULATOR OPERACJI LOGICZNYCH ****\nWprowadz pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadz druga liczbe: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Na podanych przez Ciebie liczbach zostaly wykonane podstawowe operacje logiczne." +
                "\nOto wyniki: ");

        System.out.println(firstNumber + " == " + secondNumber + " : " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " != " + secondNumber + " : " + (firstNumber != secondNumber));
        System.out.println(firstNumber + " > " + secondNumber + " : " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + " : " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + " : " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + " : " + (firstNumber <= secondNumber));
    }
}
