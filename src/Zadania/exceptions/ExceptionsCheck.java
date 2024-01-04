package Zadania.exceptions;

import java.util.Scanner;

public class ExceptionsCheck {
    // pobierz wiek od uzytkownika, jezeli bedzie mniejszy od zera to wyrzuc wyjatek InvalidAgeException (ktory trzeba stworzyc)
    // jezeli wiek jest <= 18 to mozna wpisac "Jestes pelnoletni", w innym przypadku wypisz "Nie jestes jeszcze pelnoletni"

    public static void main(String[] args) throws InvalidAgeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz swoj wiek: ");
        int consumerAge = scanner.nextInt();

        if (consumerAge >= 18){
            System.out.println("Jestes pelnoletni");
        } else if (consumerAge < 18 && consumerAge >= 0) {
            System.out.println("Nie jestes jeszcze pelnoletni");
        } else {
            throw new InvalidAgeException("Wprowadzony wiek jest nieprawidlowy. Sprobuj jeszcze raz.");
        }
    }
}
