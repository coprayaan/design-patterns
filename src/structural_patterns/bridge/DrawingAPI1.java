package structural_patterns.bridge;
// Concrete Implementors
public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1: Drawing a circle at (%.2f,%.2f) with radius %.2f%n", x, y, radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.printf("API1: Drawing a square at (%.2f,%.2f) with side %.2f%n", x, y, side);
    }
}
