package creational_patterns.factory_method;
public class RtfDocumentReaderFactory implements DocumentReaderFactory {
    public DocumentReader createDocumentReader() {
        return new RtfDocumentReader();
    }
}