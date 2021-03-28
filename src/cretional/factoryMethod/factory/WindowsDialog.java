package cretional.factoryMethod.factory;

import cretional.factoryMethod.buttons.Button;
import cretional.factoryMethod.buttons.WindowsButton;

// Will produce windows button
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
