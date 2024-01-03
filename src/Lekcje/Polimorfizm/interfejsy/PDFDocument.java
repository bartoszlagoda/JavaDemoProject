package Lekcje.Polimorfizm.interfejsy;

public class PDFDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I am PDF Document.");
    }
}
