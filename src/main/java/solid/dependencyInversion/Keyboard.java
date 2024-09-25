package main.java.solid.dependencyInversion;

// Keyboard, InputDevice arayüzünü implement ediyor

public class Keyboard implements InputDevice{
    @Override
    public String input() {
        return "keyboard input";
    }
}
