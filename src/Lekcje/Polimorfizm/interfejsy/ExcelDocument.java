package Lekcje.Polimorfizm.interfejsy;

public class ExcelDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I am Excel Document.");
    }
}
