package Lekcje.Interfejsy;

public class Rower implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem! Naciskam mocno na pedaly!");
    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zatankuj(){
        System.out.println("Aby miec duzo sily musze zjesc obiad");
    }
}
