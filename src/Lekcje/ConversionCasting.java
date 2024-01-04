package Lekcje;

import Zadania.WebDriver.FirefoxDriver;
import Zadania.WebDriver.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // niejawna konwersja typu int na double zmiennej a

//    int d = a/b; // tutaj nie uda sie konwersja, bo musialaby udac sie na int

        int d = a/(int)b; // taka konwersja double -> int jest dozwolona
        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        System.out.println(firefoxDriver.get());
    }
}
