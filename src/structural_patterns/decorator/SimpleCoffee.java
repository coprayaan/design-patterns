package structural_patterns.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;
    }
}
