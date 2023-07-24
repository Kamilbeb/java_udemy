package docs;

public class DocumentChecker {
    public static void main(String[] args) {
        Document doc = new ExcelDocument();
        doc.getDescription();
        Document doc1 = new PdfDocument();
        doc1.getDescription();
    }
}
