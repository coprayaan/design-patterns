package abstract_factory;

public class AndroidElementFactory implements UiElementsFactory{
    
        @Override
        public void createButton() {
            System.out.println("Creating Android button");
        }
    
        @Override
        public void createInput() {
            System.out.println("Creating Android input");
        }
    
        @Override
        public void createLabel() {
            System.out.println("Creating Android label");
        }
    
        @Override
        public void createCheckbox() {
            System.out.println("Creating Android checkbox");
        }

}
