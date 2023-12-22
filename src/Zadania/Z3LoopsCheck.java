package Zadania;
// Wypisz liczby z zakresu 1 - 100 podzielne przez 3
// Odwroc elementy tablicy [1,3,5] -> [5,3,1]
public class Z3LoopsCheck {
    public static void main(String[] args) {
        System.out.println("Wypisanie liczb podzielnych przez 3 od 0 do 100:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Liczba podzielna przez 3: " + i);
            }
        }
        int[] numbers = new int[]{1,3,5};
        System.out.println("Iteracja zmiennych tablicowych w starej konfiguracji [1,3,5]:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Odwrocenie elementow tablicy [1,3,5] -> [5,3,1]");
        for (int i = 0; i < numbers.length/2; i++) {
            int s = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = s;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
