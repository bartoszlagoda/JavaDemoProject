package Zadania.ZadaniaNaPodsumowanie;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,2,5,3}; // tablica z liczbami
        liczWystapienia(numbers);
    }

    public static void liczWystapienia(int[] numbers){
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(occurrences.containsKey(numbers[i])) {
                Integer value = occurrences.get(numbers[i]);
                occurrences.put(numbers[i], value + 1);
            } else {
                occurrences.put(numbers[i],1);
            }
        }
        for(Integer occurrence : occurrences.keySet()){
            System.out.println(occurrence + " : " + occurrences.get(occurrence));
        }
    }
}
