package structural_patterns.bridge;
public class Client{
    public static void main(String[] args) {
        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI api2 = new DrawingAPI2();

        Shape circle = new Circle(1, 2, 3, api1);
        Shape square = new Square(5, 7, 4, api2);

        circle.draw(); // Draws a circle using DrawingAPI1
        square.draw(); // Draws a square using DrawingAPI2
    }
}