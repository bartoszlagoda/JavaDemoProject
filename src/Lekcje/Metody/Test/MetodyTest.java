package Lekcje.Metody.Test;

import Lekcje.Metody.Metody;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();

//        System.out.println("Wywołanie metody typu void:");
//        metody.policzWynik();
//        // int result = metody.policzWynik();
//        // metoda typu void nie określa typu zwracanej wartosci
//        // nie da się takiej metody przypisać do żadnej zmiennej
//
//        System.out.println("Rezultat metody typu int pobierzWynik to:");
//        metody.pobierzWynik();
//        int rezultat = metody.pobierzWynik() * 2; // zwróci wszystko z metody
//
//        System.out.println("Rezultat metody typu int pobierzWynik pomnozonej razy 2 to: \n" + rezultat); // zwroci 9900
//
//        System.out.println("Rezultat metody z podanym argumentem funkcji 200:  ");
//        metody.policzWynikParam(200);
//
//        System.out.println("Rezultat metody z podanym argumentem funkcji 500:  ");
//        metody.policzWynikParam(500);
//
//        System.out.println("Rezultat metody z podanym argumentem funkcji 1000:  ");
//        metody.policzWynikParam(1000);
////        metody.policzWynikParam("String tu nie zadziala ! Musi byc int!");
//        metody.add(2,3); // ALT + ENTER utworzy nam nieistniejaca jeszcze metody przy tak wpisanych wartosciach

        System.out.println("Rezultat z metody dodajacej argumenty zwracajacej INT");
        // metody.addInteger(457,891);
        //System.out.println("Wypisz mi wartosc z metody addInteger: " + metody.addInteger(457,891));
        System.out.println(metody.addInteger(457,891));
        int result = metody.addInteger(8,5);
        System.out.println(result);
    }
}
