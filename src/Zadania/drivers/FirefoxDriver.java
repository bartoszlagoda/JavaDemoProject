package Zadania.drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public String get() {
        return "Biore element w przegladarce Firefox";
    }

    @Override
    public String findElementBy() {
        return "Znalazlem element w przeglarce Firefox";
    }
}
