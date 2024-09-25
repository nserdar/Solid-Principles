package main.java.solid.interfaceSegregation;

// İnsan sınıfı hem çalışabilen hem de yemek yiyebilen bir işçidir

public class HumanWorker implements Eatable,Workable{
    @Override
    public void eat() {
        System.out.println( "Human is eating");
    }

    @Override
    public void work() {
        System.out.println("Human is working");
    }
}
