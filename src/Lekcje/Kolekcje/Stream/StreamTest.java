package Lekcje.Kolekcje.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // tworzenie listy imion
        List<String> names = Arrays.asList("Tom","John","Mat","Paul");

        // zapakowanie listy imion names w strumień
        Stream<String> streamNames = names.stream();
        Stream<String> streamNames2 = names.stream();

        // tworzenie streama z nowotworzonej listy
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2,3}).stream();

        // Tworzenie streama typu Double
        DoubleStream doubleStram = DoubleStream.of(3,3,2,1,4);

        // Tworzenie streama typu Int w zakresie od 1 do 100
        IntStream intStream = IntStream.range(1,100);
        IntStream intStream2 = IntStream.range(1,100);

        //przetwarzanie danych
        // filter - filtrowanie
        // map - zmiana elementu na coś innego
        // limit - zwraca okreslona liczbe elementow
        // peak - pozwala przeprowadzić operacje na kazdym elemencie

        // Operacje kończące strumień:
        // foreach - wykonanie akcji dla każdego elementu strumienia
        // count - zwraca ilość elementów w strumieniu
        // allMatch - sprawdza spełnienie warunku dla każdego elementu strumienia; kiedy choć jeden element
        // nie spełni warunku to zwracana jest wartość false
        // collect - zwraca nowy typ na podstawie strumienia

        streamNames.filter(element -> element.startsWith("T"))     // Tom
                .map(element -> element.toUpperCase())             // TOM
                .forEach(element -> System.out.println(element));

        System.out.println("Ograniczono wynikowe elementy do 10, oto one: ");

        intStream.filter(element -> element > 20)
                .map(element -> element * 2)
                .limit(10)
                .forEach(element -> System.out.println(element));

        long count = intStream2.filter(element -> element > 20)
                .map(element -> element * 2)
                .limit(10)
                .count();

        System.out.println("Zliczono elementów: " + count);

        List<String> modifiedNames =
                streamNames2.filter(element -> element.startsWith("T"))     // Tom
                .map(element -> element.toUpperCase())             // TOM
                .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());



    }
}
