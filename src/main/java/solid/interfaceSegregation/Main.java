package main.java.solid.interfaceSegregation;

// Bir sınıf, kullanmadığı metotları içeren bir arayüze bağımlı olmamalıdır.

public class Main {
    public static void main(String[] args) {
        Eatable humanWorker  = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.eat();
        ((Workable) humanWorker).work();

        robotWorker.work();
    }
}

/*
// Bu arayüz ISP'yi ihlal ediyor çünkü tüm metotlar her sınıf için gerekli olmayabilir.
interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    // Robotların yemek yeme yeteneği olmadığı için bu metodun implementasyonu anlamsız.
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
 */