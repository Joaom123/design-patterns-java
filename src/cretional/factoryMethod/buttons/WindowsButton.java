package cretional.factoryMethod.buttons;

// Windows button implementation.
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows button");
    }
}
