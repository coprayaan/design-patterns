package structural_patterns.flyweight;

public class ConcreteCharacter implements Character {
    private char symbol;
    private String font;
    private int size;

    public ConcreteCharacter(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }

    public void display(int position) {
        System.out.println("Character: " + symbol + " at position " + position + " with font: " + font + " and size: " + size);
    }
}