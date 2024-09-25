package main.java.solid.liskovSubstitution;

// Serçe (uçabilen bir kuş) sınıfı

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
