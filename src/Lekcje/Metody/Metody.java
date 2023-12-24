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
}
