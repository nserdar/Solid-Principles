package main.java.solid.dependencyInversion;

// Monitor, OutputDevice arayüzünü implement ediyor

public class Monitor implements OutputDevice{
    @Override
    public void display(String content) {
        System.out.println("Displaying" + content);
    }
}
