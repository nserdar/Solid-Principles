package main.java.solid.dependencyInversion;

/*
	•Yüksek seviyeli modüller (iş süreçleri veya iş kuralları) düşük seviyeli modüllere (detaylara) bağlı olmamalıdır.
	 İkisi de soyutlamalara (arayüzlere veya soyut sınıflara) bağlı olmalıdır.
	•Soyutlamalar (arayüzler veya soyut sınıflar) detaylara bağlı olmamalıdır; detaylar soyutlamalara bağlı olmalıdır.

Bu prensip, bağımlılıkları soyut arayüzler veya soyut sınıflar üzerinden yönlendirerek, sınıfların birbirine sıkı sıkıya
 bağlı olmasını engeller. DIP, modüller arasındaki bağımlılıkların
daha esnek olmasını sağlar ve sınıflar arasında gevşek bir bağ kurar.

DIP’yi uygulamak için düşük seviyeli modülleri soyutlamalara bağlamalıyız. Yani BusinessLogic sınıfı,
 Keyboard ve Monitor gibi düşük seviyeli sınıflara doğrudan bağımlı olmamalıdır.
 Bunun yerine, soyut arayüzlere bağımlı olmalıdır.
 */

public class Main {
    public static void main(String[] args) {
        // Giriş ve çıkış cihazları (düşük seviyeli modüller) soyutlamalarla bağlanıyor
        InputDevice keyboard = new Keyboard();
        OutputDevice monitor = new Monitor();

        BusinessLogic logic = new BusinessLogic(keyboard, monitor);

        logic.run();
    }
}

/*
 Yüksek seviyeli bir modül (BusinessLogic) doğrudan düşük seviyeli modüllere (Concrete sınıflar) bağlıdır:

// Düşük seviyeli modül
class Keyboard {
    public String input() {
        return "Keyboard input";
    }
}

// Düşük seviyeli modül
class Monitor {
    public void display(String content) {
        System.out.println("Displaying: " + content);
    }
}

// Yüksek seviyeli modül
class BusinessLogic {
    private Keyboard keyboard;
    private Monitor monitor;

    public BusinessLogic() {  -> BusinessLogic sınıfı doğrudan Keyboard ve Monitor sınıflarına bağlıdır.
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }

    public void run() {
        String input = keyboard.input();
        monitor.display(input);
    }
}

public class Main {
    public static void main(String[] args) {
        BusinessLogic logic = new BusinessLogic();
        logic.run();
    }
}

Bu örnekte BusinessLogic sınıfı doğrudan Keyboard ve Monitor sınıflarına bağlıdır.
 Eğer farklı bir giriş cihazı (örneğin bir fare) veya farklı bir ekran cihazı kullanmak istersek,
 BusinessLogic sınıfını değiştirmek zorunda kalırız. Bu DIP’yi ihlal eder.
 */