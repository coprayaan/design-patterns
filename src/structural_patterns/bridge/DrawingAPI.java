package structural_patterns.bridge;

// Implementor interface
public interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double side);
}