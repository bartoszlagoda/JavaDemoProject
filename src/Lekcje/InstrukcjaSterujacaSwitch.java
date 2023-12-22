package Lekcje;

public class InstrukcjaSterujacaSwitch {
    public static void main(String[] args) {
//        String danie = "Losos"; // Cena to 30 zl
//        String danie = "Pizza"; // Cena to 22 zl
        String danie = "Krewetki"; // Brak dania w karcie

        switch (danie) {
            // w tym bloku będziemy podawać możliwości, które mogą nam się przytrafić
            case "Pizza":
                System.out.println("Cena to 22 zl");
                break; // przerwanie instrukcji sterujacej
            case "Losos":
                System.out.println("Cena to 30 zl");
                break; // brak break spowoduje przejscie do nastepnego case'u
            case "Frytki":
                System.out.println("Cena to 9 zl");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
