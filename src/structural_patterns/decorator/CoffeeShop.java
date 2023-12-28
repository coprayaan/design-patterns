package structural_patterns.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());

        // Create a coffee with milk and sugar
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost of coffee with milk and sugar: $" + coffeeWithMilkAndSugar.cost());

        // Create a coffee with caramel
        Coffee coffeeWithCaramel = new CaramelDecorator(simpleCoffee);
        System.out.println("Cost of coffee with caramel: $" + coffeeWithCaramel.cost());
    }
}