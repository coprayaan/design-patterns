package factory_method;

public class PdfDocumentReader implements DocumentReader {
    public void read(String filePath) {
        System.out.println("Reading PDF document from " + filePath);
        // Read PDF document
    }
}

