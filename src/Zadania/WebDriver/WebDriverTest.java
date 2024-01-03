package Zadania.WebDriver;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDrier chrome = new ChromeDrier();
        String chromeGet = chrome.get();
        String chromeFindElementBy = chrome.findElementBy();

        System.out.println(chromeGet);
        System.out.println(chromeFindElementBy);

        FirefoxDriver firefox = new FirefoxDriver();
        String firefoxGet = firefox.get();
        String firefoxFindElementBy = firefox.findElementBy();

        System.out.println(firefoxGet);
        System.out.println(firefoxFindElementBy);
    }
}
