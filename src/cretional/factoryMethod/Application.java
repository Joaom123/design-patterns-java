package cretional.factoryMethod;

import cretional.factoryMethod.factory.Dialog;
import cretional.factoryMethod.factory.LinuxDialog;
import cretional.factoryMethod.factory.WindowsDialog;

// Usage example
public class Application {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    // All the client code should work with factories and products through abstract interfaces.
    // This way it doesn't care which factory it works with and what kind of product it returns.
    private static void runBusinessLogic() {
        dialog.render();
    }

    // Depending on environment
    private static void configure() {
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new LinuxDialog();
        } else {
            dialog = new WindowsDialog();
        }
    }
}
