package Lekcje;

public class InstrukcjaWarunkowaIfElse {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        //float dzielnik = 2.0F;
        float dzielnik = 0;

        // Jesli dzielnik bedzie rozny od 0, to wydrukuj na ekranie zwrotke z bloku kodu IF
        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik); // powinno być 2
        } else {
            // ta linijka uruchomi sie tylko wtedy gdy dzielnik bedzie rowny 0
            System.out.println("Prosze podaj inna liczbe. ");
        } // koniec IF ELSE
    } // koniec metody main
} // koniec klasy
