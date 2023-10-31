package creational_patterns.factory_method;

// Client code
public class Client {
    public static void main(String[] args) {
        // Create PDF document reader
        DocumentReaderFactory pdfFactory = new PdfDocumentReaderFactory();
        DocumentReader pdfReader = pdfFactory.createDocumentReader();
        pdfReader.read("path/to/document.pdf");

 
        // Create RTF document reader
        DocumentReaderFactory rtfFactory = new RtfDocumentReaderFactory();
        DocumentReader rtfReader = rtfFactory.createDocumentReader();
        rtfReader.read("path/to/document.rtf");
    }
}
