public class InkrementacjaIDekrementacja {
    public static void main(String[] args) {
        // inkrementacja to zwiekszenie wartosci o jeden

        int a = 0;
        System.out.println("Wartosc a: " + a); // Wartosc to 0
        int b = a++; // b = a + 1 (postinkrementacja, czyli najpierw przypisanie wartosci a później zwiększe o 1)
        System.out.println("Wartosc b: " + b); // 0
        System.out.println("Wartosc a: " + a); // 1
        int c = ++a; // preinkrementacja, czyli najpierw zwiekszenie wartosci, a pozniej przypisanie wartosci
        System.out.println("Wartosc c: " + c); // 2
        System.out.println("Wartosc a: " + a); // 2

        //dekrementacja to zmniejszenie wartosci o jeden

        int d = 0;
        System.out.println("Wartosc d: " + d); //0
        int e = d--; // postdekrementacja
        System.out.println("Wartosc e: " + e); //0
        System.out.println("Wartosc d: " + d); //-1
        int f = --d; // predekrementacja
        System.out.println("Wartosc f: " + f); //-2
        System.out.println("Wartosc d: " + d); //-2
    }
}
