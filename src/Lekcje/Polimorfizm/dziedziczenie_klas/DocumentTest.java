package Lekcje.Polimorfizm.dziedziczenie_klas;

public class DocumentTest {
    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument();
        // dokument excel jest jedną z postaci klasy Document
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PDFDocument();

        excelDocument.getDescription(); // metoda ExcelDocument
        pdfDocument.getDescription(); // metoda PDFDocument
    }
}
