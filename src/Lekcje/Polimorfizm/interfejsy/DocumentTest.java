package Lekcje.Polimorfizm.interfejsy;

public class DocumentTest {
    public static void main(String[] args) {
        Document pdfDocument = new PDFDocument();
        Document excelDocument = new ExcelDocument();
        pdfDocument.getDescription();
        excelDocument.getDescription();
    }
}
