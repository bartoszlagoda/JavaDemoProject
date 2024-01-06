package Lekcje.Kolekcje.Mapy;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {
    public static void main(String[] args) {
        // tworzenie mapy
        Map<Integer,String> students = new HashMap<>();
        // dodawanie elementów do mapy
        students.put(1,"Kasia");
        students.put(2, "Tomek");
        students.put(3, "Kasia");
        students.put(2, "Jacek"); // nadpisanie klucza
        // pobranie wartości z mapy
        System.out.println(students.get(2));

        Map<Integer,String> otherStudents = new HashMap<>();
        otherStudents.putAll(students); // dodanie całej kolekcji do mapy

        System.out.println("Informacje na temat mapy 'students': ");
        System.out.println("Czy mapa zawiera klucz o indeksie 1? : " + students.containsKey(1));
        System.out.println("Czy mapa zawiera wartość 'Paweł'? : " + students.containsValue("Paweł"));
        System.out.println("Czy mapa jest pusta? : " + students.isEmpty());
        System.out.println("Wielkość tej mapy to: " + students.size() + "/3");

        students.remove(1);
        System.out.println("Usunięto wartość 'Basia' o kluczu '1' z mapy. Wielkość mapy teraz to: " + students.size() + "/2");

        System.out.println("Iterowanie po zawartości mapy 'students': ");

        for(Integer key : students.keySet()) {
            System.out.println(key + ": " + students.get(key)); // klucz : wartość
        }
    }
}
