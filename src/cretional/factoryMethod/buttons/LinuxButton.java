package cretional.factoryMethod.buttons;

// Linux button implementation.
public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Linux button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click Linux button");
    }
}
