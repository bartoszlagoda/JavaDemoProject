package Lekcje;

// Umozliwia cykliczne wykonywanie ciagu instrukcji określoną liczbę razy
public class PetlaFor {
    public static void main(String[] args) {

        // wydrukowanie na ekranie liczb od 0 do 100 co drugą liczbę
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        // znajdowanie liczb podzielnych przez 5
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
