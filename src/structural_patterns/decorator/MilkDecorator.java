package structural_patterns.decorator;

public class MilkDecorator implements CoffeeDecorator {
    private final Coffee decoratedCoffee;

    public MilkDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 2.0;
    }
}
