package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;

// The creator class. Base factory class. Should have core business logic.
public abstract class Dialog {
    // Subclasses will override this method in order to specific button objects
    public abstract Button createButton();


    public void render() {
        // Other code - render another part of dialog

        Button okButton = createButton();
        okButton.render();
    }
}
