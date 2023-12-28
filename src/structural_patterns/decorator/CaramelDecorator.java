package structural_patterns.decorator;

public class CaramelDecorator implements CoffeeDecorator {
    private final Coffee decoratedCoffee;

    public CaramelDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 3.0;
    }
}
