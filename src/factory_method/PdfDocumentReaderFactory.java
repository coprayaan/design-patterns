package factory_method;

public class PdfDocumentReaderFactory implements DocumentReaderFactory {
    public DocumentReader createDocumentReader() {
        return new PdfDocumentReader();
    }
}
