package Zadania.drivers;


public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName{

        DriverType[] driverTypes = DriverType.values();
        // iterowanie po wartościach enuma
        for(int i = 0; i < driverTypes.length; i++){
            System.out.println((i + 1) + " : " + driverTypes[i].name);
            System.out.println("Sciezka dla " + (i + 1) + " : " + driverTypes[i].path);
        }

        System.out.println("===========\nDRIVERS\n===========");

//        ChromeDriver chrome = new ChromeDriver();
        WebDriver driver = getDriver(DriverType.CHROME);
        String chromeGet = driver.get();
        String chromeFindElementBy = driver.findElementBy();

        System.out.println(chromeGet);
        System.out.println(chromeFindElementBy);

//        FirefoxDriver firefox = new FirefoxDriver();
        driver = getDriver(DriverType.FIREFOX);
        String firefoxGet = driver.get();
        String firefoxFindElementBy = driver.findElementBy();

        System.out.println(firefoxGet);
        System.out.println(firefoxFindElementBy);
    }

    private static WebDriver getDriver(DriverType driverName) /*throws NoValidBrowserName*/ {
//        if (driverName==DriverType.CHROME) {
        if (driverName.name.equals("chrome")){
            System.out.println(driverName.path);
            return new ChromeDriver();
        }
        System.out.println(driverName.path);
        return new FirefoxDriver();
//        throw new NoValidBrowserName("No valid browser name");

    }
}
