package Zadania.ZadaniaNaPodsumowanie;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(1);
        fibonacci(3);
        fibonacci(5);
        fibonacci(10);
    }

    public static void fibonacci(int n){
        long n1 = 1;
        long n2 = 1;

        for(int i = 3; i <= n; i++){
            long temp = n2 + n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}
