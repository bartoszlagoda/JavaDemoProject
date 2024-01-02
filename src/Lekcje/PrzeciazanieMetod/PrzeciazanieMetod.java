package Lekcje.PrzeciazanieMetod;

public class PrzeciazanieMetod {

    // pierwotna metoda
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // nadpisana metoda z dodanym argumentem w celu uniknięcia błędów
    public void add(int a, int b, int c) {
        System.out.println(a + b);
    }

    // nadpisana metoda z usunietymi niektorymi parametrami
    public void add(int a) {
        System.out.println(a);
    }
    // nadpisana metoda ze zmienionymi typem parametru
    public void add(String a) {
        System.out.println(a);
    }

    // nadpisana metoda bez parametrów
    public void add(){
        System.out.println(2+1);
    }

}
