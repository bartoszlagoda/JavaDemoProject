package Lekcje;

// instrukcje warunkowe pozwalaja nam okreslac ktore czesci kodu maja zostac wykonane, gdy zostanie spelniony warunek
public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;
        //float dzielnik = 0;

        // Jesli dzielnik bedzie rozny od 0, to wydrukuj na ekranie zwrotke z bloku kodu IF
        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik); // powinno być 2
        } // tu konczy sie blok kodu IF
        System.out.println("Prosze podaj inna liczbe. "); // ta linijka bedzie zawsze wywolana
    }
}
