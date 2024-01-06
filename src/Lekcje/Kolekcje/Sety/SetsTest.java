package Lekcje.Kolekcje.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetsTest {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(); // nie definiujemy wielkości zbioru
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("Podstawowe informacje na temat zbioru 'fruits'");
        System.out.println("Czy 'apple' istnieje w tym zbiorze? : " + fruits.contains("apple"));
        System.out.println("Wielkość zbioru to: " + fruits.size() + "/2");
        System.out.println("Czy zbiór jest pusty? : " + fruits.isEmpty());

        Set<String> vegetables = new HashSet<>();
        vegetables.add("potatoes");
        vegetables.add("onion");

        Set<String> vegeAndFruits = new HashSet<>();
        vegeAndFruits.addAll(fruits); // dodanie całego zbioru do zbioru
        vegeAndFruits.addAll(vegetables);

        System.out.println("Podstawowe informacje na temat zbioru 'vegeAndFruits'");
        System.out.println("Wielkość zbioru to: " + vegeAndFruits.size() + "/4");
        System.out.println("Czy 'orange' jest w tym zbiorze? : " + vegeAndFruits.contains("orange"));
        System.out.println("Czy 'onion' jest w tym zbiorze? : " + vegeAndFruits.contains("onion"));
        System.out.println("Elementami zbioru 'vegeAndFruits' są : ");

        // przechodzenie po elementach zbioru
        for(String vegeAndFruit : vegeAndFruits){
            System.out.println(vegeAndFruit);
        }
    }
}
