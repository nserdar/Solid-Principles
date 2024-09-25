package main.java.solid.liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        sparrow.eat();

        if (sparrow instanceof Flyable){
            ((Flyable) sparrow).fly();
        }

        ostrich.eat();
    }
}

/*
Bu örnekte, Ostrich sınıfı, Bird sınıfından türemiştir, ancak devekuşları uçamaz.
 Ostrich sınıfının, üst sınıf olan Bird‘ün fly() metodunu desteklememesi, LSP’yi ihlal eder.
  Çünkü bir Ostrich, bir Bird’ün yerine kullanılamaz.

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Devekuşları uçamaz, bu yüzden fly metodunu destekleyemiyoruz.
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
 */