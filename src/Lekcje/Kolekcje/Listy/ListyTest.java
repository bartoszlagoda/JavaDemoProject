package Lekcje.Kolekcje.Listy;

import java.util.ArrayList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        // tworzenie listy ( type <E> oznacza, że wymaga zdefiniowania typu danych
        List<String> names = new ArrayList<>(); // nie potrzeba dodawać wielkości listy

        // uzupełnianie listy
        names.add("Pawel");
        names.add("Katarzyna");
        names.add("Aleksandra");
        names.add("Pawel"); // duplikaty są dozwolone

        // odwoływanie się do elementów listy
        System.out.println("Wartość o indeksie 0 dla names to: " + names.get(0));
        System.out.println("Index dla wartości Pawel to: " + names.indexOf("Pawel"));
        System.out.println("Ostatnim numerem indeksu, na którym znajduje sie wartosc 'Pawel' to: " + names.lastIndexOf("Pawel"));
        System.out.println("Czy Krystyna znajduje się w tej liście? : " + names.contains("Krystyna"));
        System.out.println("Wielkość tablicy names to: " + names.size()); // w tablicy jest to metoda length()
        System.out.println("Czy tablica names jest pusta? : " + names.isEmpty());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i ++){
            numbers.add(i+1);
        }
        if(numbers.isEmpty() == false){
            System.out.println("Liczba elementów w tablicy numbers to: " + numbers.size());
            System.out.println("Elementy listy numbers to: ");
            for(int i = 0; i < numbers.size(); i++){
                System.out.println(i + ": " + numbers.get(i));
            }
        }
        System.out.println("Elementy listy numbers: ");
        // łatwiejszy sposób iteracji listy
        for(String name : names){
            System.out.println(name);
        }

    }
}
