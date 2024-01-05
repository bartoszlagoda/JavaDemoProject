package Zadania.drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();

        // klasa anonimowa
        WebDriver safari = new WebDriver() {
            @Override
            public String get() {
                return "Otwieram stronę w Safari";
            }

            @Override
            public String findElementBy() {
                return "Znalazłem element w przegladarce Safari";
            }
            // proba ponownego stworzenia klasy anonimowej to ponowne tworzenie całego body
        };

        System.out.println(safari.get());
        System.out.println(safari.findElementBy());


    }
}
