package Lekcje.Wyjatki;

import Zadania.drivers.ChromeDriver;
import Zadania.drivers.FirefoxDriver;
import Zadania.drivers.WebDriver;

public class ExceptionsExample {
    public static void main(String[] args) {
/*
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        } //jeśli i <= numbers.length to: ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
 */
        // NullPointerException: Cannot invoke "Zadania.WebDriver.WebDriver.findElementBy()" because "driver" is null
        WebDriver driver = getDriver("firefoxaa");
        driver.findElementBy();
    }

    private static WebDriver getDriver(String driverName) {
        if (driverName.equals("chrome")) {
            return new ChromeDriver();
        } else if (driverName.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
