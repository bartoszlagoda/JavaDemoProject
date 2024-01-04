package Zadania.drivers;


public class WebDriverTest {
    public static void main(String[] args) {
//        ChromeDriver chrome = new ChromeDriver();
        WebDriver driver = getDriver("Chrome");
        String chromeGet = driver.get();
        String chromeFindElementBy = driver.findElementBy();

        System.out.println(chromeGet);
        System.out.println(chromeFindElementBy);

//        FirefoxDriver firefox = new FirefoxDriver();
        driver = getDriver("firefox");
        String firefoxGet = driver.get();
        String firefoxFindElementBy = driver.findElementBy();

        System.out.println(firefoxGet);
        System.out.println(firefoxFindElementBy);
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
