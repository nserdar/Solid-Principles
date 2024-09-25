package main.java.solid.dependencyInversion;

// Yüksek seviyeli modül, soyutlamalara (InputDevice ve OutputDevice) bağlı

public class BusinessLogic {
    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    // Constructor ile soyutlamalar enjekte ediliyor
    public BusinessLogic(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void run() {
        String input = inputDevice.input();
        outputDevice.display(input);
    }
}
