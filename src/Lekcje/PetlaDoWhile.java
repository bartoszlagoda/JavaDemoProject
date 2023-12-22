package Lekcje;

public class PetlaDoWhile {
    public static void main(String[] args) {
        int number = 21; // wartosc przewyzsza na starcie warunek petli while

        // petla wykonuje sie pomimo wartosci 21
        do {
            System.out.println("Moja wartosc to : " + number + " i jestem mniejsza od 20");
            number++;
        } while (number < 20); // warunek sprawdzany na koncu, wiec po jednym razie petla zostanie przerwana
    }
}
