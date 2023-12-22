package Lekcje;

public class ZmienneDeklaracjaIInicjalizacja {

    // zmienne to zarezerwowane miejsce w pamięci z określonym typem danych
    // W Javie trzeba deklarować typ zmiennej

    public static void main(String[] args) {
        String name = "Bartosz"; // deklaracja zmiennej i inicjalizacja zmiennej
        System.out.println(name); // wyświetlenie zmiennej

        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;
        System.out.println(result);

        name = "Piotr"; // nadpisywanie zmiennej
        System.out.println(name);

        int thirdNumber,fourthNumber,fifthNumber; // zmienne tego samego typu można zadeklarować w jednej linii
        // Konwencja nazw: cammelCase - zaczynamy od małej litery i każde następne słowo z wielkiej
    }
}
