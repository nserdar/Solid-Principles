package main.java.solid.liskovSubstitution;

// Devekuşu (uçamayan bir kuş) sınıfı

public class Ostrich extends Bird{
    public void speak(){
        System.out.println("Ostrich is speaking");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}
