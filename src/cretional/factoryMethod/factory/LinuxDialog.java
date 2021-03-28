package cretional.factoryMethod.factory;

import cretional.factoryMethod.buttons.Button;
import cretional.factoryMethod.buttons.LinuxButton;

// Will produce linux button
public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
