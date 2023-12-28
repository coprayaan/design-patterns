package structural_patterns.flyweight;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<CharacterKey, Character> characters = new HashMap<>();

    public Character getCharacter(char symbol, String font, int size) {
        CharacterKey key = new CharacterKey(symbol, font, size);
        if (!characters.containsKey(key)) {
            characters.put(key, new ConcreteCharacter(symbol, font, size));
        }
        return characters.get(key);
    }

    private class CharacterKey {
        char symbol;
        String font;
        int size;

        CharacterKey(char symbol, String font, int size) {
            this.symbol = symbol;
            this.font = font;
            this.size = size;
        }

        // Implement equals and hashCode methods for use as keys in the map
        // ...
    }
}