package Lekcje;

// dzialaja na wartosciach logicznych zwracajac rowniez wartosci logiczne
public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // Operator i -> TRUE wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // false
        System.out.println(secondValue && thirdValue); // false

        // Operator lub -> TRUE gdy chociaż jedno wyrazenie jest rowne true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || fourthValue); // false
        System.out.println(secondValue || thirdValue); // true

        // negacja - zwraca wartosc przeciwna do wyrazenia, przed ktorym sie znajduje
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue)); // true
    }
}
