package Zadania.App;

public class App {
    public String name;

    public App(String name){
        this.name = name;
    }

    public void appInfo(){
        System.out.println("To jest najnowsza wersja aplikacji - 2.0.0");
        System.out.println("Witaj w aplikacji " + name + " ! ");
    }
}
