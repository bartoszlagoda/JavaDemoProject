package Lekcje.Metody;
// Metoda to blok, ktory zawiera w sobie jakies instrukcje
public class Metody {
    // stworzenie metody, ktora bedzie dodawala cyfry od 1 do 100
    // wypisze na ekranie wynik
    // void - metoda nie zwracajaca zadnej wartosci
    public void policzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        // wywoławcze typy metod wymagaja slowa kluczowego return
        // pozwala ono na zwrocenie wartosci z metody (zgodnej z zadeklarowanym typem metody)
        return result;
    }

    public void policzWynikParam(int number) { // wewnatrz nawiasu podajemy wartosc, ktora ma byc dostarczana przy wywolaniu metody
        System.out.println("Number ma wartosc: " + number);
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < number; i++) { // tutaj chcemy uzyc argumentu funkcji
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public void add(int firstNumber, int secondNumber) {
        // po wcisnietym ALT + ENTER mamy utworzona metode z mozliwoscia konfigurowania jej
        System.out.println("Suma to: " + (firstNumber + secondNumber));
    }
    // w argumentach funkcji można podawać argumenty różnych typów, nie tylko tego, który jest zwracany
    public int addInteger(int firstNumber, int secondNumber) {
        // po wcisnietym ALT + ENTER mamy utworzona metode z mozliwoscia konfigurowania jej
//        System.out.println("Suma to: " + (firstNumber + secondNumber));
//        if (firstNumber == 0) {
//            return 0; // to jest sciezka TRUE, ale musi byc jeszcze FALSE
//        }
        // to jest sciezka FALSE
        return firstNumber + secondNumber;
        // po return już nic nie wywołamy
    }
}
