package Zadania.App;

public class IphoneApp extends App{

    public IphoneApp(String name) {
        super(name);
    }

    public void runIphoneApp(){
        appInfo();
        System.out.println("======== APPLE SYSTEM ========");
        System.out.println("--------- Wersja 11.1.0 --------");
        System.out.println("Wykryto nowy program.");
        System.out.println("Skanuje...");
        System.out.println("Przeskanowano. Wlaczam system...");
        System.out.println("System wlaczono");
        System.out.println("Program " + name + " zostal wlaczony poprawnie.");
    }
}
