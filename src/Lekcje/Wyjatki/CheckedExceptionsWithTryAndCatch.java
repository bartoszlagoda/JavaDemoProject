package Lekcje.Wyjatki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsWithTryAndCatch {

    public static void main(String[] args) {
        try {
            System.out.println("Przed odczytem pliku");
            readFile("src/resources/test.txt");
            System.out.println("Zamykam plik");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
        } finally {
            System.out.println("Blok try and catch zostal wykonany poprawnie.");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
