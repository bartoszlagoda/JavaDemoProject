package Lekcje.KlasyAbstrakcyjne;

public abstract class Animal {
    // stała statyczna w abstrakcyjnej klasie
    public final static int legs = 4;
    // metoda abstrakcyjna w abstrakcyjnej zmiennej
    public abstract void sound();
    public void sayHello(){
        System.out.println("Hello I am animal!");
    }
}
