package Zadania.App;

public class AndroidApp extends App{

    public AndroidApp(String name) {
        super(name);
    }

    public void runAndroidApp(){
        appInfo();
        System.out.println("======== ANDROID SYSTEM ========");
        System.out.println("--------- Wersja 14.0.0 --------");
        System.out.println("Wykryto nowy program.");
        System.out.println("Skanuje...");
        System.out.println("Przeskanowano. Wlaczam system...");
        System.out.println("System wlaczono");
        System.out.println("Program " + name + " zostal wlaczony poprawnie.");
    }
}
