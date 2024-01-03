package Zadania.WebDriver;

public class ChromeDriver implements WebDriver{
    @Override
    public String get() {
        return "Biore element w przegladarce Chrome";
    }

    @Override
    public String findElementBy() {
        return "Znalazlem element w przeglarce Chrome";
    }
}
