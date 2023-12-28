package structural_patterns.flyweight;

public class TextEditor {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Create and display characters
        Character a = characterFactory.getCharacter('A', "Arial", 12);
        Character b = characterFactory.getCharacter('B', "Arial", 12);
        Character c = characterFactory.getCharacter('C', "Times New Roman", 14);

        a.display(1);  // Shared 'Arial' font and size 12
        b.display(2);  // Shared 'Arial' font and size 12
        c.display(3);  // Shared 'Times New Roman' font and size 14
    }
}