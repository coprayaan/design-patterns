package structural_patterns.decorator;

public class SugarDecorator implements CoffeeDecorator {
    private final Coffee decoratedCoffee;

    public SugarDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.0;
    }
}
