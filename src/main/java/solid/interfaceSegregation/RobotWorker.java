package main.java.solid.interfaceSegregation;

// Robot sınıfı sadece çalışabilir, yemek yeme yeteneği yoktur

public class RobotWorker implements Workable{
    @Override
    public void work() {
        System.out.println("Robot worker working");
    }
}
