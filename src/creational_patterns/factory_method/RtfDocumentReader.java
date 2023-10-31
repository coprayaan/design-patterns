package creational_patterns.factory_method;
public class RtfDocumentReader implements DocumentReader {
    public void read(String filePath) {
        System.out.println("Reading RTF document from " + filePath);
        // Read RTF document
    }
}
