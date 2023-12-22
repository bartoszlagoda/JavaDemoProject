package Lekcje;

// umożliwiają wykonywanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    // tworzymy metodę main() abyśmy mogli wyświetlać wyniki na ekranie
    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // dodawanie
        int substraction = firstNumber - secondNumber; // odejmowanie
        int multiplication = firstNumber * secondNumber; // mnożenie
        int division = firstNumber/secondNumber; // dzielenie
        float division2 = thirdNumber/secondNumber; // dzielenie we float, aby otrzymac wynik po przecinku
        int mod = secondNumber%firstNumber; // modulo [reszta z dzielenia] - 6 miesci sie w 4

        // tutaj nastąpi konwersja danych do String
        System.out.println("Wynikiem dodawania jest: " + addition); // wynik: 10
        System.out.println("Wynikiem odejmowania jest: " + substraction); // wynik: -2
        System.out.println("Wynikiem mnozenia jest: " + multiplication); // wynik: 24
        System.out.println("Wynikiem dzielenia jest: " + division); // wynik: 0.66 (wyszedl 0, poniewaz ustawiony byl int)
        System.out.println("Wynikiem dzielenia jest: " + division2); // wynik: 0.66
        System.out.println("Wynikiem modulo jest: " + mod); // 4 miesci sie 1 razy w 6 i reszta, ktora zostaje to 2

        // inny sposob zapisu zmiennych i operacji na nich
        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber (nadpisanie zmiennej)
        System.out.println("Wynikiem tego dodawania jest: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Wynikiem tego odejmowania jest: " + firstNumber);
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Wynikiem tego mnozenia jest: " + firstNumber);
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Wynikiem tego dzielenia jest: " + firstNumber);
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Wynikiem tego modulo jest: " + firstNumber);

    }

}
