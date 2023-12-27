package Zadania.App;
// Stwórz klasę App - zawiera pole name i metode appInfo(), dodaj konstruktor do ktorego przekazesz wartosc name
// Stworz klasy potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp / runIphoneApp
public class AppTest {
    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp("Anti-virus SEPA");
        androidApp.runAndroidApp();
        IphoneApp iphoneApp = new IphoneApp("Anti-virus SEPA");
        iphoneApp.runIphoneApp();
    }
}
