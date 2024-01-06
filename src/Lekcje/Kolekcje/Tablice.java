package Lekcje.Kolekcje;
// Struktury, które pozwalają nam gromadzić większą ilość danych
public class Tablice {
    public static void main(String[] args) {
        // tablicę deklarujemy przez podanie typu, nawiasów kwadratowych i nazwy
        // po znaku równa się deklarujemy nowy typ z określoną liczbą elementów
        String[] imiona = new String[3];
        // dodawanie wartości do poszczególnych zmiennych tablicowych (index od 0)
        imiona[0] = "Bartosz";
        imiona[1] = "Barbara";
        imiona[2] = "Michal";

        System.out.println(imiona[0]); //Bartosz
        System.out.println(imiona[1]); // Barbara
        System.out.println(imiona[2]); // Michal

        int[] lottoNumbers = new int[] {1,2,3,4,5,6}; // inny sposob deklaracji tablicy
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length); // 6 elementow

        // najprościej jest iterować zmienne tablicowe w pętli
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }
    }
}
