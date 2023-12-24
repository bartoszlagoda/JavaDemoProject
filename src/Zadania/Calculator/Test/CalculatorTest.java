package Zadania.Calculator.Test;

import Zadania.Calculator.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** KALKULATOR ****\nWprowadz pierwsza liczbe: ");

        calculator.firstNumber = scanner.nextInt();
        System.out.println("Wprowadz druga liczbe: ");
        calculator.secondNumber = scanner.nextInt();
        System.out.println("Na podanych przez Ciebie liczbach zostaly wykonane podstawowe operacje matematyczne." +
                "\nOto wyniki: ");
        calculator.addition(calculator.firstNumber, calculator.secondNumber);
        calculator.substraction(calculator.firstNumber, calculator.secondNumber);
        calculator.multiplication(calculator.firstNumber, calculator.secondNumber);
        calculator.division(calculator.firstNumber, calculator.secondNumber);
        calculator.mod(calculator.firstNumber, calculator.secondNumber);

    }
}
