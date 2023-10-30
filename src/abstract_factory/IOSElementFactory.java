package abstract_factory;

/**
 * IOSElementFactory
 */
public class IOSElementFactory implements UiElementsFactory {

    @Override
    public void createButton() {
        System.out.println("Creating IOS button");
    }

    @Override
    public void createInput() {
        System.out.println("Creating IOS input");
    }

    @Override
    public void createLabel() {
        System.out.println("Creating IOS label");
    }

    @Override
    public void createCheckbox() {
        System.out.println("Creating IOS checkbox");
    }

    
}