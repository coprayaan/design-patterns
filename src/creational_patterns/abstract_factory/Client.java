package creational_patterns.abstract_factory;

public class Client {
    public static void main(String[] args) {
        UiElementsFactory factory = new IOSElementFactory();
        factory.createButton();
        factory.createInput();
        factory.createLabel();
        factory.createCheckbox();
    }
}
