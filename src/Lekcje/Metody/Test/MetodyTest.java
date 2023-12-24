package Lekcje.Metody.Test;

import Lekcje.Metody.Metody;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        System.out.println("Wywołanie metody typu void:");
        metody.policzWynik();
        // int result = metody.policzWynik();
        // metoda typu void nie określa typu zwracanej wartosci
        // nie da się takiej metody przypisać do żadnej zmiennej
        System.out.println("Rezultat metody typu int pobierzWynik to:");
        metody.pobierzWynik();
        int rezultat = metody.pobierzWynik() * 2; // zwróci wszystko z metody
        System.out.println("Rezultat metody typu int pobierzWynik pomnozonej razy 2 to: \n" + rezultat); // zwroci 9900
    }
}
