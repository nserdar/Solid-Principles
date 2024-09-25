package main.java.solid.openClosed;
/*
Sınıflar, genişletilmeye açık ancak değiştirilmeye kapalı olmalıdır
Bu, bir sınıfın mevcut kodunu değiştirmeden yeni işlevsellikler ekleyebilmemiz
 gerektiği anlamına gelir. Bunu sağlamak için genellikle soyutlama ve
 kalıtım kullanılır.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(2);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
    }
}

/*
Bu kod, Open/Closed prensibini ihlal eder. Eğer yeni bir şekil eklersek,
 AreaCalculator sınıfında kodu değiştirmek zorunda kalacağız. Bu da
 “değiştirmeye kapalı” kuralını çiğnemiş oluyor.

class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        double area = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.length * rectangle.width;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            area = Math.PI * circle.radius * circle.radius;
        }
        return area;
    }
}
 */