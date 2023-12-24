package Zadania.Calculator;
// Rozbudowanie kalkulatora o poprzednie funkcje, ale podzielone na metody
// Dodawanie, odejmowanie, mnozenie, dzielenie, modulo

public class Calculator {
    public int firstNumber;
    public int secondNumber;

    public int addition(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println("Wynik dodawania dla " + firstNumber + " i " + secondNumber + " to: " + result);
        return result;
    }

    public int substraction(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania dla " + firstNumber + " i " + secondNumber + " to: " + result);
        return result;
    }

    public int multiplication(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        System.out.println("Wynik mnozenia dla " + firstNumber + " i " + secondNumber + " to: " + result);
        return result;
    }

    public float division(int firstNumber, int secondNumber){
        float firstNumberToFloat = firstNumber;
        float secondNumberToFloat = secondNumber;
        float result = firstNumberToFloat / secondNumberToFloat;
        System.out.println("Wynik dzielenia dla " + firstNumberToFloat + " i " + secondNumberToFloat + " to: " + result);
        return result;
    }

    public int mod(int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        System.out.println("Wynik modulo dla " + firstNumber + " i " + secondNumber + " to: " + result);
        return result;
    }

}
