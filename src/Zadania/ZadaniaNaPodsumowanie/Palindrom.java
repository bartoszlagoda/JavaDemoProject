package Zadania.ZadaniaNaPodsumowanie;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(czyPalindrom("kajak"));
        System.out.println(czyPalindrom("słoik"));
        System.out.println(czyPalindrom("nowytarggóryzakopanenapokazyróggratywon"));
    }

    public static boolean czyPalindrom(String word){
        int n = word.length();
        for(int i = 0; i < (n/2); i++){
            if(word.charAt(i) != word.charAt(n-1-i)){
                System.out.println(word + " nie jest palindromem");
                return false;
            }
        }
        System.out.println(word + " jest palindromem");
        return true;
    }
}
