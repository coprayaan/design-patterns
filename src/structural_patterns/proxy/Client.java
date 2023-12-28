package structural_patterns.proxy;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("image1.jpg");
        Image image2 = new ImageProxy("image2.jpg");

        // Images are loaded only when requested
        image1.display();
        image2.display();
    }
}
