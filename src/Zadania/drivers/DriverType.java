package Zadania.drivers;

public enum DriverType {
    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "src/resources/firefoxdriver.exe"),
    SAFARI("safari", "src/resources/safaridriver.exe");

    String name;
    String path;

    //konstruktor enuma
    private DriverType(String name, String path){
        this.name = name;
        this.path = path;
    }
}
